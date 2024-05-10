package rococo.test.museum;


import com.codeborne.selenide.Selenide;
import org.openapitools.client.model.NewMuseumDto;
import org.openapitools.client.model.MuseumDto;
import rococo.jupiter.annotation.ApiLogin;
import rococo.jupiter.extention.ApiLoginExtension;
import rococo.jupiter.extention.ContextHolderExtension;
import rococo.jupiter.extention.CreateUserExtension;
import rococo.pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import rococo.pages.MuseumPage;

import static rococo.utils.DataUtils.generateRandomMuseumName;
import static rococo.utils.DataUtils.generateRandomSentence;


@ExtendWith({ContextHolderExtension.class, CreateUserExtension.class, ApiLoginExtension.class})
public class MuseunTest {

    @Test
    @ApiLogin
    @DisplayName("create museum via UI")
    void createMuseum() {
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
    }

    @Test
    @ApiLogin
    @DisplayName("update created museum via UI")
    void updateMuseum() {
        MuseumDto museumDto = new MuseumDto();
        museumDto.setTitle(generateRandomMuseumName());
        museumDto.setPhoto("images/artistPic.png");
        museumDto.setDescription(generateRandomSentence(11));

        String newCountry = "Россия";
        MuseumDto updatedMuseum = new MuseumDto();
        updatedMuseum.setTitle(generateRandomMuseumName());
        updatedMuseum.setDescription(generateRandomSentence(11));
        updatedMuseum.setPhoto("images/anotherPic.png");

        Selenide.open(MuseumPage.URL, MuseumPage.class)
                .waitForPageLoaded()
                .clickCreatePaintingButton()
                .fillMuseumFieldsWithData(museumDto, "Казахстан")
                .clickSubmitButton()
                .waitForPageLoaded()
                .findMuseumOnMuseumsPage(museumDto.getTitle())
                .openMuseumInfo(museumDto.getTitle())
                .clickOnUpdateButton()
                .fillMuseumFieldsWithData(updatedMuseum, newCountry)
                .clickSubmitButton();

        new MuseumPage().checkMuseumInfoContainsExpectedFields(updatedMuseum, newCountry);
    }
}
