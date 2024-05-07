package rococo.test.api;


import java.io.IOException;
import java.util.UUID;

import rococo.jupiter.UsersQueueExtension;
import rococo.jupiter.annotation.ApiLogin;
import rococo.jupiter.extention.ApiLoginExtension;
import rococo.jupiter.extention.ContextHolderExtension;
import rococo.jupiter.extention.CreateUserExtension;
import rococo.pages.LoginPage;
import rococo.pages.MainPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import rococo.test.BaseWebTest;


@ExtendWith({ContextHolderExtension.class, CreateUserExtension.class, ApiLoginExtension.class})
public class ArtistTest extends BaseWebTest {

    private org.openapitools.client.api.ArtistControllerApi apiClient;
    private org.openapitools.client.model.Pageable pageable = new org.openapitools.client.model.Pageable();


    @BeforeEach
    void setUp() {
        apiClient = new org.openapitools.client.ApiClient().createService(org.openapitools.client.api.ArtistControllerApi.class);
    }

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Check user with friend has correct text in friend's table")
    void checkAllArtistCanBeSeen() throws IOException {
        pageable.setPage(18);
        pageable.setSize(0);
        //apiClient.getAllArtists(pageable, null).execute();
        apiClient.getArtist(UUID.fromString("960421e0-42de-4ac8-9c73-355f0855fcf5")).execute();
    }
    @Test
    @DisplayName("Check user with friend has correct text in friend's table")
    @ApiLogin(username = "admin", password = "admin")
    void checkApiLogin() throws IOException {
        //org.openapitools.client.model.ArtistDto artistDto = apiClient.getArtist(UUID.fromString("960421e0-42de-4ac8" +
              //  "-9c73-355f0855fcf5")).execute().body();
       // artistDto.setName("ZZZZZZZZZ");
       // apiClient.updateArtist(artistDto).execute();


        //apiClient.getAllArtists(pageable, null).execute();
        //apiClient.getArtist(UUID.fromString("960421e0-42de-4ac8-9c73-355f0855fcf5")).execute();
    }

}
