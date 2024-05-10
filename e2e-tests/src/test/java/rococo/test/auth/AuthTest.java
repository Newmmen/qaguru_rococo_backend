package rococo.test.auth;


import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openapitools.client.model.NewMuseumDto;
import org.openapitools.client.model.MuseumDto;
import rococo.jupiter.annotation.ApiLogin;
import rococo.jupiter.extention.ApiLoginExtension;
import rococo.jupiter.extention.ContextHolderExtension;
import rococo.jupiter.extention.CreateUserExtension;
import rococo.pages.LoginPage;
import rococo.pages.MuseumPage;

import static rococo.utils.DataUtils.generateRandomMuseumName;
import static rococo.utils.DataUtils.generateRandomPassword;
import static rococo.utils.DataUtils.generateRandomSentence;
import static rococo.utils.DataUtils.generateRandomUsername;

@DisplayName("Authorization tests")
public class AuthTest {

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
