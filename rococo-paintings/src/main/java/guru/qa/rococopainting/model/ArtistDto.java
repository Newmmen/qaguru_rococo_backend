package guru.qa.rococopainting.model;

import java.util.UUID;

import com.google.protobuf.ByteString;
import guru.qa.grpc.rococo.grpc.Artist;
import guru.qa.rococopainting.data.entity.ArtistEntity;
import jakarta.validation.constraints.NotNull;

public record ArtistDto(UUID id, String name, String biography, String photo) {


    public static @NotNull Artist toGrpcMessage(@NotNull ArtistEntity artistEntity) {
        return Artist.newBuilder()
                .setId(artistEntity.getId().toString())
                .setName(artistEntity.getName())
                .setBiography(artistEntity.getBiography())
                .setPhoto(ByteString.copyFrom(artistEntity.getPhoto()))
                .build();
    }
}
