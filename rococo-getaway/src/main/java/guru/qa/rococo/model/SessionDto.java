package guru.qa.rococo.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.annotation.Nonnull;

public record SessionDto(@JsonProperty("username")
                         String username,
                         @JsonProperty("issuedAt")
                         Date issuedAt,
                         @JsonProperty("expiresAt")
                         Date expiresAt) {

    public static @Nonnull SessionDto empty() {
        return new SessionDto(null, null, null);
    }
}
