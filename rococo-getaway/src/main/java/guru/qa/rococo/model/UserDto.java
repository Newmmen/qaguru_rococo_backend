package guru.qa.rococo.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
import guru.qa.grpc.rococo.grpc.User;
import jakarta.validation.constraints.NotNull;

public record UserDto(UUID id,
                      @JsonProperty("username") String userName,
                      @JsonProperty("firstname") String firstName,
                      @JsonProperty("lastname") String lastName,
                      String avatar) {

    public static @NotNull UserDto fromGrpcMessage(@NotNull User response) {
        return new UserDto(UUID.fromString(response.getId()),
                response.getUsername(),
                response.getFirstname(),
                response.getLastname(),
                response.getAvatar());
    }
}
