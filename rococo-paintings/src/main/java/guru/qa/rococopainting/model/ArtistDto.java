package guru.qa.rococopainting.model;

import java.util.UUID;

import guru.qa.grpc.rococo.grpc.Artist;
import jakarta.validation.constraints.NotNull;

public record ArtistDto(UUID id, String name, String biography, String photo) {


    public static @NotNull Artist toGrpcMessage(@NotNull ArtistDto artistDto) {
        return Artist.newBuilder()
                .setId(artistDto.id().toString())
                .setName(artistDto.name())
                .setBiography(artistDto.biography())
                .setPhoto(artistDto.photo())
                .build();
    }
}
