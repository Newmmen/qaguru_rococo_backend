package rococo.test.auth;


import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import rococo.pages.LoginPage;

import static rococo.utils.DataUtils.generateRandomPassword;
import static rococo.utils.DataUtils.generateRandomUsername;

@Tag("UI")
@DisplayName("UI Authorization tests")
public class AuthTest {

    @BeforeEach
    void clean() {
        Selenide.closeWebDriver();
    }

    @Test
    @DisplayName("successfully login with data")
    void login() {
        Selenide.open(LoginPage.URL, LoginPage.class)
                .clickEnterButton()
                .doUiLoginWithData("admin", "admin")
                .waitForPageLoaded()
                .checkAvatarPicture();
    }

    @Test
    @DisplayName("try to login with bad credentials")
    void loginWithBadCredentials() {
        Selenide.open(LoginPage.URL, LoginPage.class)
                .clickEnterButton()
                .doUiLoginWithData("wrong", "wrong");
        new LoginPage().checkBadCredentialErrorVisible();
    }

    @Test
    @DisplayName("successfully sign up")
    void signUpSuccessfully() {
        String username = generateRandomUsername();
        String password = generateRandomPassword();
        Selenide.open(LoginPage.URL, LoginPage.class)
                .clickEnterButton()
                .clickSignUpButton()
                .doSignUpWithData(username, password)
                .clickFormSubmitButton()
                .doUiLoginWithData(username, password)
                .checkAvatarPicture();
    }
}
