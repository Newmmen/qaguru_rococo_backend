package guru.qa.rococopainting.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import guru.qa.grpc.rococo.grpc.AllMuseumRequest;
import guru.qa.grpc.rococo.grpc.AllPaintingRequest;
import guru.qa.grpc.rococo.grpc.Country;
import guru.qa.grpc.rococo.grpc.Geo;
import guru.qa.grpc.rococo.grpc.Museum;
import guru.qa.grpc.rococo.grpc.MuseumIdRequest;
import guru.qa.grpc.rococo.grpc.MuseumResponse;
import guru.qa.grpc.rococo.grpc.Painting;
import guru.qa.grpc.rococo.grpc.PaintingIdRequest;
import guru.qa.grpc.rococo.grpc.PaintingResponse;
import guru.qa.grpc.rococo.grpc.RococoMuseumServiceGrpc;

import guru.qa.rococopainting.model.MuseumDto;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;


@GrpcService
public class GrpcMuseumService extends RococoMuseumServiceGrpc.RococoMuseumServiceImplBase {


    @Override
    public void getAllMuseums(AllMuseumRequest request,
                              StreamObserver<MuseumResponse> responseObserver) {
        List<MuseumDto> list = new ArrayList<>();


        MuseumResponse museumResponse = MuseumResponse.newBuilder().addAllAllMuseum(list.stream()
                        .map(museum -> Museum.newBuilder()
                                .setId(museum.id().toString())
                                .setPhoto(museum.photo())
                                .setTitle(museum.description())
                                .setDescription(museum.description())
                                .setGeo(Geo.newBuilder()
                                        .setCity(museum.geo().city())
                                        .setCountry(Country.newBuilder()
                                                .setId(museum.geo().country().id().toString())
                                                .setName(museum.geo().country().name())
                                                .build()))
                                .build())
                        .toList())
                .build();
        responseObserver.onNext(museumResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getMuseum(MuseumIdRequest request,
                          StreamObserver<Museum> responseObserver) {
        MuseumDto museumDto = null;

        Museum museum = Museum.newBuilder()
                .setId(museumDto.id().toString())
                .setPhoto(museumDto.photo())
                .setTitle(museumDto.description())
                .setDescription(museumDto.description())
                .setGeo(Geo.newBuilder()
                        .setCity(museumDto.geo().city())
                        .setCountry(Country.newBuilder()
                                .setId(museumDto.geo().country().id().toString())
                                .setName(museumDto.geo().country().name())
                                .build())
                        .build())
                .build();

        responseObserver.onNext(museum);
        responseObserver.onCompleted();
    }


}
