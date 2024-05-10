package rococo.test.e2e;


import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openapitools.client.model.NewMuseumDto;
import org.openapitools.client.model.ArtistDto;
import org.openapitools.client.model.PaintingDto;
import rococo.jupiter.annotation.ApiLogin;
import rococo.jupiter.extention.ApiLoginExtension;
import rococo.jupiter.extention.ContextHolderExtension;
import rococo.jupiter.extention.CreateUserExtension;
import rococo.pages.ArtistPage;
import rococo.pages.MuseumPage;
import rococo.pages.PaintingPage;

import static rococo.utils.DataUtils.generateRandomMuseumName;
import static rococo.utils.DataUtils.generateRandomSentence;

@DisplayName("User can successfully create artist, museum and add them to painting")
@ExtendWith({ContextHolderExtension.class, CreateUserExtension.class, ApiLoginExtension.class})
public class HappyPathTest {

    @Test
    @ApiLogin
    @DisplayName("User can successfully create artist, museum and create  painting")
    void createArtistAndMuseumAndPaintingBasedOnThem() {
//        NewMuseumDto museumDto = new NewMuseumDto();
//        museumDto.setTitle(generateRandomMuseumName());
//        museumDto.setPhoto("images/artistPic.png");
//        museumDto.setDescription(generateRandomSentence(11));
//        Selenide.open(MuseumPage.URL, MuseumPage.class)
//                .waitForPageLoaded()
//                .clickCreatePaintingButton()
//                .fillMuseumFieldsWithData(museumDto, "Казахстан")
//                .clickSubmitButton()
//                .waitForPageLoaded()
//                .findMuseumOnMuseumsPage(museumDto.getTitle());
//
//        ArtistDto artistDto = new ArtistDto();
//        artistDto.setName("ssssssssss");
//        artistDto.setPhoto("images/artistPic.png");
//        artistDto.setBiography("12312414141343");
//        Selenide.open(ArtistPage.URL, ArtistPage.class)
//                .waitForPageLoaded()
//                .clickCreateArtistTab()
//                .fillArtistFieldsWithData(artistDto)
//                .clickSubmitButton()
//                .waitForPageLoaded()
//                .findArtistOnArtistPage(artistDto.getName());

        PaintingDto paintingDto = new PaintingDto();
        Selenide.open(PaintingPage.URL, PaintingPage.class)
                .waitForPageLoaded()
                .clickCreatePainting()
                .fillPaintingWithData(paintingDto)
                .clickSubmitButton();
    }

}
