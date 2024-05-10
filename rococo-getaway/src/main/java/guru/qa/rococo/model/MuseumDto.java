package guru.qa.rococo.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
import guru.qa.grpc.rococo.grpc.CreatedPainting;
import guru.qa.grpc.rococo.grpc.Museum;
import jakarta.validation.constraints.NotNull;

public record MuseumDto(UUID id, String photo, String title, String description,
                        @JsonProperty("geo") GeolocationDto geo) {

    public static @NotNull MuseumDto fromGrpcMessage(@NotNull Museum response) {
        return new MuseumDto(UUID.fromString(response.getId()),
                response.getPhoto(),
                response.getTitle(),
                response.getDescription(),
                GeolocationDto.fromGrpcMessage(response.getCity(), response.getCountry())
        );
    }
}
