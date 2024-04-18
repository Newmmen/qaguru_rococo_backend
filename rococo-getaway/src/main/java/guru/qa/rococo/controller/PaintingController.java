package guru.qa.rococo.controller;

import java.util.UUID;

import guru.qa.rococo.model.ArtistDto;
import guru.qa.rococo.model.MuseumDto;
import guru.qa.rococo.model.PaintingDto;
import guru.qa.rococo.service.api.PaintingGrpcClient;
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
public class PaintingController {
    public PaintingGrpcClient paintingGrpcClient;

    @Autowired
    public PaintingController(PaintingGrpcClient paintingGrpcClient) {
        this.paintingGrpcClient = paintingGrpcClient;
    }

    @GetMapping("/painting/{id}")
    public PaintingDto get(@PathVariable("id") UUID id) {
        return paintingGrpcClient.getPainting(id);
    }

    @GetMapping("/painting")
    public Page<PaintingDto> getAll(@RequestParam(required = false) String name,
                                    @PageableDefault Pageable pageable) {
        return paintingGrpcClient.getAllPaintings(name, pageable);
    }
}

