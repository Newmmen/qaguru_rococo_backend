package rococo.test.painting;


import java.io.IOException;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openapitools.client.ApiClient;
import org.openapitools.client.api.ArtistControllerApi;
import org.openapitools.client.model.ArtistDto;
import org.openapitools.client.model.Pageable;
import rococo.apisteps.ArtistApiStep;
import rococo.jupiter.annotation.ApiLogin;
import rococo.jupiter.extention.ApiForClientExtension;
import rococo.jupiter.extention.ApiLoginExtension;
import rococo.jupiter.extention.ContextHolderExtension;
import rococo.jupiter.extention.CreateUserExtension;
import rococo.pages.ArtistPage;
import rococo.pages.LoginPage;
import rococo.pages.MainPage;

@Tag("tests")
@ExtendWith({ContextHolderExtension.class, CreateUserExtension.class, ApiLoginExtension.class})
public class PaintingTests {
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    private final ArtistPage artistPage = new ArtistPage();
    private final ArtistApiStep artistApiStep = new ArtistApiStep();

    private ArtistControllerApi apiClient;
    private Pageable pageable = new Pageable();


    @BeforeEach
    void setUp() {
        apiClient = new ApiClient().createService(ArtistControllerApi.class);
        pageable.setSize(10);
        pageable.setPage(0);
    }


    @Test
    @ApiLogin
    @DisplayName("Check user with friend has correct text in friend's table")
    void checkCreatedArtistInAllArtistList() throws IOException {
        ArtistDto artistDto = new ArtistDto();
        artistDto.setName("ssssssssss");
        artistDto.setPhoto("images/artistPic.png");
        artistDto.setBiography("12312414141343");

        Selenide.open(ArtistPage.URL, ArtistPage.class)
                .waitForPageLoaded();
        artistPage.fillArtistFieldsWithData(artistDto);
        ArtistDto createdArtist =
                apiClient.getAllArtists(pageable, artistDto.getName()).execute().body().getContent().stream()
                        .filter(artist -> artist.getName().equals(artistDto.getName()))
                        .findFirst()
                        .get();

        Assertions.assertEquals(createdArtist.getName(), artistDto.getName());
        Assertions.assertEquals(createdArtist.getBiography(), artistDto.getBiography());
    }

}
