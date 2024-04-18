package guru.qa.rococoartists.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import guru.qa.grpc.rococo.grpc.AllArtistRequest;
import guru.qa.grpc.rococo.grpc.Artist;
import guru.qa.grpc.rococo.grpc.ArtistIdRequest;
import guru.qa.grpc.rococo.grpc.ArtistResponse;
import guru.qa.grpc.rococo.grpc.RococoArtistServiceGrpc;
import guru.qa.rococoartists.model.ArtistDto;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GrpcArtistService extends RococoArtistServiceGrpc.RococoArtistServiceImplBase {


    @Override
    public void getAllArtists(AllArtistRequest request, StreamObserver<ArtistResponse> responseObserver) {
        List<ArtistDto> list = new ArrayList<>();
        list.add(new ArtistDto(UUID.randomUUID(), "ArtistName", "bfsfsdf", "sdfsdfsf"));

        ArtistResponse artistResponse = ArtistResponse.newBuilder().addAllAllArtists(list.stream()
                .map( artist -> Artist.newBuilder()
                        .setId(artist.id().toString())
                        .setName(artist.name())
                        .setBiography(artist.biography())
                        .setPhoto(artist.photo())
                        .build())
                        .toList())
                .build();
        responseObserver.onNext(artistResponse);
        responseObserver.onCompleted();

    }

    @Override
    public void getArtist(ArtistIdRequest request, StreamObserver<Artist> responseObserver) {
        ArtistDto artistDto = new ArtistDto(UUID.randomUUID(), "ArtistName", "bfsfsdf", "sdfsdfsf");
        Artist artist = Artist.newBuilder()
                .setId(artistDto.id().toString())
                .setName(artistDto.name())
                .setBiography(artistDto.biography())
                .setPhoto(artistDto.photo())
                .build();
        responseObserver.onNext(artist);
        responseObserver.onCompleted();

    }
}
