package guru.qa.rococo.model;

import guru.qa.grpc.rococo.grpc.Geo;
import jakarta.validation.constraints.NotNull;

public record GeolocationDto(String city, CountryDto country) {

    public static @NotNull GeolocationDto fromGrpcMessage(@NotNull Geo response) {
        return new GeolocationDto(response.getCity(),
                CountryDto.fromGrpcMessage(response.getCountry())
        );
    }
}
