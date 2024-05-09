package rococo.apisteps;

import javax.annotation.Nullable;

import java.io.IOException;

import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeEach;
import org.openapitools.client.api.ArtistControllerApi;
import org.openapitools.client.model.Pageable;
import org.openapitools.client.model.NewArtistDto;
import org.openapitools.client.model.ArtistDto;
import org.openapitools.client.ApiClient;
import org.openapitools.client.auth.HttpBearerAuth;

import rococo.client.HttpClient;
import rococo.jupiter.extention.BearerStorage;


public class ArtistApiStep {
    private final HttpBearerAuth httpBearerAuth = new HttpBearerAuth("bearer");
    private final ApiClient apiClient = new ApiClient();

    private final ArtistControllerApi artistControllerApi = new ApiClient().createService(ArtistControllerApi.class);


    @Step("try to get all artist and return response code")
    public int getAllArtistResponseCode(Pageable pageable, @Nullable String name) throws IOException {
        return artistControllerApi.getAllArtists(pageable, name).execute().code();
    }

    @Step("create artist")
    public ArtistDto createArtist(NewArtistDto artistDto) throws IOException {
        apiClient.addAuthorization("api", httpBearerAuth).setBearerToken(BearerStorage.getCurrentBearer());
        ArtistControllerApi api = apiClient.createService(ArtistControllerApi.class);
        return api.createArtist(artistDto).execute().body();
    }

    @Step("try to create new artist")
    public int tryToCreateNewArtist(NewArtistDto artistDto) throws IOException {
        return artistControllerApi.createArtist(artistDto).execute().code();
    }

    @Step("try to update artist")
    public int tryToUpdateArtist(ArtistDto artistDto) throws IOException {
        return artistControllerApi.updateArtist(artistDto).execute().code();
    }
}
