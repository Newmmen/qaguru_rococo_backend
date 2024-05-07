package rococo.test;


import com.codeborne.selenide.Selenide;

import rococo.jupiter.annotation.ApiLogin;
import rococo.jupiter.extention.ApiLoginExtension;
import rococo.jupiter.extention.ContextHolderExtension;
import rococo.jupiter.extention.CreateUserExtension;
import rococo.pages.ArtistPage;
import rococo.pages.LoginPage;
import rococo.pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


@ExtendWith({ContextHolderExtension.class, CreateUserExtension.class, ApiLoginExtension.class})
public class ArtistTests {
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    ArtistPage artistPage = new ArtistPage();


    @Test
    @ApiLogin(username = "admin", password = "admin")
    @DisplayName("Check user with friend has correct text in friend's table")
    void checkUserWithSentRequestHasNoFriendsInTable() {
        org.openapitools.client.model.ArtistDto artistDto = new org.openapitools.client.model.ArtistDto();
        artistDto.setName("ssssssssss");
        artistDto.setPhoto("images/artistPic.png");
        artistDto.setBiography("12312414141343");

        Selenide.open(MainPage.URL);
        mainPage.clickEnter()
                .waitForPageLoaded();
        artistPage.clickArtistTab()
                .waitForPageLoaded();
        artistPage.createArtist(artistDto);
        mainPage.checkAvatarPicture();
    }

}
