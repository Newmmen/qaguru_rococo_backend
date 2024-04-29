package guru.qa.rococo.model;

import java.util.UUID;

import guru.qa.grpc.rococo.grpc.Painting;
import jakarta.validation.constraints.NotNull;
//todo мб не сработает и надо будет делать дто для айдишников artistId, museumId)
public record NewPaintingDto(UUID artistId, String content, String description,UUID museumId, String title) {

}
