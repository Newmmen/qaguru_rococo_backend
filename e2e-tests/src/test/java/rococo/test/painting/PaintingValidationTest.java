package rococo.test.painting;


import java.io.IOException;
import java.util.UUID;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openapitools.client.model.NewPaintingDto;
import org.openapitools.client.model.PaintingDto;
import org.openapitools.client.model.Pageable;
import rococo.apisteps.MuseumApiStep;
import rococo.apisteps.PaintingApiStep;
import rococo.jupiter.extention.ApiLoginExtension;
import rococo.jupiter.extention.ContextHolderExtension;
import rococo.jupiter.extention.CreateUserExtension;

@DisplayName("painting api validation tests")
public class PaintingValidationTest {
    private final PaintingApiStep paintingApiStep = new PaintingApiStep();
    private Pageable pageable = new Pageable();
    private final int HTTP_SUCCESSFUL = 200;
    private final int HTTP_UNAUTHORIZED = 401;

    @BeforeEach
    void setUp() {
        pageable.setPage(18);
        pageable.setSize(0);
    }

    @Test
    @DisplayName("check unauthorized user can get all paintings")
    void checkUnauthorizedUserCanGetAllPaintings() throws IOException {
        int code = paintingApiStep.getAllPaintingsResponseCode(pageable, null);
        Assertions.assertEquals(HTTP_SUCCESSFUL, code);
    }

    @Test
    @DisplayName("check unauthorized user cannot get all paintings by author")
    void checkUnauthorizedUserCannotGetAllPaintingsByAuthor() throws IOException {
        int code = paintingApiStep.tryToGetAllPaintingsByAuthor(UUID.randomUUID(), pageable);
        Assertions.assertEquals(HTTP_UNAUTHORIZED, code);
    }

    @Test
    @DisplayName("Check unauthorized user cannot create new painting")
    void checkUnauthorizedUserCannotCreatePaintings() throws IOException {
        NewPaintingDto paintingDto = new NewPaintingDto();
        paintingDto.setTitle("sample museum name");
        paintingDto.setDescription("newartistBio12333");
        paintingDto.setContent("sample");

        int code = paintingApiStep.tryToCreateNewPainting(paintingDto);
        Assertions.assertEquals(HTTP_UNAUTHORIZED, code);
    }

    @Test
    @DisplayName("Check unauthorized user cannot update new painting")
    void checkUnauthorizedUserCannotUpdatePaintings() throws IOException {
        PaintingDto paintingDto = new PaintingDto();
        paintingDto.setId(UUID.randomUUID());
        paintingDto.setTitle("updsteArtist");
        paintingDto.setDescription("updsteArtist");
        paintingDto.setContent("sample");

        int code = paintingApiStep.tryToUpdatePainting(paintingDto);
        Assertions.assertEquals(HTTP_UNAUTHORIZED, code);
    }


}
