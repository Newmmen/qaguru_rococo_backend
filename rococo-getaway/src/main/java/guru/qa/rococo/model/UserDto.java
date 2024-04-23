package guru.qa.rococo.model;

import java.util.UUID;

import guru.qa.grpc.rococo.grpc.User;
import jakarta.validation.constraints.NotNull;

public record UserDto(UUID id, String username, String firstName, String lastname, byte[] avatar) {

    public static @NotNull UserDto fromGrpcMessage(@NotNull User response){
        return new UserDto(UUID.fromString(response.getId()), response.getUsername(), response.getFirstname(),
                response.getLastname(), response.getAvatar().toByteArray());
    }
}
