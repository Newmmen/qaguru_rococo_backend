package rococo.test.artist;


import java.io.IOException;
import java.util.UUID;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openapitools.client.ApiClient;
import org.openapitools.client.model.NewArtistDto;

import org.openapitools.client.api.ArtistControllerApi;
import org.openapitools.client.model.Pageable;
import rococo.apisteps.ArtistApiStep;
import org.openapitools.client.model.ArtistDto;
import rococo.jupiter.extention.ApiLoginExtension;
import rococo.jupiter.extention.ContextHolderExtension;
import rococo.jupiter.extention.CreateUserExtension;
import rococo.test.BaseWebTest;

@Tag("API")
@DisplayName("Test artist API controllers validation")
public class ArtistValidationTest {
    private final ArtistApiStep artistStep = new ArtistApiStep();
    private final int HTTP_SUCCESSFUL = 200;
    private final int HTTP_UNAUTHORIZED = 401;

    @Test
    @DisplayName("check unauthorized user can get all artist")
    void checkUnauthorizedUserCanGetAllArtist() throws IOException {
        Pageable pageable = new Pageable();
        pageable.setPage(18);
        pageable.setSize(0);

        int code = artistStep.getAllArtistResponseCode(pageable, null);
        Assertions.assertEquals(HTTP_SUCCESSFUL, code);
    }

    @Test
    @DisplayName("Check unauthorized user cannot create new artist")
    void checkUnauthorizedUserCannotCreateArtist() throws IOException {
        NewArtistDto artistDto = new NewArtistDto();

        int code = artistStep.tryToCreateNewArtist(artistDto);
        Assertions.assertEquals(HTTP_UNAUTHORIZED, code);
    }

    @Test
    @DisplayName("Check unauthorized user cannot update new artist")
    void checkUnauthorizedUserCannotUpdateArtist() throws IOException {
        ArtistDto artistDto = new ArtistDto();
        artistDto.setId(UUID.randomUUID());

        int code = artistStep.tryToUpdateArtist(artistDto);
        Assertions.assertEquals(HTTP_UNAUTHORIZED, code);
    }


}
