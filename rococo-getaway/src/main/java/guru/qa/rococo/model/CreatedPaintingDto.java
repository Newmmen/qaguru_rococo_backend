package guru.qa.rococo.model;

import java.util.UUID;

import guru.qa.grpc.rococo.grpc.CreatedPainting;
import jakarta.validation.constraints.NotNull;

public record CreatedPaintingDto(UUID id, String title, String description, String content, MuseumDto museumDto,
                                 ArtistDto artistDto) {

    public static @NotNull CreatedPaintingDto fromGrpcMessage(@NotNull CreatedPainting response){
        return new CreatedPaintingDto(UUID.fromString(response.getId()),
                response.getTitle(),
                response.getDescription(),
                response.getContent(),
                MuseumDto.fromGrpcMessage(response.getMuseum()),
                ArtistDto.fromGrpcMessage(response.getArtist())
                );
    }

}
