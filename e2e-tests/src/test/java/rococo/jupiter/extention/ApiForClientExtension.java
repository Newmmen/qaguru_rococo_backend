package rococo.jupiter.extention;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.platform.commons.support.AnnotationSupport;
import rococo.api.AuthApiForClient;
import rococo.api.cookie.ThreadSafeCookieManager;
import rococo.exception.NoDataForTest;
import rococo.jupiter.annotation.ApiForClientLogin;
import rococo.model.CredsDto;
import rococo.model.UserType;
import rococo.utils.OauthUtils;

public class ApiForClientExtension implements BeforeEachCallback, AfterTestExecutionCallback {

    private final AuthApiForClient authApiClient = new AuthApiForClient();

    public static final ExtensionContext.Namespace NAMESPACE =
            ExtensionContext.Namespace.create(ApiForClientExtension.class);
    private static final Map<UserType, Queue<CredsDto>> USERS = new ConcurrentHashMap<>();

    static {
        Queue<CredsDto> defaultUsers = new ConcurrentLinkedQueue<>();
        defaultUsers.add(new CredsDto("apilogin", "admin"));
        defaultUsers.add(new CredsDto("apilogin1", "admin"));
        USERS.put(UserType.DEFAULT, defaultUsers);
    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {

        ApiForClientLogin apiLogin = AnnotationSupport.findAnnotation(
                extensionContext.getRequiredTestMethod(),
                ApiForClientLogin.class).orElseThrow();

        Map<UserType, CredsDto> usersForSave = new HashMap<>();

        CredsDto testCandidate = null;
        int safeCounter = 0;
        Queue<CredsDto> queue = USERS.get(apiLogin.userType());
        while (testCandidate == null && safeCounter < 300) {
            testCandidate = queue.poll();
            if (testCandidate == null) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new NoDataForTest("Cant find unused user for AT");
                }
                safeCounter++;
            }
        }
        if (testCandidate == null) {
            throw new NoDataForTest("Cant find unused user for AT");
        }
        usersForSave.put(apiLogin.userType(), testCandidate);
        extensionContext.getStore(NAMESPACE).put(extensionContext.getUniqueId(), usersForSave);


        final String codeVerifier = OauthUtils.generateCodeVerifier();
        final String codeChallenge = OauthUtils.generateCodeChallange(codeVerifier);
        setCodeVerifier(extensionContext, codeVerifier);
        setCodChallenge(extensionContext, codeChallenge);
        authApiClient.doLogin(extensionContext, testCandidate.userName(), testCandidate.password());
        BearerStorage.storeBearer(getToken(extensionContext));
    }

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        Map<UserType, CredsDto> usersFromTest = (Map<UserType, CredsDto>) extensionContext.getStore(NAMESPACE)
                .get(extensionContext.getUniqueId(), Map.class);

        for (UserType userType : usersFromTest.keySet()) {
            USERS.get(userType).add(usersFromTest.get(userType));
            ThreadSafeCookieManager.INSTANCE.removeAll();
        }
    }

    public static void setCodeVerifier(ExtensionContext context, String codeVerifier) {
        context.getStore(ApiForClientExtension.NAMESPACE).put("code_verifier", codeVerifier);
    }

    public static void setCodChallenge(ExtensionContext context, String codeChallenge) {
        context.getStore(ApiForClientExtension.NAMESPACE).put("code_challenge", codeChallenge);
    }

    public static void setCode(ExtensionContext context, String code) {
        context.getStore(ApiForClientExtension.NAMESPACE).put("code", code);
    }

    public static void setToken(ExtensionContext context, String token) {
        context.getStore(ApiForClientExtension.NAMESPACE).put("token", token);
    }

    public static String getCodeVerifier(ExtensionContext context) {
        return context.getStore(ApiForClientExtension.NAMESPACE).get("code_verifier", String.class);
    }

    public static String getCodChallenge(ExtensionContext context) {
        return context.getStore(ApiForClientExtension.NAMESPACE).get("code_challenge", String.class);
    }

    public static String getCode(ExtensionContext context) {
        return context.getStore(ApiForClientExtension.NAMESPACE).get("code", String.class);
    }

    public static String getToken(ExtensionContext context) {
        return context.getStore(ApiForClientExtension.NAMESPACE).get("token", String.class);
    }

    public static String getCsrfToken() {
        return ThreadSafeCookieManager.INSTANCE.getCookieValue("XSRF-TOKEN");
    }
}
