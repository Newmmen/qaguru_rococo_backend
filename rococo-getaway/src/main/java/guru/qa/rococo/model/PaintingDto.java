package guru.qa.rococo.model;

import java.util.UUID;

import guru.qa.grpc.rococo.grpc.Artist;
import guru.qa.grpc.rococo.grpc.Painting;
import jakarta.validation.constraints.NotNull;

public record PaintingDto(UUID id, String title, String description, byte[] content, ArtistDto artist) {

    public static @NotNull PaintingDto fromGrpcMessage(@NotNull Painting response){
        return new PaintingDto(UUID.fromString(response.getId()), response.getTitle(), response.getDescription(),
                response.getContent().toByteArray(), ArtistDto.fromGrpcMessage(response.getArtist()));
    }
}
