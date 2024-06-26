package rococo.apisteps;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.UUID;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openapitools.client.ApiClient;
import org.openapitools.client.api.ArtistControllerApi;
import org.openapitools.client.auth.HttpBearerAuth;
import org.openapitools.client.model.ArtistDto;
import org.openapitools.client.model.NewArtistDto;
import org.openapitools.client.model.Pageable;
import rococo.jupiter.extention.BearerStorage;


public class ArtistApiStep {
    private final HttpBearerAuth httpBearerAuth = new HttpBearerAuth("bearer");
    private final ApiClient apiClient = new ApiClient().addAuthorization("api", httpBearerAuth);

    private final ArtistControllerApi artistControllerApi = new ApiClient().createService(ArtistControllerApi.class);

    @Step("try to get all artist and return response code")
    public int getAllArtistResponseCode(Pageable pageable, @Nullable String name) throws IOException {
        return artistControllerApi.getAllArtists(pageable, name).execute().code();
    }

    @Step("create artist")
    public ArtistDto createArtist(NewArtistDto artistDto) throws IOException {
        apiClient.setBearerToken(BearerStorage.getCurrentBearer());
        ArtistControllerApi api = apiClient.createService(ArtistControllerApi.class);
        return api.createArtist(artistDto).execute().body();
    }

    @Step("get artist")
    public ArtistDto getArtist(UUID uuid) throws IOException {
        apiClient.setBearerToken(BearerStorage.getCurrentBearer());
        ArtistControllerApi api = apiClient.createService(ArtistControllerApi.class);
        return api.getArtist(uuid).execute().body();
    }

    @Step("update artist")
    public ArtistDto updateArtist(ArtistDto artistDto) throws IOException {
        apiClient.setBearerToken(BearerStorage.getCurrentBearer());
        ArtistControllerApi api = apiClient.createService(ArtistControllerApi.class);
        return api.updateArtist(artistDto).execute().body();
    }

    @Step("try to create new artist")
    public int tryToCreateNewArtist(NewArtistDto artistDto) throws IOException {
        return artistControllerApi.createArtist(artistDto).execute().code();
    }

    @Step("try to update artist")
    public int tryToUpdateArtist(ArtistDto artistDto) throws IOException {
        return artistControllerApi.updateArtist(artistDto).execute().code();
    }

    @Step("assert artist equals expected")
    public void assertArtistEqualsExpected(ArtistDto expected, ArtistDto actual) {
        Assertions.assertAll("Assert artists are equal",
                () -> Assertions.assertEquals(expected.getName(), actual.getName()),
                () -> Assertions.assertEquals(expected.getBiography(), actual.getBiography()),
                () -> Assertions.assertEquals(expected.getPhoto(), actual.getPhoto())
        );
    }
}
