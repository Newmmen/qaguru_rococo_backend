package rococo.test.museum;


import java.io.IOException;
import java.util.UUID;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openapitools.client.model.CountryDto;
import org.openapitools.client.model.CreatedMuseumDto;
import org.openapitools.client.model.GeolocationDto;
import org.openapitools.client.model.MuseumDto;
import org.openapitools.client.model.NewMuseumDto;
import org.openapitools.client.model.Pageable;
import rococo.apisteps.MuseumApiStep;
import rococo.jupiter.annotation.ApiForClientLogin;
import rococo.jupiter.extention.ApiForClientExtension;
import rococo.jupiter.extention.ContextHolderExtension;

import static rococo.utils.DataUtils.generateRandomMuseumName;
import static rococo.utils.DataUtils.generateRandomSentence;
import static rococo.utils.DataUtils.getAnotherSamplePhoto;
import static rococo.utils.DataUtils.getSamplePhoto;

@Tag("API")
@DisplayName("API museum tests")
@ExtendWith({ContextHolderExtension.class, ApiForClientExtension.class})
public class MuseumApiTest {
    private final MuseumApiStep museumApiStep = new MuseumApiStep();
    private Pageable pageable = new Pageable();

    @BeforeEach
    void setUp() {
        pageable.setPage(18);
        pageable.setSize(0);
    }

    @Test
    @ApiForClientLogin
    @DisplayName("museum creation by api")
    void createMuseum() throws IOException {
        GeolocationDto geolocationDto = new GeolocationDto();
        CountryDto countryDto = museumApiStep.getCountryByName(pageable, "Россия");

        geolocationDto.setCity("Москва");
        geolocationDto.setCountry(countryDto);
        NewMuseumDto newMuseumDto = new NewMuseumDto();
        newMuseumDto.setGeo(geolocationDto);
        newMuseumDto.setDescription(generateRandomSentence(11));
        newMuseumDto.setPhoto(getSamplePhoto());
        newMuseumDto.setTitle(generateRandomMuseumName());
        CreatedMuseumDto createdMuseumDto = museumApiStep.createNewMuseum(newMuseumDto);

        Assertions.assertAll("Assert museum created correctly",
                () -> Assertions.assertEquals(newMuseumDto.getTitle(), createdMuseumDto.getTitle()),
                () -> Assertions.assertEquals(newMuseumDto.getGeo(), createdMuseumDto.getGeo()),
                () -> Assertions.assertEquals(newMuseumDto.getDescription(), createdMuseumDto.getDescription()),
                () -> Assertions.assertEquals(newMuseumDto.getPhoto(), createdMuseumDto.getPhoto())
        );
    }

    @Test
    @ApiForClientLogin
    @DisplayName("get museum by id and assert it")
    void getMuseumByIdAndAssert() throws IOException {
        GeolocationDto geolocationDto = new GeolocationDto();
        CountryDto countryDto = museumApiStep.getCountryByName(pageable, "Россия");

        geolocationDto.setCity("Москва");
        geolocationDto.setCountry(countryDto);
        NewMuseumDto newMuseumDto = new NewMuseumDto();
        newMuseumDto.setGeo(geolocationDto);
        newMuseumDto.setDescription(generateRandomSentence(11));
        newMuseumDto.setPhoto(getSamplePhoto());
        newMuseumDto.setTitle(generateRandomMuseumName());
        UUID museumId = museumApiStep.createNewMuseum(newMuseumDto).getId();
        MuseumDto createdMuseumDto = museumApiStep.getMuseum(museumId);

        Assertions.assertAll("Assert museum created correctly",
                () -> Assertions.assertEquals(newMuseumDto.getTitle(), createdMuseumDto.getTitle()),
                () -> Assertions.assertEquals(newMuseumDto.getGeo(), createdMuseumDto.getGeo()),
                () -> Assertions.assertEquals(newMuseumDto.getDescription(), createdMuseumDto.getDescription()),
                () -> Assertions.assertEquals(newMuseumDto.getPhoto(), createdMuseumDto.getPhoto())
        );
    }

    @Test
    @ApiForClientLogin
    @DisplayName("update museum by api")
    void updateMuseum() throws IOException {
        GeolocationDto geolocationDto = new GeolocationDto();
        CountryDto countryDto = museumApiStep.getCountryByName(pageable, "Россия");

        geolocationDto.setCity("Москва");
        geolocationDto.setCountry(countryDto);
        NewMuseumDto newMuseumDto = new NewMuseumDto();
        newMuseumDto.setGeo(geolocationDto);
        newMuseumDto.setDescription(generateRandomSentence(11));
        newMuseumDto.setPhoto(getSamplePhoto());
        newMuseumDto.setTitle(generateRandomMuseumName());
        CreatedMuseumDto createdMuseumDto = museumApiStep.createNewMuseum(newMuseumDto);

        CountryDto newCountryDto = museumApiStep.getCountryByName(pageable, "Россия");
        GeolocationDto newGeolocationDto = new GeolocationDto();
        newGeolocationDto.setCity("Алматы");
        newGeolocationDto.setCountry(newCountryDto);

        MuseumDto newCreatedMuseum = new MuseumDto();
        newCreatedMuseum.setId(createdMuseumDto.getId());
        newCreatedMuseum.setGeo(newGeolocationDto);
        newCreatedMuseum.setDescription(generateRandomSentence(11));
        newCreatedMuseum.setPhoto(getAnotherSamplePhoto());
        newCreatedMuseum.setTitle(generateRandomMuseumName());

        MuseumDto updatedMuseum = museumApiStep.updateMuseum(newCreatedMuseum);

        Assertions.assertAll("Assert museum created correctly",
                () -> Assertions.assertEquals(newCreatedMuseum.getTitle(), updatedMuseum.getTitle()),
                () -> Assertions.assertEquals(newCreatedMuseum.getGeo(), updatedMuseum.getGeo()),
                () -> Assertions.assertEquals(newCreatedMuseum.getDescription(), updatedMuseum.getDescription()),
                () -> Assertions.assertEquals(newCreatedMuseum.getPhoto(), updatedMuseum.getPhoto())
        );
    }
}
