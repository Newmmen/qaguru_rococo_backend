package guru.qa.rococoartists.service;

import java.util.UUID;

import guru.qa.grpc.rococo.grpc.AllArtistRequest;
import guru.qa.grpc.rococo.grpc.Artist;
import guru.qa.grpc.rococo.grpc.ArtistIdRequest;
import guru.qa.grpc.rococo.grpc.ArtistResponse;
import guru.qa.grpc.rococo.grpc.NewArtist;
import guru.qa.grpc.rococo.grpc.RococoArtistServiceGrpc;
import guru.qa.rococoartists.data.model.ArtistEntity;
import guru.qa.rococoartists.data.repository.ArtistRepository;
import guru.qa.rococoartists.exception.NotFoundException;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@GrpcService
public class GrpcArtistService extends RococoArtistServiceGrpc.RococoArtistServiceImplBase {

    private final ArtistRepository artistRepository;

    public GrpcArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }


    @Override
    public void getAllArtists(AllArtistRequest request, StreamObserver<ArtistResponse> responseObserver) {
        Page<ArtistEntity> list = artistRepository.findAllByNameContainsIgnoreCase(request.getName(),
                PageRequest.of(request.getPageNumber(),
                        request.getPageSize()));

        ArtistResponse artistResponse = ArtistResponse.newBuilder().addAllAllArtists(list.stream()
                        .map(artist -> Artist.newBuilder()
                                .setId(artist.getId().toString())
                                .setName(artist.getName())
                                .setBiography(artist.getBiography())
                                .setPhoto(artist.getPhoto())
                                .build())
                        .toList())
                .build();
        responseObserver.onNext(artistResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getArtist(ArtistIdRequest request, StreamObserver<Artist> responseObserver) {
        ArtistEntity artist = artistRepository.findById(UUID.fromString(request.getId()))
                .orElseThrow(() -> new NotFoundException("Can't find artist"));

        Artist artistResponse = Artist.newBuilder()
                .setId(artist.getId().toString())
                .setName(artist.getName())
                .setBiography(artist.getBiography())
                .setPhoto(artist.getPhoto())
                .build();
        responseObserver.onNext(artistResponse);
        responseObserver.onCompleted();

    }

    @Override
    public void createArtist(NewArtist request, StreamObserver<Artist> responseObserver) {
        ArtistEntity artistEntity = new ArtistEntity();
        artistEntity.setBiography(request.getBiography());
        artistEntity.setName(request.getName());
        artistEntity.setPhoto(request.getPhoto());

        ArtistEntity createdArtist = artistRepository.save(artistEntity);


        Artist artistResponse = Artist.newBuilder()
                .setId(createdArtist.getId().toString())
                .setName(createdArtist.getName())
                .setBiography(createdArtist.getBiography())
                .setPhoto(createdArtist.getPhoto())
                .build();
        responseObserver.onNext(artistResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void updateArtist(Artist request, StreamObserver<Artist> responseObserver) {
        ArtistEntity artistEntity = artistRepository.findById(UUID.fromString(request.getId()))
                .orElseThrow(() -> new NotFoundException("Can't find artist"));

        artistEntity.setBiography(request.getBiography());
        artistEntity.setName(request.getName());
        artistEntity.setPhoto(request.getPhoto());

        ArtistEntity createdArtist = artistRepository.save(artistEntity);
        Artist artistResponse = Artist.newBuilder()
                .setId(createdArtist.getId().toString())
                .setName(createdArtist.getName())
                .setBiography(createdArtist.getBiography())
                .setPhoto(createdArtist.getPhoto())
                .build();
        responseObserver.onNext(artistResponse);
        responseObserver.onCompleted();
    }
}
