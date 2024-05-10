package guru.qa.rococo.model;

import java.util.UUID;

import guru.qa.grpc.rococo.grpc.CreatedMuseum;
import jakarta.validation.constraints.NotNull;

public record CreatedMuseumDto(UUID id, String title, String description, String photo, GeolocationDto geo) {

    public static @NotNull CreatedMuseumDto fromGrpcMessage(@NotNull CreatedMuseum response){
        return new CreatedMuseumDto(UUID.fromString(response.getId()),
                response.getTitle(),
                response.getDescription(),
                response.getPhoto(),
                GeolocationDto.fromGrpcMessage(response.getCity(), response.getCountry())
                );
    }

}
