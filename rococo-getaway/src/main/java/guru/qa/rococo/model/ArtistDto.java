package guru.qa.rococo.model;

import java.util.UUID;

import guru.qa.grpc.rococo.grpc.Artist;
import guru.qa.grpc.rococo.grpc.ArtistResponse;
import jakarta.validation.constraints.NotNull;

public record ArtistDto(UUID id, String name, String biography, String photo) {

    public static @NotNull ArtistDto fromGrpcMessage(@NotNull Artist response){
        return new ArtistDto(UUID.fromString(response.getId()), response.getName(), response.getBiography(),
                response.getPhoto());
    }
}
