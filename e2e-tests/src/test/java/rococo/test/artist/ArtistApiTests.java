package rococo.test.artist;


import java.io.IOException;
import java.util.UUID;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openapitools.client.model.ArtistDto;
import org.openapitools.client.model.NewArtistDto;
import rococo.apisteps.ArtistApiStep;
import rococo.jupiter.annotation.ApiForClientLogin;
import rococo.jupiter.extention.ApiForClientExtension;
import rococo.jupiter.extention.ContextHolderExtension;

import static rococo.utils.DataUtils.generateRandomArtistName;
import static rococo.utils.DataUtils.generateRandomSentence;
import static rococo.utils.DataUtils.getAnotherSamplePhoto;
import static rococo.utils.DataUtils.getSamplePhoto;

@Tag("API")
@DisplayName("Test artist API controllers")
@ExtendWith({ContextHolderExtension.class, ApiForClientExtension.class})
public class ArtistApiTests {
    private final ArtistApiStep artistApiStep = new ArtistApiStep();

    @Test
    @ApiForClientLogin
    @DisplayName("check created artist equals actual")
    void createArtist() throws IOException {
        NewArtistDto artistDto = new NewArtistDto();
        artistDto.setName(generateRandomArtistName());
        artistDto.setPhoto(getSamplePhoto());
        artistDto.setBiography(generateRandomSentence(11));
        ArtistDto createdArtist = artistApiStep.createArtist(artistDto);

        Assertions.assertAll("Assert artists are equal",
                () -> Assertions.assertEquals(artistDto.getName(), createdArtist.getName()),
                () -> Assertions.assertEquals(artistDto.getBiography(), createdArtist.getBiography()),
                () -> Assertions.assertEquals(artistDto.getPhoto(), createdArtist.getPhoto())
        );
    }

    @Test
    @ApiForClientLogin
    @DisplayName("check fetched artist equals actual")
    void getCreatedArtist() throws IOException {
        NewArtistDto artistDto = new NewArtistDto();
        artistDto.setName(generateRandomArtistName());
        artistDto.setPhoto(getSamplePhoto());
        artistDto.setBiography(generateRandomSentence(11));
        UUID artistId = artistApiStep.createArtist(artistDto).getId();
        ArtistDto createdArtist = artistApiStep.getArtist(artistId);

        Assertions.assertAll("Assert artists are equal",
                () -> Assertions.assertEquals(artistDto.getName(), createdArtist.getName()),
                () -> Assertions.assertEquals(artistDto.getBiography(), createdArtist.getBiography()),
                () -> Assertions.assertEquals(artistDto.getPhoto(), createdArtist.getPhoto())
        );
    }

    @Test
    @ApiForClientLogin
    @DisplayName("check updated artist equals expected")
    void createAndUpdateArtist() throws IOException {
        String photo = getSamplePhoto();
        NewArtistDto artistDto = new NewArtistDto();
        artistDto.setName(generateRandomArtistName());
        artistDto.setPhoto(photo);
        artistDto.setBiography(generateRandomSentence(11));
        ArtistDto createdArtist = artistApiStep.createArtist(artistDto);

        createdArtist.setName(generateRandomArtistName());
        createdArtist.setBiography(generateRandomSentence(11));
        createdArtist.setPhoto(getAnotherSamplePhoto());
        ArtistDto updatedArtist = artistApiStep.updateArtist(createdArtist);

        artistApiStep.assertArtistEqualsExpected(createdArtist, updatedArtist);
    }

    @Test
    @ApiForClientLogin
    @DisplayName("get artist by id and assert it")
    void getArtistByIdAndAssert() throws IOException {
        String photo = getSamplePhoto();
        NewArtistDto artistDto = new NewArtistDto();
        artistDto.setName(generateRandomArtistName());
        artistDto.setPhoto(photo);
        artistDto.setBiography(generateRandomSentence(11));

        ArtistDto createdArtist = artistApiStep.createArtist(artistDto);
        Assertions.assertAll("Assert artists are equal",
                () -> Assertions.assertEquals(artistDto.getName(), createdArtist.getName()),
                () -> Assertions.assertEquals(artistDto.getBiography(), createdArtist.getBiography()),
                () -> Assertions.assertEquals(photo, createdArtist.getPhoto())
        );
    }
}
