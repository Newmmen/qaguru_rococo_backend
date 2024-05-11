package rococo.test.artist;


import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openapitools.client.model.ArtistDto;
import rococo.jupiter.annotation.ApiLogin;
import rococo.jupiter.annotation.DbUser;
import rococo.jupiter.extention.ApiLoginExtension;
import rococo.jupiter.extention.ContextHolderExtension;
import rococo.jupiter.extention.CreateUserExtension;
import rococo.pages.ArtistPage;

import static rococo.utils.DataUtils.generateRandomArtistName;
import static rococo.utils.DataUtils.generateRandomSentence;

@Tag("UI")
@DisplayName("UI tests artist features")
@ExtendWith({ContextHolderExtension.class, CreateUserExtension.class, ApiLoginExtension.class})
public class ArtistTests {

    @AfterEach
    void closeWebdriver() {
        Selenide.closeWebDriver();
    }

    @Test
    @ApiLogin(user = @DbUser())
    @DisplayName("check created artist placed on artist tab")
    void checkCreatedArtistInAllArtistList() {
        ArtistDto artistDto = new ArtistDto();
        artistDto.setName(generateRandomArtistName());
        artistDto.setPhoto("images/artistPic.png");
        artistDto.setBiography(generateRandomSentence(11));

        Selenide.open(ArtistPage.URL, ArtistPage.class)
                .waitForPageLoaded()
                .clickCreateArtistTab()
                .fillArtistFieldsWithData(artistDto)
                .clickSubmitButton()
                .waitForPageLoaded()
                .findArtistOnArtistPage(artistDto.getName());
    }

    @Test
    @ApiLogin(user = @DbUser())
    @DisplayName("check artist can be updated")
    void checkArtistCanBeUpdated() {
        ArtistDto artistDto = new ArtistDto();
        artistDto.setName(generateRandomArtistName());
        artistDto.setPhoto("images/artistPic.png");
        artistDto.setBiography(generateRandomSentence(11));

        ArtistDto newArtist = new ArtistDto();
        newArtist.setName(generateRandomArtistName());
        newArtist.setBiography(generateRandomSentence(11));
        newArtist.setPhoto("images/anotherPic.png");

        Selenide.open(ArtistPage.URL, ArtistPage.class)
                .waitForPageLoaded()
                .clickCreateArtistTab()
                .fillArtistFieldsWithData(artistDto)
                .clickSubmitButton()
                .waitForPageLoaded()
                .findArtistOnArtistPage(artistDto.getName())
                .openArtistInfo()
                .clickOnEditButton()
                .fillArtistFieldsWithData(newArtist)
                .clickSubmitButton();

        new ArtistPage().checkArtistInfoContainsExpectedFields(newArtist);
    }
}
