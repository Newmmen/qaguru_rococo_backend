package rococo.jupiter.extention;

import java.util.Map;

import com.codeborne.selenide.LocalStorage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.platform.commons.support.AnnotationSupport;
import org.openqa.selenium.Cookie;
import rococo.api.AuthApiClient;
import rococo.api.cookie.ThreadSafeCookieManager;
import rococo.config.Config;
import rococo.db.model.UserEntity;
import rococo.jupiter.annotation.ApiLogin;
import rococo.utils.OauthUtils;

public class ApiLoginExtension implements BeforeEachCallback, AfterTestExecutionCallback {

    private static final Config CFG = Config.getInstance();
    private final AuthApiClient authApiClient = new AuthApiClient();

    public static final ExtensionContext.Namespace NAMESPACE =
            ExtensionContext.Namespace.create(ApiLoginExtension.class);


    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        ApiLogin apiLogin = AnnotationSupport.findAnnotation(
                extensionContext.getRequiredTestMethod(),
                ApiLogin.class
        ).orElse(null);

        if (apiLogin != null) {
            final String codeVerifier = OauthUtils.generateCodeVerifier();
            final String codeChallenge = OauthUtils.generateCodeChallange(codeVerifier);
            String userName;
            if (apiLogin.user().runnable()) {
                Map createdUser = extensionContext.getStore(CreateUserExtension.DB_CREATE_USER_NAMESPACE)
                        .get(extensionContext.getUniqueId(), Map.class);
                UserEntity userAuthEntity = ((UserEntity) createdUser.get("auth"));
                userName = userAuthEntity.getUsername();
            } else {
                userName = apiLogin.username();
            }

            setCodeVerifier(extensionContext, codeVerifier);
            setCodChallenge(extensionContext, codeChallenge);
            authApiClient.doLogin(extensionContext, userName, "12345");

            Selenide.open(CFG.frontUrl());
            LocalStorage localStorage = Selenide.localStorage();

            localStorage.setItem(
                    "codeChallenge", getCodChallenge(extensionContext)
            );
            localStorage.setItem(
                    "id_token", getToken(extensionContext)
            );
            localStorage.setItem(
                    "codeVerifier", getCodeVerifier(extensionContext)
            );

            WebDriverRunner.getWebDriver().manage().addCookie(
                    jsessionCookie()
            );
            BearerStorage.storeBearer(getToken(extensionContext));

            Selenide.refresh();
        }
    }

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        ThreadSafeCookieManager.INSTANCE.removeAll();
    }

    public static void setCodeVerifier(ExtensionContext context, String codeVerifier) {
        context.getStore(ApiLoginExtension.NAMESPACE).put("code_verifier", codeVerifier);
    }

    public static void setCodChallenge(ExtensionContext context, String codeChallenge) {
        context.getStore(ApiLoginExtension.NAMESPACE).put("code_challenge", codeChallenge);
    }

    public static void setCode(ExtensionContext context, String code) {
        context.getStore(ApiLoginExtension.NAMESPACE).put("code", code);
    }

    public static void setToken(ExtensionContext context, String token) {
        context.getStore(ApiLoginExtension.NAMESPACE).put("token", token);
    }

    public static String getCodeVerifier(ExtensionContext context) {
        return context.getStore(ApiLoginExtension.NAMESPACE).get("code_verifier", String.class);
    }

    public static String getCodChallenge(ExtensionContext context) {
        return context.getStore(ApiLoginExtension.NAMESPACE).get("code_challenge", String.class);
    }

    public static String getCode(ExtensionContext context) {
        return context.getStore(ApiLoginExtension.NAMESPACE).get("code", String.class);
    }

    public static String getToken(ExtensionContext context) {
        return context.getStore(ApiLoginExtension.NAMESPACE).get("token", String.class);
    }

    public static String getCsrfToken() {
        return ThreadSafeCookieManager.INSTANCE.getCookieValue("XSRF-TOKEN");
    }

    public Cookie jsessionCookie() {
        return new Cookie(
                "JSESSIONID",
                ThreadSafeCookieManager.INSTANCE.getCookieValue("JSESSIONID")
        );
    }

}
