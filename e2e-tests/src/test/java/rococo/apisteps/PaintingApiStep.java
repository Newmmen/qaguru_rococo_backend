package rococo.apisteps;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.UUID;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openapitools.client.ApiClient;
import org.openapitools.client.api.PaintingControllerApi;
import org.openapitools.client.model.CreatedPaintingDto;
import org.openapitools.client.model.PaintingDto;
import org.openapitools.client.auth.HttpBearerAuth;
import org.openapitools.client.model.NewPaintingDto;
import org.openapitools.client.model.Pageable;
import rococo.jupiter.extention.BearerStorage;


public class PaintingApiStep {
    private final ApiClient apiClient = new ApiClient().addAuthorization("api", new HttpBearerAuth("bearer"));

    private final PaintingControllerApi paintingControllerApi =
            new ApiClient().createService(PaintingControllerApi.class);

    @Step("try to get all paintings and return response code")
    public int getAllPaintingsResponseCode(Pageable pageable, @Nullable String name) throws IOException {
        return paintingControllerApi.getAllPaintings(pageable, name).execute().code();
    }

    @Step("create painting")
    public CreatedPaintingDto createPainting(NewPaintingDto newPaintingDto) throws IOException {
        apiClient.setBearerToken(BearerStorage.getCurrentBearer());
        PaintingControllerApi api = apiClient.createService(PaintingControllerApi.class);
        return api.createPainting(newPaintingDto).execute().body();
    }

    @Step("try to create new painting")
    public int tryToCreateNewPainting(NewPaintingDto paintingDto) throws IOException {
        return paintingControllerApi.createPainting(paintingDto).execute().code();
    }

    @Step("try to update painting")
    public int tryToUpdatePainting(PaintingDto paintingDto) throws IOException {
        return paintingControllerApi.updatePainting(paintingDto).execute().code();
    }
    @Step("try to get all painting by author")
    public int tryToGetAllPaintingsByAuthor(UUID artistId, Pageable pageable) throws IOException {
        return paintingControllerApi.getByAuthorId(artistId, pageable).execute().code();
    }

    @Step("assert created painting dto equals expected")
    public void assertCreatedPaintingEqualsExpected(CreatedPaintingDto createdPaintingDto, NewPaintingDto expected)  {

        Assertions.assertAll("Assert painting created correctly",
                () -> Assertions.assertEquals(expected.getTitle(), createdPaintingDto.getTitle()),
                () -> Assertions.assertEquals(expected.getArtist(), createdPaintingDto.getArtistDto()),
                () -> Assertions.assertEquals(expected.getMuseum(), createdPaintingDto.getMuseumDto()),
                () -> Assertions.assertEquals(expected.getDescription(), createdPaintingDto.getDescription()),
                () -> Assertions.assertEquals(expected.getContent(), createdPaintingDto.getContent())
        );

    }
}
