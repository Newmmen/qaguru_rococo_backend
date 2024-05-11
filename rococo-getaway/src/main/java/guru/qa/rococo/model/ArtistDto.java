package guru.qa.rococo.model;

import java.util.UUID;

import guru.qa.grpc.rococo.grpc.Artist;
import io.swagger.v3.oas.annotations.Hidden;
import jakarta.validation.constraints.NotNull;

public record ArtistDto(UUID id, String name, String biography, @Hidden String photo) {

    public static @NotNull ArtistDto fromGrpcMessage(@NotNull Artist response) {
        return new ArtistDto(UUID.fromString(response.getId()), response.getName(), response.getBiography(),
                response.getPhoto());
    }
}
