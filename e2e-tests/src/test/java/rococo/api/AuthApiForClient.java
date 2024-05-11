package rococo.api;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.extension.ExtensionContext;
import rococo.api.interceptor.CodeForApiInterceptor;
import rococo.jupiter.extention.ApiForClientExtension;

public class AuthApiForClient extends RestClient {

    private final AuthApi authApi;

    public AuthApiForClient() {
        super(
                CFG.authUrl(),
                true,
                new CodeForApiInterceptor()
        );
        authApi = retrofit.create(AuthApi.class);
    }

    public void doLogin(ExtensionContext context, String username, String password) throws Exception {
        authApi.authorize(
                "code",
                "client",
                "openid",
                CFG.frontUrl() + "/authorized",
                ApiForClientExtension.getCodChallenge(context),
                "S256"
        ).execute();

        authApi.login(
                username,
                password,
                ApiForClientExtension.getCsrfToken()
        ).execute();

        JsonNode responseBody = authApi.token(
                "Basic " + new String(Base64.getEncoder().encode("client:secret".getBytes(StandardCharsets.UTF_8))),
                "client",
                "http://127.0.0.1:3000/authorized",
                "authorization_code",
                ApiForClientExtension.getCode(context),
                ApiForClientExtension.getCodeVerifier(context)
        ).execute().body();

        final String token = responseBody.get("id_token").asText();
        ApiForClientExtension.setToken(context, token);
    }
}
