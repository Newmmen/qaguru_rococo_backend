package guru.qa.rococo.controller;

import java.util.UUID;

import guru.qa.rococo.model.ArtistDto;
import guru.qa.rococo.model.MuseumDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class MuseumController {
//    public MuseumClient museumClient;
//
//    @Autowired
//    public MuseumController(MuseumClient museumClient){
//        this.museumClient = museumClient;
//    }
//
//    @GetMapping("/museum/{id}")
//    public MuseumDto get(@PathVariable("id") UUID id) {
//        return museumClient.getById(id);
//    }
//
//    @GetMapping("/museum")
//    public Page<MuseumDto> getAll(@RequestParam(required = false) String name,
//                                  @PageableDefault Pageable pageable) {
//        return museumClient.getAll(name, pageable);
//    }
}
