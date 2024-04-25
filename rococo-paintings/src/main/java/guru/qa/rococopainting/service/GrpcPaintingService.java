package guru.qa.rococopainting.service;

import java.util.UUID;

import guru.qa.grpc.rococo.grpc.AllPaintingByAuthorRequest;
import guru.qa.grpc.rococo.grpc.AllPaintingRequest;
import guru.qa.grpc.rococo.grpc.Painting;
import guru.qa.grpc.rococo.grpc.PaintingIdRequest;
import guru.qa.grpc.rococo.grpc.PaintingResponse;
import guru.qa.grpc.rococo.grpc.RococoPaintingServiceGrpc;
import guru.qa.rococopainting.data.entity.ArtistEntity;
import guru.qa.rococopainting.data.entity.PaintingEntity;
import guru.qa.rococopainting.data.repository.ArtistRepository;
import guru.qa.rococopainting.data.repository.PaintingRepository;
import guru.qa.rococopainting.exception.NotFoundException;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import static guru.qa.rococopainting.model.ArtistDto.toGrpcMessage;

@GrpcService
public class GrpcPaintingService extends RococoPaintingServiceGrpc.RococoPaintingServiceImplBase {

    private final PaintingRepository paintingRepository;
    private final ArtistRepository artistRepository;


    public GrpcPaintingService(PaintingRepository paintingRepository,
                               ArtistRepository artistRepository) {
        this.paintingRepository = paintingRepository;
        this.artistRepository = artistRepository;
    }


    @Override
    public void getAllPainting(AllPaintingRequest request,
                               StreamObserver<PaintingResponse> responseObserver) {
        Page<PaintingEntity> list;
        //todo разобраться с кейсом, когда getName().equals(" ")
        if (request.getName().equals(" ")) {
            list = paintingRepository.findAll(PageRequest.of(request.getPageNumber(), request.getPageSize()));
        } else {
            list = paintingRepository.findAllByTitleContainsIgnoreCase(request.getName(),
                    PageRequest.of(request.getPageNumber(),
                            request.getPageSize()));
        }

        PaintingResponse paintingResponse = PaintingResponse.newBuilder().addAllAllpainting(list.stream()
                        .map(painting -> Painting.newBuilder()
                                .setId(painting.getId().toString())
                                .setTitle(painting.getTitle())
                                .setDescription(painting.getDescription())
                                .setContent(painting.getContent())
                                .setArtist(toGrpcMessage(painting.getArtist()))
                                .build())
                        .toList())
                .build();
        responseObserver.onNext(paintingResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllByAuthor(AllPaintingByAuthorRequest request,
                               StreamObserver<PaintingResponse> responseObserver) {

        ArtistEntity artist =
                artistRepository.findById(UUID.fromString(request.getId())).orElseThrow(() -> new NotFoundException(
                        "Can't find artist"));
        Page<PaintingEntity> list = paintingRepository.getAllByArtist(artist,
                PageRequest.of(request.getPageNumber(),
                        request.getPageSize()));

        PaintingResponse paintingResponse = PaintingResponse.newBuilder().addAllAllpainting(list.stream()
                        .map(painting -> Painting.newBuilder()
                                .setId(painting.getId().toString())
                                .setTitle(painting.getTitle())
                                .setDescription(painting.getDescription())
                                .setContent(painting.getContent())
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
        PaintingEntity paintingEntity = paintingRepository.findById(UUID.fromString(request.getId()))
                .orElseThrow(() -> new NotFoundException("Can't find painting"));

        Painting painting = Painting.newBuilder()
                .setId(paintingEntity.getId().toString())
                .setTitle(paintingEntity.getTitle())
                .setDescription(paintingEntity.getDescription())
                .setContent(paintingEntity.getContent())
                .setArtist(toGrpcMessage(paintingEntity.getArtist()))
                .build();

        responseObserver.onNext(painting);
        responseObserver.onCompleted();
    }


}
