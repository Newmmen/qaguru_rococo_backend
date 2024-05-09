package rococo.test.museum;


import java.io.IOException;
import java.util.UUID;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openapitools.client.model.MuseumDto;
import org.openapitools.client.model.NewMuseumDto;
import org.openapitools.client.model.Pageable;
import rococo.apisteps.MuseumApiStep;
import rococo.jupiter.annotation.ApiForClientLogin;
import rococo.jupiter.extention.ApiForClientExtension;
import rococo.jupiter.extention.ContextHolderExtension;
import rococo.jupiter.extention.CreateUserExtension;


@ExtendWith({ContextHolderExtension.class, CreateUserExtension.class, ApiForClientExtension.class
})
public class MuseumApiTest {
    private final MuseumApiStep museumApiStep = new MuseumApiStep();
    private Pageable pageable = new Pageable();
    private final int HTTP_SUCCESSFUL = 200;
    private final int HTTP_UNAUTHORIZED = 401;

    @BeforeEach
    void setUp() {
        pageable.setPage(18);
        pageable.setSize(0);
    }

    @Test
    @DisplayName("check unauthorized user can get all museums")
    void checkUnauthorizedUserCanGetAllMuseums() throws IOException {
        int code = museumApiStep.getAllMuseumResponseCode(pageable, null);
        Assertions.assertEquals(HTTP_SUCCESSFUL, code);
    }

    @Test
    @DisplayName("check unauthorized user cannot get all countries")
    void checkUnauthorizedUserCannotGetAllCountries() throws IOException {
        int code = museumApiStep.tryToGetAllCountries(pageable);
        Assertions.assertEquals(HTTP_UNAUTHORIZED, code);
    }

    @Test
    @DisplayName("Check unauthorized user cannot create new museum")
    void checkUnauthorizedUserCannotCreateMuseum() throws IOException {
        NewMuseumDto museumDto = new NewMuseumDto();
        museumDto.setTitle("sample museum name");
        museumDto.setDescription("newartistBio12333");
        museumDto.setPhoto("sample");

        int code = museumApiStep.tryToCreateNewMuseum(museumDto);
        Assertions.assertEquals(HTTP_UNAUTHORIZED, code);
    }

    @Test
    @DisplayName("Check unauthorized user cannot update new museum")
    void checkUnauthorizedUserCannotUpdateMuseum() throws IOException {
        MuseumDto museumDto = new MuseumDto();
        museumDto.setId(UUID.randomUUID());
        museumDto.setTitle("updsteArtist");
        museumDto.setDescription("updsteArtist");
        museumDto.setPhoto("sample");

        int code = museumApiStep.tryToUpdateMuseum(museumDto);
        Assertions.assertEquals(HTTP_UNAUTHORIZED, code);
    }
}
