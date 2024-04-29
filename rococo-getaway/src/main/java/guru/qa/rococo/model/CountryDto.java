package guru.qa.rococo.model;

import java.util.UUID;

import guru.qa.grpc.rococo.grpc.Country;
import jakarta.validation.constraints.NotNull;

public record CountryDto(UUID id, String name) {

    public static @NotNull CountryDto fromGrpcMessage(@NotNull Country response) {
        return new CountryDto(UUID.fromString(response.getId()),
                response.getName());
    }
}
