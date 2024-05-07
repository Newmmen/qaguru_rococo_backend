package rococo.test;


import rococo.jupiter.UsersQueueExtension;

import rococo.pages.LoginPage;
import rococo.pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;




@ExtendWith(UsersQueueExtension.class)
public class FriendsTest {
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Check user with friend has correct text in friend's table")
    void checkUserWithSentRequestHasNoFriendsInTable() {

        loginPage.doUiLoginWithData("admin", "admin");
        mainPage.checkAvatarPicture();
    }

}
