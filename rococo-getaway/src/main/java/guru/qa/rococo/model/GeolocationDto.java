package guru.qa.rococo.model;

import guru.qa.grpc.rococo.grpc.Country;
import jakarta.validation.constraints.NotNull;

public record GeolocationDto(String city, CountryDto country) {

    public static @NotNull GeolocationDto fromGrpcMessage(@NotNull String city, Country country) {
        return new GeolocationDto(city,
                CountryDto.fromGrpcMessage(country)
        );
    }
}
