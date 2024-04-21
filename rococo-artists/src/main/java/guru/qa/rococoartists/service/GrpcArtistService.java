package guru.qa.rococoartists.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.google.protobuf.ByteString;
import guru.qa.grpc.rococo.grpc.AllArtistRequest;
import guru.qa.grpc.rococo.grpc.Artist;
import guru.qa.grpc.rococo.grpc.ArtistIdRequest;
import guru.qa.grpc.rococo.grpc.ArtistResponse;
import guru.qa.grpc.rococo.grpc.RococoArtistServiceGrpc;
import guru.qa.rococoartists.data.model.ArtistEntity;
import guru.qa.rococoartists.model.ArtistDto;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GrpcArtistService extends RococoArtistServiceGrpc.RococoArtistServiceImplBase {


    @Override
    public void getAllArtists(AllArtistRequest request, StreamObserver<ArtistResponse> responseObserver) {
        List<ArtistEntity> list = new ArrayList<>();

        ArtistResponse artistResponse = ArtistResponse.newBuilder().addAllAllArtists(list.stream()
                .map( artist -> Artist.newBuilder()
                        .setId(artist.getId().toString())
                        .setName(artist.getName())
                        .setBiography(artist.getBiography())
                        .setPhoto(ByteString.copyFrom(artist.getPhoto()))
                        .build())
                        .toList())
                .build();
        responseObserver.onNext(artistResponse);
        responseObserver.onCompleted();

    }

    @Override
    public void getArtist(ArtistIdRequest request, StreamObserver<Artist> responseObserver) {
        ArtistEntity artist = new ArtistEntity();
        Artist artistResponse = Artist.newBuilder()
                .setId(artist.getId().toString())
                .setName(artist.getName())
                .setBiography(artist.getBiography())
                .setPhoto(ByteString.copyFrom(artist.getPhoto()))
                .build();
        responseObserver.onNext(artistResponse);
        responseObserver.onCompleted();

    }
}
