package rococo.test.painting;


import java.io.IOException;
import java.util.UUID;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openapitools.client.api.ArtistControllerApi;
import org.openapitools.client.model.Pageable;
import rococo.apisteps.ArtistApiStep;
import org.openapitools.client.model.MuseumDto;
import org.openapitools.client.model.NewMuseumDto;
import org.openapitools.client.model.NewMuseumDto;
import org.openapitools.client.model.NewPaintingDto;
import org.openapitools.client.model.CreatedPaintingDto;
import org.openapitools.client.model.CountryDto;
import org.openapitools.client.model.NewArtistDto;
import org.openapitools.client.model.GeolocationDto;
import org.openapitools.client.model.ArtistDto;
import rococo.apisteps.MuseumApiStep;
import rococo.apisteps.PaintingApiStep;
import rococo.jupiter.annotation.ApiForClientLogin;
import rococo.jupiter.annotation.ApiLogin;
import rococo.jupiter.extention.ApiForClientExtension;
import rococo.jupiter.extention.ContextHolderExtension;

import static rococo.utils.DataUtils.generateRandomMuseumName;
import static rococo.utils.DataUtils.generateRandomPaintingName;
import static rococo.utils.DataUtils.generateRandomSentence;
import static rococo.utils.DataUtils.getSamplePhoto;

@Tag("tests")
@ExtendWith({ContextHolderExtension.class,  ApiForClientExtension.class})
public class PaintingApiTests {
    private final PaintingApiStep paintingApiStep = new PaintingApiStep();
    private final ArtistApiStep artistApiStep = new ArtistApiStep();
    private final MuseumApiStep museumApiStep = new MuseumApiStep();

    private ArtistControllerApi apiClient;
    private Pageable pageable = new Pageable();


    @BeforeEach
    void setUp() {
        pageable.setSize(10);
        pageable.setPage(0);
    }


    @AfterEach
    void closeWebdriver(){
        Selenide.closeWebDriver();
    }

    @Test
    @ApiForClientLogin
    @DisplayName("create painting by api")
    void createPaintingByApi() throws IOException {
        GeolocationDto geolocationDto = new GeolocationDto();
        CountryDto countryDto = museumApiStep.getCountryByName(pageable, "Россия");

        geolocationDto.setCity("Москва");
        geolocationDto.setCountry(countryDto);
        NewMuseumDto newMuseumDto = new NewMuseumDto();
        newMuseumDto.setTitle(generateRandomMuseumName());
        newMuseumDto.setGeo(geolocationDto);
        newMuseumDto.setPhoto("images/artistPic.png");
        newMuseumDto.setDescription(generateRandomSentence(11));
        UUID museumId = museumApiStep.createNewMuseum(newMuseumDto).getId();

        String photo = getSamplePhoto();
        NewArtistDto artistDto = new NewArtistDto();
        artistDto.setName("ArtistName");
        artistDto.setPhoto(photo);
        artistDto.setBiography("ArtistBiography");

        UUID artistId = artistApiStep.createArtist(artistDto).getId();

        NewPaintingDto paintingDto = new NewPaintingDto();
        paintingDto.setArtist(artistApiStep.getArtist(artistId));
        paintingDto.setMuseum(museumApiStep.getMuseum(museumId));
        paintingDto.setContent(getSamplePhoto());
        paintingDto.setTitle(generateRandomPaintingName());
        paintingDto.setDescription(generateRandomSentence(11));

        CreatedPaintingDto createdPaintingDto = paintingApiStep.createPainting(paintingDto);
        paintingApiStep.assertCreatedPaintingEqualsExpected(createdPaintingDto, paintingDto);
    }

}
