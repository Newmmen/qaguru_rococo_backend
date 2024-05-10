package rococo.test.artist;


import java.io.IOException;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openapitools.client.model.ArtistDto;
import org.openapitools.client.model.Pageable;
import rococo.jupiter.annotation.ApiLogin;
import rococo.jupiter.extention.ApiLoginExtension;
import rococo.jupiter.extention.ContextHolderExtension;
import rococo.jupiter.extention.CreateUserExtension;
import rococo.pages.ArtistPage;

import static rococo.utils.DataUtils.generateRandomArtistName;
import static rococo.utils.DataUtils.generateRandomSentence;

@Tag("tests")
@ExtendWith({ContextHolderExtension.class, CreateUserExtension.class, ApiLoginExtension.class})
public class ArtistTests {
    private Pageable pageable = new Pageable();


    @BeforeEach
    void setUp() {
        pageable.setSize(10);
        pageable.setPage(0);
    }


    @Test
    @ApiLogin
    @DisplayName("check created artist placed on artist tab")
    void checkCreatedArtistInAllArtistList() {
        ArtistDto artistDto = new ArtistDto();
        artistDto.setName("ssssssssss");
        artistDto.setPhoto("images/artistPic.png");
        artistDto.setBiography("12312414141343");

        Selenide.open(ArtistPage.URL, ArtistPage.class)
                .waitForPageLoaded()
                .clickCreateArtistTab()
                .fillArtistFieldsWithData(artistDto)
                .clickSubmitButton()
                .waitForPageLoaded()
                .findArtistOnArtistPage(artistDto.getName());
    }

    @Test
    @ApiLogin
    @DisplayName("check artist can be updated")
    void checkArtistCanBeUpdated() {
        ArtistDto artistDto = new ArtistDto();
        artistDto.setName("ssssssssss");
        artistDto.setPhoto("images/artistPic.png");
        artistDto.setBiography("12312414141343");

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
                .openArtistInfo(artistDto.getName())
                .clickOnEditButton()
                .fillArtistFieldsWithData(newArtist)
                .clickSubmitButton();

        new ArtistPage().checkArtistInfoContainsExpectedFields(newArtist);
    }
}
