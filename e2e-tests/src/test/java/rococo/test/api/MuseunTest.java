package rococo.test.api;


import rococo.jupiter.UsersQueueExtension;
import rococo.pages.LoginPage;
import rococo.pages.MainPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


@ExtendWith(UsersQueueExtension.class)
public class MuseunTest {

    private org.openapitools.client.api.MuseumControllerApi apiClient;
    private org.openapitools.client.model.Pageable pageable = new org.openapitools.client.model.Pageable();


    @BeforeEach
    void setUp() {
        apiClient = new org.openapitools.client.ApiClient().createService(org.openapitools.client.api.MuseumControllerApi.class);
    }

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Check user with friend has correct text in friend's table")
    void checkAllMuseumsCanBeSeen() {


    }

}
