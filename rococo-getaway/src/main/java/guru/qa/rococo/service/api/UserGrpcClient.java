package guru.qa.rococo.service.api;

import java.util.List;
import java.util.UUID;

import guru.qa.grpc.rococo.grpc.AllArtistRequest;
import guru.qa.grpc.rococo.grpc.Artist;
import guru.qa.grpc.rococo.grpc.ArtistIdRequest;
import guru.qa.grpc.rococo.grpc.RococoArtistServiceGrpc;
import guru.qa.grpc.rococo.grpc.RococoUserServiceGrpc;
import guru.qa.grpc.rococo.grpc.User;
import guru.qa.grpc.rococo.grpc.UserIdRequest;
import guru.qa.rococo.model.ArtistDto;
import guru.qa.rococo.model.UserDto;
import io.grpc.StatusRuntimeException;
import jakarta.annotation.Nonnull;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import static com.google.common.base.Strings.nullToEmpty;
import static guru.qa.rococo.model.ArtistDto.fromGrpcMessage;

@Component
public class UserGrpcClient {

    private static final Logger LOG = LoggerFactory.getLogger(UserGrpcClient.class);


    @GrpcClient("grpcUserClient")
    public void setRococoUserServiceBlockingStub(
            RococoUserServiceGrpc.RococoUserServiceBlockingStub rococoUserServiceBlockingStub) {
        this.rococoUserServiceBlockingStub = rococoUserServiceBlockingStub;
    }

    private RococoUserServiceGrpc.RococoUserServiceBlockingStub rococoUserServiceBlockingStub;


    public @Nonnull
    UserDto getUser(String userName) {
        try {
            User user =
                    rococoUserServiceBlockingStub.getUser(
                            UserIdRequest.newBuilder().setUsername(userName).build());
            return UserDto.fromGrpcMessage(user);
        } catch (StatusRuntimeException e) {
            LOG.error("### Error while calling gRPC server ", e);
            throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE, "The gRPC operation was cancelled", e);
        }
    }

    public @Nonnull
    UserDto updateUser(UserDto userDto) {
        User.Builder userBuilder = User.newBuilder();


        if (!nullToEmpty(userDto.firstName()).trim().isEmpty()) {
            userBuilder.setFirstname(userDto.firstName());
        }
        if (!nullToEmpty(userDto.lastName()).trim().isEmpty()) {
            userBuilder.setLastname(userDto.lastName());
        }
        if (!nullToEmpty(userDto.avatar()).trim().isEmpty()) {
            userBuilder.setAvatar(userDto.avatar());
        }

        User createdUser = userBuilder
                .setUsername(userDto.userName())
                .setId(userDto.id().toString())
                .build();

        try {
            User user =
                    rococoUserServiceBlockingStub.updateUser(createdUser);
            return UserDto.fromGrpcMessage(user);
        } catch (StatusRuntimeException e) {
            LOG.error("### Error while calling gRPC server ", e);
            throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE, "The gRPC operation was cancelled", e);
        }
    }
}
