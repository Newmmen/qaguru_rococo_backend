package guru.qa.rococo.service.api;

import java.util.List;
import java.util.UUID;

import guru.qa.grpc.rococo.grpc.AllPaintingRequest;
import guru.qa.grpc.rococo.grpc.Painting;
import guru.qa.grpc.rococo.grpc.PaintingIdRequest;
import guru.qa.grpc.rococo.grpc.RococoPaintingServiceGrpc;
import guru.qa.rococo.model.PaintingDto;
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

@Component
public class PaintingGrpcClient {

    private static final Logger LOG = LoggerFactory.getLogger(PaintingGrpcClient.class);


    @GrpcClient("grpcPaintingClient")
    public void setRococoArtistServiceBlockingStub(
            RococoPaintingServiceGrpc.RococoPaintingServiceBlockingStub rococoPaintingServiceBlockingStub) {
        this.rococoPaintingServiceBlockingStub = rococoPaintingServiceBlockingStub;
    }

    private RococoPaintingServiceGrpc.RococoPaintingServiceBlockingStub rococoPaintingServiceBlockingStub;


    public @Nonnull
    PaintingDto getPainting(UUID uuid) {
        try {
            Painting painting =
                    rococoPaintingServiceBlockingStub.getPainting(
                            PaintingIdRequest.newBuilder().setId(String.valueOf(uuid)).build());
            return PaintingDto.fromGrpcMessage(painting);
        } catch (StatusRuntimeException e) {
            LOG.error("### Error while calling gRPC server ", e);
            throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE, "The gRPC operation was cancelled", e);
        }
    }

    public @Nonnull
    Page<PaintingDto> getAllPaintings(String name, Pageable pageable) {
        try {
            List<PaintingDto> paintingDtos =
                    rococoPaintingServiceBlockingStub.getAllPainting(AllPaintingRequest.newBuilder()
                                    .setName(name == null ? " ": name)
                                    .setPageNumber(pageable.getPageNumber())
                                    .setPageSize(pageable.getPageSize()).build()
                            ).getAllpaintingList()
                            .stream()
                            .map(PaintingDto::fromGrpcMessage)
                            .toList();
            return new PageImpl<>(paintingDtos);
        } catch (StatusRuntimeException e) {
            LOG.error("### Error while calling gRPC server ", e);
            throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE, "The gRPC operation was cancelled", e);
        }

    }
}
