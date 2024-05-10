package rococo.test.auth;


import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openapitools.client.model.MuseumDto;
import rococo.jupiter.annotation.ApiLogin;
import rococo.jupiter.extention.ApiLoginExtension;
import rococo.jupiter.extention.ContextHolderExtension;
import rococo.jupiter.extention.CreateUserExtension;
import rococo.pages.MuseumPage;

import static rococo.utils.DataUtils.generateRandomMuseumName;
import static rococo.utils.DataUtils.generateRandomSentence;

@DisplayName("User can create ")
@ExtendWith({ContextHolderExtension.class, CreateUserExtension.class, ApiLoginExtension.class})
public class UserTest {

    @Test
    @ApiLogin
    @DisplayName("")
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

}
