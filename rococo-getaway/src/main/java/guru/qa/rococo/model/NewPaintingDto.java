package guru.qa.rococo.model;

import java.util.UUID;

import guru.qa.grpc.rococo.grpc.Painting;
import jakarta.validation.constraints.NotNull;
//todo мб не сработает и надо будет делать дто для айдишников artistId, museumId)
public record NewPaintingDto(ArtistDto artist, String content, String description,MuseumDto museum, String title) {

}
