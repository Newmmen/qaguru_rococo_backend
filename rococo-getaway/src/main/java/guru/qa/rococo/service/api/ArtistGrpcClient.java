package guru.qa.rococo.service.api;

import java.util.List;
import java.util.UUID;

import com.google.protobuf.ByteString;
import guru.qa.grpc.rococo.grpc.AllArtistRequest;
import guru.qa.grpc.rococo.grpc.Artist;
import guru.qa.grpc.rococo.grpc.ArtistIdRequest;
import guru.qa.grpc.rococo.grpc.NewArtist;
import guru.qa.grpc.rococo.grpc.RococoArtistServiceGrpc;
import guru.qa.rococo.model.ArtistDto;
import guru.qa.rococo.model.NewArtistDto;
import io.grpc.StatusRuntimeException;
import jakarta.annotation.Nonnull;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import static guru.qa.rococo.model.ArtistDto.fromGrpcMessage;

@Component
public class ArtistGrpcClient {

    private static final Logger LOG = LoggerFactory.getLogger(ArtistGrpcClient.class);


    @GrpcClient("grpcArtistClient")
    public void setRococoArtistServiceBlockingStub( RococoArtistServiceGrpc.RococoArtistServiceBlockingStub rococoArtistServiceBlockingStub) {
        this.rococoArtistServiceBlockingStub = rococoArtistServiceBlockingStub;
    }

    private RococoArtistServiceGrpc.RococoArtistServiceBlockingStub rococoArtistServiceBlockingStub;


    public @Nonnull
    ArtistDto getArtist(UUID uuid) {
        try {
            Artist artist =
                    rococoArtistServiceBlockingStub.getArtist(
                            ArtistIdRequest.newBuilder().setId(String.valueOf(uuid)).build());
            return fromGrpcMessage(artist);
        } catch (StatusRuntimeException e) {
            LOG.error("### Error while calling gRPC server ", e);
            throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE, "The gRPC operation was cancelled", e);
        }
    }

    public @Nonnull
    ArtistDto createArtist(NewArtistDto artistDto) {
        try {
            Artist artist =
                    rococoArtistServiceBlockingStub.createArtist(
                            NewArtist.newBuilder()
                                    .setBiography(artistDto.biography())
                                    .setName(artistDto.name())
                                    .setPhoto(artistDto.photo()).build());
            return fromGrpcMessage(artist);
        } catch (StatusRuntimeException e) {
            LOG.error("### Error while calling gRPC server ", e);
            throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE, "The gRPC operation was cancelled", e);
        }
    }

    public @Nonnull
    Page<ArtistDto> getAllArtist(String name, Pageable pageable) {
        try {
             List<ArtistDto> artistDtos = rococoArtistServiceBlockingStub.getAllArtists(AllArtistRequest.newBuilder()
                            .setName(name == null ? " ": name)
                            .setPageNumber(pageable.getPageNumber())
                            .setPageSize(pageable.getPageSize()).build()
                    ).getAllArtistsList()
                    .stream()
                    .map(ArtistDto::fromGrpcMessage)
                    .toList();
             return new PageImpl<>(artistDtos);
        } catch (StatusRuntimeException e) {
            LOG.error("### Error while calling gRPC server ", e);
            throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE, "The gRPC operation was cancelled", e);
        }

    }
}
