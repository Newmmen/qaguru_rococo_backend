package guru.qa.rococo.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public record MuseumDto(UUID id, String photo, String title, String description,
                        @JsonProperty("geo") GeolocationDto geo) {
}
