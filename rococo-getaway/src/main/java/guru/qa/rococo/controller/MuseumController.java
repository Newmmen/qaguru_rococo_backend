package guru.qa.rococo.controller;

import java.util.UUID;

import guru.qa.rococo.model.CountryDto;
import guru.qa.rococo.model.CreatedMuseumDto;
import guru.qa.rococo.model.MuseumDto;
import guru.qa.rococo.model.NewMuseumDto;
import guru.qa.rococo.service.api.PaintingMuseumGrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class MuseumController {
    public final PaintingMuseumGrpcClient museumClient;

    @Autowired
    public MuseumController(PaintingMuseumGrpcClient museumClient) {
        this.museumClient = museumClient;
    }


    @GetMapping("/museum")
    public Page<MuseumDto> getAllMuseums(@RequestParam(required = false, defaultValue = "") String title,
                                         @PageableDefault Pageable pageable) {
        return museumClient.getAllMuseums(title, pageable);
    }

    @GetMapping("/museum/{id}")
    public MuseumDto getMuseum(@PathVariable UUID id) {
        return museumClient.getMuseum(id);
    }

    @PatchMapping("/museum")
    public MuseumDto updateMuseum(@RequestBody MuseumDto museumDto) {
        return museumClient.updateMuseum(museumDto);
    }

    @PostMapping("/museum")
    public CreatedMuseumDto createMuseum(@RequestBody NewMuseumDto newMuseumDto) {
        return museumClient.createMuseum(newMuseumDto);
    }

    @GetMapping("/country")
    public Page<CountryDto> getAllCountries(@PageableDefault Pageable pageable) {
        return museumClient.getAllCountries(pageable);
    }
}
