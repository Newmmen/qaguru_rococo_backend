package rococo.apisteps;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.UUID;

import io.qameta.allure.Step;
import org.openapitools.client.ApiClient;
import org.openapitools.client.api.PaintingControllerApi;
import org.openapitools.client.model.PaintingDto;
import org.openapitools.client.model.NewPaintingDto;
import org.openapitools.client.model.Pageable;


public class PaintingApiStep {
    private final PaintingControllerApi paintingControllerApi =
            new ApiClient().createService(PaintingControllerApi.class);

    @Step("try to get all paintings and return response code")
    public int getAllPaintingsResponseCode(Pageable pageable, @Nullable String name) throws IOException {
        return paintingControllerApi.getAllPaintings(pageable, name).execute().code();
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
}
