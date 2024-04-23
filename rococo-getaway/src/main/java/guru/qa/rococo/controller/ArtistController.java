package guru.qa.rococo.controller;

import java.util.UUID;

import guru.qa.rococo.model.ArtistDto;
import guru.qa.rococo.model.NewArtistDto;
import guru.qa.rococo.service.api.ArtistGrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ArtistController {

    public ArtistGrpcClient artistClient;

    @Autowired
    public ArtistController(ArtistGrpcClient artistClient){
        this.artistClient = artistClient;
    }

    @GetMapping("/artist/{id}")
    public ArtistDto get(@PathVariable("id")UUID id) {
        return artistClient.getArtist(id);
    }

    @PostMapping("/artist")
    public ArtistDto create(@RequestBody NewArtistDto artistDto) {
        return artistClient.createArtist(artistDto);
    }

    @GetMapping("/artist")
    public Page<ArtistDto> getAll(@RequestParam(required = false) String name,
                                  @PageableDefault Pageable pageable) {
        return artistClient.getAllArtist(name, pageable);
    }

}
