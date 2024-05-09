package rococo.test.artist;


import java.io.IOException;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openapitools.client.ApiClient;
import org.openapitools.client.api.ArtistControllerApi;
import org.openapitools.client.model.ArtistDto;
import org.openapitools.client.model.NewArtistDto;
import org.openapitools.client.model.Pageable;
import rococo.apisteps.ArtistApiStep;
import rococo.jupiter.annotation.ApiForClientLogin;
import rococo.jupiter.annotation.ApiLogin;
import rococo.jupiter.extention.ApiForClientExtension;
import rococo.jupiter.extention.ApiLoginExtension;
import rococo.jupiter.extention.ContextHolderExtension;
import rococo.jupiter.extention.CreateUserExtension;
import rococo.pages.ArtistPage;
import rococo.pages.LoginPage;
import rococo.pages.MainPage;

import static rococo.utils.DataUtils.getSamplePhoto;


@ExtendWith({ContextHolderExtension.class, CreateUserExtension.class, ApiForClientExtension.class})
public class ArtistApiTests {
    private final ArtistApiStep artistApiStep = new ArtistApiStep();

    private Pageable pageable = new Pageable();


    @BeforeEach
    void setUp() {
        pageable.setSize(10);
        pageable.setPage(0);
    }

    @Test
    @ApiForClientLogin
    @DisplayName("check created artist equals actual")
    void createArtist() throws IOException {
        String photo = getSamplePhoto();
        NewArtistDto artistDto = new NewArtistDto();
        artistDto.setName("ArtistName");
        artistDto.setPhoto(photo);
        artistDto.setBiography("ArtistBiography");

        ArtistDto createdArtist = artistApiStep.createArtist(artistDto);

        Assertions.assertEquals(createdArtist.getName(), artistDto.getName());
        Assertions.assertEquals(createdArtist.getBiography(), artistDto.getBiography());
        Assertions.assertEquals(createdArtist.getPhoto(), photo);
    }
}
