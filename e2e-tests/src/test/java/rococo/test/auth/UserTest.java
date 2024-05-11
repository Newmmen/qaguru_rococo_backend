package rococo.test.auth;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import rococo.jupiter.annotation.ApiLogin;
import rococo.jupiter.annotation.DbUser;
import rococo.jupiter.extention.ApiLoginExtension;
import rococo.jupiter.extention.ContextHolderExtension;
import rococo.jupiter.extention.CreateUserExtension;
import rococo.pages.MainPage;

import static rococo.utils.DataUtils.generateRandomFirstname;
import static rococo.utils.DataUtils.generateRandomLastname;

@DisplayName("User can create")
@ExtendWith({ContextHolderExtension.class, CreateUserExtension.class, ApiLoginExtension.class})
public class UserTest {

    @Test
    @ApiLogin(user = @DbUser())
    @DisplayName("update user")
    void UpdateUser() {
        String firstname = generateRandomFirstname();
        String lastname = generateRandomLastname();

        Selenide.open(MainPage.URL, MainPage.class)
                .waitForPageLoaded()
                .clickAvatarPic()
                .fillUserWithData(firstname, lastname)
                .clickSubmitButton()
                .clickAvatarPic()
                .checkModalItemVisible();
    }
}
