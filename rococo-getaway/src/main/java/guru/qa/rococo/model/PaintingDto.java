package guru.qa.rococo.model;

import java.util.UUID;

import guru.qa.grpc.rococo.grpc.Painting;
import jakarta.validation.constraints.NotNull;

public record PaintingDto(UUID id, String title, String description, String content, ArtistDto artist,
                          MuseumDto museum) {

    public static @NotNull PaintingDto fromGrpcMessage(@NotNull Painting response) {
        return new PaintingDto(UUID.fromString(response.getId()), response.getTitle(), response.getDescription(),
                response.getContent(),
                ArtistDto.fromGrpcMessage(response.getArtist()),
                MuseumDto.fromGrpcMessage(response.getMuseum()));
    }
}
