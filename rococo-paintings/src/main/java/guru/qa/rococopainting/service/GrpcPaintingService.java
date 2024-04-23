package guru.qa.rococopainting.service;

import java.util.ArrayList;
import java.util.List;

import com.google.protobuf.ByteString;
import guru.qa.grpc.rococo.grpc.AllPaintingRequest;
import guru.qa.grpc.rococo.grpc.Painting;
import guru.qa.grpc.rococo.grpc.PaintingIdRequest;
import guru.qa.grpc.rococo.grpc.PaintingResponse;
import guru.qa.grpc.rococo.grpc.RococoPaintingServiceGrpc;
import guru.qa.rococopainting.data.entity.PaintingEntity;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import static guru.qa.rococopainting.model.ArtistDto.toGrpcMessage;

@GrpcService
public class GrpcPaintingService extends RococoPaintingServiceGrpc.RococoPaintingServiceImplBase {


    @Override
    public void getAllPainting(AllPaintingRequest request,
                                StreamObserver<PaintingResponse> responseObserver) {
        List<PaintingEntity> list = new ArrayList<>();

        PaintingResponse paintingResponse = PaintingResponse.newBuilder().addAllAllpainting(list.stream()
                        .map( painting -> Painting.newBuilder()
                                .setId(painting.getId().toString())
                                .setTitle(painting.getTitle())
                                .setDescription(painting.getDescription())
                                .setContent(ByteString.copyFrom(painting.getContent()))
                                .setArtist(toGrpcMessage(painting.getArtist()))
                                .build())
                        .toList())
                .build();
        responseObserver.onNext(paintingResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getPainting(PaintingIdRequest request,
                            StreamObserver<Painting> responseObserver) {
        PaintingEntity paintingEntity = new PaintingEntity();

        Painting painting = Painting.newBuilder()
                .setId(paintingEntity.getId().toString())
                .setTitle(paintingEntity.getTitle())
                .setDescription(paintingEntity.getDescription())
                .setContent(ByteString.copyFrom(paintingEntity.getContent()))
                .setArtist(toGrpcMessage(paintingEntity.getArtist()))
                .build();

        responseObserver.onNext(painting);
        responseObserver.onCompleted();
    }


}
