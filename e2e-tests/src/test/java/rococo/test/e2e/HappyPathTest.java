package rococo.test.e2e;


import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openapitools.client.model.ArtistDto;
import org.openapitools.client.model.MuseumDto;
import org.openapitools.client.model.PaintingDto;
import rococo.jupiter.annotation.ApiLogin;
import rococo.jupiter.annotation.DbUser;
import rococo.jupiter.extention.ApiLoginExtension;
import rococo.jupiter.extention.ContextHolderExtension;
import rococo.jupiter.extention.CreateUserExtension;
import rococo.pages.ArtistPage;
import rococo.pages.MuseumPage;
import rococo.pages.PaintingPage;

import static rococo.utils.DataUtils.generateRandomArtistName;
import static rococo.utils.DataUtils.generateRandomMuseumName;
import static rococo.utils.DataUtils.generateRandomPaintingName;
import static rococo.utils.DataUtils.generateRandomSentence;

@Tag("UI")
@DisplayName("User can successfully create artist, museum and add them to painting")
@ExtendWith({ContextHolderExtension.class, CreateUserExtension.class, ApiLoginExtension.class})
public class HappyPathTest {

    @AfterEach
    void closeWebdriver() {
        Selenide.closeWebDriver();
    }

    @Test
    @ApiLogin(user = @DbUser())
    @DisplayName("User can successfully create artist, museum and create  painting")
    void createArtistAndMuseumAndPaintingBasedOnThem() {
        MuseumDto museumDto = new MuseumDto();
        museumDto.setTitle(generateRandomMuseumName());
        museumDto.setPhoto("images/artistPic.png");
        museumDto.setDescription(generateRandomSentence(11));
        Selenide.open(MuseumPage.URL, MuseumPage.class)
                .waitForPageLoaded()
                .clickCreatePaintingButton()
                .fillMuseumFieldsWithData(museumDto, "Казахстан")
                .clickSubmitButton()
                .waitForPageLoaded()
                .findMuseumOnMuseumsPage(museumDto.getTitle());

        ArtistDto artistDto = new ArtistDto();
        artistDto.setName(generateRandomArtistName());
        artistDto.setPhoto("images/artistPic.png");
        artistDto.setBiography("12312414141343");
        Selenide.open(ArtistPage.URL, ArtistPage.class)
                .waitForPageLoaded()
                .clickCreateArtistTab()
                .fillArtistFieldsWithData(artistDto)
                .clickSubmitButton()
                .waitForPageLoaded()
                .findArtistOnArtistPage(artistDto.getName());

        PaintingDto paintingDto = new PaintingDto();
        paintingDto.setArtist(artistDto);
        paintingDto.setMuseum(museumDto);
        paintingDto.setContent("images/anotherPic.png");
        paintingDto.setTitle(generateRandomPaintingName());
        paintingDto.setDescription(generateRandomSentence(11));

        Selenide.open(PaintingPage.URL, PaintingPage.class)
                .waitForPageLoaded()
                .clickCreatePainting()
                .fillPaintingWithData(paintingDto)
                .clickSubmitButton()
                .waitForPageLoaded()
                .findPaintingOnPaintingPage(paintingDto.getTitle());
    }

    @Test
    @ApiLogin(user = @DbUser())
    @DisplayName("User can add new painting to artist")
    void createNewPaintingInArtist() {
        MuseumDto museumDto = new MuseumDto();
        museumDto.setTitle(generateRandomMuseumName());
        museumDto.setPhoto("images/artistPic.png");
        museumDto.setDescription(generateRandomSentence(11));
        Selenide.open(MuseumPage.URL, MuseumPage.class)
                .waitForPageLoaded()
                .clickCreatePaintingButton()
                .fillMuseumFieldsWithData(museumDto, "Казахстан")
                .clickSubmitButton();

        ArtistDto artistDto = new ArtistDto();
        artistDto.setName(generateRandomArtistName());
        artistDto.setPhoto("images/artistPic.png");
        artistDto.setBiography(generateRandomSentence(11));

        PaintingDto paintingDto = new PaintingDto();
        paintingDto.setMuseum(museumDto);
        paintingDto.setContent("images/anotherPic.png");
        paintingDto.setTitle(generateRandomPaintingName());
        paintingDto.setDescription(generateRandomSentence(11));

        Selenide.open(ArtistPage.URL, ArtistPage.class)
                .waitForPageLoaded()
                .clickCreateArtistTab()
                .fillArtistFieldsWithData(artistDto)
                .clickSubmitButton()
                .waitForPageLoaded()
                .findArtistOnArtistPage(artistDto.getName())
                .openArtistInfo()
                .clickAddPaintingIntoArtist()
                .fillPaintingWithDataIntoArtist(paintingDto)
                .clickSubmitButton();

        new PaintingPage().checkPaintingIntoArtistPageIsVisible(paintingDto.getTitle());
    }


}
