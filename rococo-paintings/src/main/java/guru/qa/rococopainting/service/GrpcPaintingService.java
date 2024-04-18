package guru.qa.rococopainting.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import guru.qa.grpc.rococo.grpc.AllPaintingRequest;
import guru.qa.grpc.rococo.grpc.Artist;
import guru.qa.grpc.rococo.grpc.ArtistResponse;
import guru.qa.grpc.rococo.grpc.Painting;
import guru.qa.grpc.rococo.grpc.PaintingIdRequest;
import guru.qa.grpc.rococo.grpc.PaintingResponse;
import guru.qa.grpc.rococo.grpc.RococoPaintingServiceGrpc;
import guru.qa.rococopainting.model.ArtistDto;
import guru.qa.rococopainting.model.PaintingDto;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import static guru.qa.rococopainting.model.ArtistDto.toGrpcMessage;

@GrpcService
public class GrpcPaintingService extends RococoPaintingServiceGrpc.RococoPaintingServiceImplBase {


    @Override
    public void getAllPainting(AllPaintingRequest request,
                                StreamObserver<PaintingResponse> responseObserver) {
        List<PaintingDto> list = new ArrayList<>();
        list.add(new PaintingDto(UUID.randomUUID(), "title", "description", "content",
                new ArtistDto(UUID.randomUUID(), "name", "biography", "photo")));

        PaintingResponse paintingResponse = PaintingResponse.newBuilder().addAllAllpainting(list.stream()
                        .map( painting -> Painting.newBuilder()
                                .setId(painting.id().toString())
                                .setTitle(painting.title())
                                .setDescription(painting.description())
                                .setContent(painting.content())
                                .setArtist(toGrpcMessage(painting.artist()))
                                .build())
                        .toList())
                .build();
        responseObserver.onNext(paintingResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getPainting(PaintingIdRequest request,
                            StreamObserver<Painting> responseObserver) {
        PaintingDto paintingDto = new PaintingDto(UUID.randomUUID(), "title", "description", "content",
                new ArtistDto(UUID.randomUUID(), "name", "biography", "photo"));

        Painting painting = Painting.newBuilder()
                .setId(paintingDto.id().toString())
                .setTitle(paintingDto.title())
                .setDescription(paintingDto.description())
                .setContent(paintingDto.content())
                .setArtist(toGrpcMessage(paintingDto.artist()))
                .build();

        responseObserver.onNext(painting);
        responseObserver.onCompleted();
    }


}
