package rococo.test.museum;


import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openapitools.client.model.MuseumDto;
import org.openapitools.client.model.NewMuseumDto;
import org.openapitools.client.model.Pageable;
import rococo.apisteps.MuseumApiStep;

@Tag("API")
@DisplayName("Test museum API controllers validation")
public class MuseumValidationTest {
    private final MuseumApiStep museumApiStep = new MuseumApiStep();
    private final Pageable pageable = new Pageable();

    private final int HTTP_SUCCESSFUL = 200;
    private final int HTTP_UNAUTHORIZED = 401;


    @Test
    @DisplayName("check unauthorized user can get all museums")
    void checkUnauthorizedUserCanGetAllMuseums() throws IOException {
        pageable.setPage(18);
        pageable.setSize(0);

        int code = museumApiStep.getAllMuseumResponseCode(pageable, null);
        Assertions.assertEquals(HTTP_SUCCESSFUL, code);
    }

    @Test
    @DisplayName("check unauthorized user cannot get all countries")
    void checkUnauthorizedUserCannotGetAllCountries() throws IOException {
        pageable.setPage(18);
        pageable.setSize(0);

        int code = museumApiStep.tryToGetAllCountries(pageable);
        Assertions.assertEquals(HTTP_UNAUTHORIZED, code);
    }

    @Test
    @DisplayName("Check unauthorized user cannot create new museum")
    void checkUnauthorizedUserCannotCreateMuseum() throws IOException {
        NewMuseumDto museumDto = new NewMuseumDto();

        int code = museumApiStep.tryToCreateNewMuseum(museumDto);
        Assertions.assertEquals(HTTP_UNAUTHORIZED, code);
    }

    @Test
    @DisplayName("Check unauthorized user cannot update new museum")
    void checkUnauthorizedUserCannotUpdateMuseum() throws IOException {
        MuseumDto museumDto = new MuseumDto();

        int code = museumApiStep.tryToUpdateMuseum(museumDto);
        Assertions.assertEquals(HTTP_UNAUTHORIZED, code);
    }
}
