package rococo.jupiter.extention;

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
import rococo.db.model.UserAuthEntity;
import rococo.jupiter.annotation.ApiForClientLogin;
import rococo.model.CredsDto;
import rococo.model.UserType;
import rococo.utils.OauthUtils;

public class ApiForClientExtension implements BeforeEachCallback, AfterTestExecutionCallback {

    private final AuthApiForClient authApiClient = new AuthApiForClient();

    public static final ExtensionContext.Namespace NAMESPACE =
            ExtensionContext.Namespace.create(ApiForClientExtension.class);




    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        ApiForClientLogin apiLogin = AnnotationSupport.findAnnotation(
                extensionContext.getRequiredTestMethod(),
                ApiForClientLogin.class
        ).orElse(null);

        if (apiLogin != null) {
            final String codeVerifier = OauthUtils.generateCodeVerifier();
            final String codeChallenge = OauthUtils.generateCodeChallange(codeVerifier);
            String userName;
            String password;
            if (apiLogin.user().runnable()) {
                Map createdUser = extensionContext.getStore(CreateUserExtension.DB_CREATE_USER_NAMESPACE)
                        .get(extensionContext.getUniqueId(), Map.class);
                UserAuthEntity userAuthEntity = ((UserAuthEntity) createdUser.get("auth"));
                userName = userAuthEntity.getUsername();
                password = userAuthEntity.getPassword();
            } else {
                userName = apiLogin.username();
                password = apiLogin.password();
            }

            setCodeVerifier(extensionContext, codeVerifier);
            setCodChallenge(extensionContext, codeChallenge);
            authApiClient.doLogin(extensionContext, userName, password);
            BearerStorage.storeBearer(getToken(extensionContext));
        }
    }

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        ThreadSafeCookieManager.INSTANCE.removeAll();
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
