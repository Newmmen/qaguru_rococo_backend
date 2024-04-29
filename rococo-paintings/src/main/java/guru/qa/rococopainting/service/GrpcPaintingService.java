package guru.qa.rococopainting.service;

import java.util.UUID;

import guru.qa.grpc.rococo.grpc.AllCountryIdRequest;
import guru.qa.grpc.rococo.grpc.AllMuseumRequest;
import guru.qa.grpc.rococo.grpc.AllPaintingByAuthorRequest;
import guru.qa.grpc.rococo.grpc.AllPaintingRequest;
import guru.qa.grpc.rococo.grpc.Country;
import guru.qa.grpc.rococo.grpc.CountryResponse;
import guru.qa.grpc.rococo.grpc.CreatedMuseum;
import guru.qa.grpc.rococo.grpc.CreatedPainting;
import guru.qa.grpc.rococo.grpc.Museum;
import guru.qa.grpc.rococo.grpc.MuseumIdRequest;
import guru.qa.grpc.rococo.grpc.MuseumResponse;
import guru.qa.grpc.rococo.grpc.NewMuseum;
import guru.qa.grpc.rococo.grpc.NewPainting;
import guru.qa.grpc.rococo.grpc.Painting;
import guru.qa.grpc.rococo.grpc.PaintingIdRequest;
import guru.qa.grpc.rococo.grpc.PaintingResponse;
import guru.qa.grpc.rococo.grpc.RococoPaintingServiceGrpc;
import guru.qa.rococopainting.data.entity.ArtistEntity;
import guru.qa.rococopainting.data.entity.CountryEntity;
import guru.qa.rococopainting.data.entity.GeolocationEntity;
import guru.qa.rococopainting.data.entity.MuseumEntity;
import guru.qa.rococopainting.data.entity.PaintingEntity;
import guru.qa.rococopainting.data.repository.ArtistRepository;
import guru.qa.rococopainting.data.repository.CountryRepository;
import guru.qa.rococopainting.data.repository.GeoRepository;
import guru.qa.rococopainting.data.repository.MuseumRepository;
import guru.qa.rococopainting.data.repository.PaintingRepository;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;

import static guru.qa.rococopainting.data.entity.ArtistEntity.toGrpcMessage;
import static guru.qa.rococopainting.utils.RepositoryUtil.fetchEntity;

@GrpcService
public class GrpcPaintingService extends RococoPaintingServiceGrpc.RococoPaintingServiceImplBase {

    private final PaintingRepository paintingRepository;
    private final ArtistRepository artistRepository;
    private final MuseumRepository museumRepository;
    private final CountryRepository countryRepository;
    private final GeoRepository geoRepository;


    @Autowired
    public GrpcPaintingService(PaintingRepository paintingRepository,
                               ArtistRepository artistRepository,
                               MuseumRepository museumRepository,
                               CountryRepository countryRepository,
                               GeoRepository geoRepository) {
        this.paintingRepository = paintingRepository;
        this.artistRepository = artistRepository;
        this.museumRepository = museumRepository;
        this.countryRepository = countryRepository;
        this.geoRepository = geoRepository;
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
    public void getAllMuseums(AllMuseumRequest request,
                              StreamObserver<MuseumResponse> responseObserver) {
        Page<MuseumEntity> list;

        //todo разобраться с кейсом, когда getName().equals(" ")
        if (request.getName().equals(" ")) {
            list = museumRepository.findAll(PageRequest.of(request.getPageNumber(), request.getPageSize()));
        } else {
            list = museumRepository.findAllByTitleContainsIgnoreCase(request.getName(),
                    PageRequest.of(request.getPageNumber(),
                            request.getPageSize()));
        }


        MuseumResponse museumResponse = MuseumResponse.newBuilder().addAllAllMuseum(list.stream()
                        .map(museum -> Museum.newBuilder()
                                .setId(museum.getId().toString())
                                .setTitle(museum.getTitle())
                                .setDescription(museum.getDescription())
                                .setPhoto(museum.getPhoto())
                                .setGeo(GeolocationEntity.toGrpcMessage(museum.getGeolocationEntity()))
                                .build())
                        .toList())
                .build();
        responseObserver.onNext(museumResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllCountry(AllCountryIdRequest request,
                              StreamObserver<CountryResponse> responseObserver) {
        Page<CountryEntity> list = countryRepository.findAll(
                PageRequest.of(request.getPageNumber(),
                        request.getPageSize()));


        CountryResponse countryResponse = CountryResponse.newBuilder().addAllAllCountry(list.stream()
                        .map(country -> Country.newBuilder()
                                .setId(country.getId().toString())
                                .setName(country.getName())
                                .build())
                        .toList())
                .build();
        responseObserver.onNext(countryResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllByAuthor(AllPaintingByAuthorRequest request,
                               StreamObserver<PaintingResponse> responseObserver) {

        ArtistEntity artist =
                fetchEntity(artistRepository.findById(UUID.fromString(request.getId())));
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
        PaintingEntity paintingEntity = fetchEntity(paintingRepository.findById(UUID.fromString(request.getId())));

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

    @Override
    public void getMuseum(MuseumIdRequest request,
                          StreamObserver<Museum> responseObserver) {
        MuseumEntity museumEntity = fetchEntity(museumRepository.findById(UUID.fromString(request.getId())));

        Museum museum = Museum.newBuilder()
                .setId(museumEntity.getId().toString())
                .setTitle(museumEntity.getTitle())
                .setDescription(museumEntity.getDescription())
                .setPhoto(museumEntity.getPhoto())
                .setGeo(GeolocationEntity.toGrpcMessage(museumEntity.getGeolocationEntity()))
                .build();

        responseObserver.onNext(museum);
        responseObserver.onCompleted();
    }

    @Override
    public void createPainting(NewPainting request,
                               StreamObserver<CreatedPainting> responseObserver) {
        ArtistEntity artistEntity =
                fetchEntity(artistRepository.findById(UUID.fromString(request.getArtist().getId())));
        MuseumEntity museumEntity =
                fetchEntity(museumRepository.findById(UUID.fromString(request.getMuseum().getId())));
        PaintingEntity paintingEntity = new PaintingEntity();
        paintingEntity.setTitle(request.getTitle());
        paintingEntity.setDescription(request.getDescription());
        paintingEntity.setContent(request.getContent());
        paintingEntity.setArtist(artistEntity);
        paintingEntity.setMuseum(museumEntity);
        paintingEntity = paintingRepository.save(paintingEntity);


        CreatedPainting createdPainting = CreatedPainting.newBuilder()
                .setId(paintingEntity.getId().toString())
                .setTitle(paintingEntity.getTitle())
                .setDescription(paintingEntity.getDescription())
                .setContent(paintingEntity.getContent())
                .setArtist(ArtistEntity.toGrpcMessage(paintingEntity.getArtist()))
                .setMuseum(MuseumEntity.toGrpcMessage(paintingEntity.getMuseum()))
                .build();
        responseObserver.onNext(createdPainting);
        responseObserver.onCompleted();
    }

    @Transactional
    @Override
    public void createMuseum(NewMuseum request,
                             StreamObserver<CreatedMuseum> responseObserver) {

        MuseumEntity museumEntity = new MuseumEntity();
        CountryEntity countryEntity =
                fetchEntity(countryRepository.findById(UUID.fromString(request.getGeo().getCountry().getId())));
        GeolocationEntity geolocationEntity = geoRepository.findByCity(request.getGeo().getCity())
                .orElseGet(() -> {
                            GeolocationEntity geo = new GeolocationEntity();
                            geo.setCity(request.getGeo().getCity());
                            geo.setCountryEntity(countryEntity);
                            geoRepository.save(geo);
                            return geo;
                        }
                );
        museumEntity.setTitle(request.getTitle());
        museumEntity.setDescription(request.getDescription());
        museumEntity.setPhoto(request.getPhoto());
        museumEntity.setGeolocationEntity(geolocationEntity);
        MuseumEntity createdMuseumEntity = museumRepository.save(museumEntity);

        CreatedMuseum createdMuseum = CreatedMuseum.newBuilder()
                .setId(createdMuseumEntity.getId().toString())
                .setTitle(createdMuseumEntity.getTitle())
                .setDescription(createdMuseumEntity.getDescription())
                .setPhoto(createdMuseumEntity.getPhoto())
                .setGeo(GeolocationEntity.toGrpcMessage(geolocationEntity))
                .build();
        responseObserver.onNext(createdMuseum);
        responseObserver.onCompleted();
    }

    @Override
    public void updateMuseum(Museum request,
                             StreamObserver<Museum> responseObserver) {

        MuseumEntity museumEntity = fetchEntity(museumRepository.findById(UUID.fromString(request.getId())));


        CountryEntity countryEntity =
                fetchEntity(countryRepository.findById(UUID.fromString(request.getGeo().getCountry().getId())));
        GeolocationEntity geolocationEntity = geoRepository.findByCity(request.getGeo().getCity())
                .orElseGet(() -> {
                            GeolocationEntity geo = new GeolocationEntity();
                            geo.setCity(request.getGeo().getCity());
                            geo.setCountryEntity(countryEntity);
                            geoRepository.save(geo);
                            return geo;
                        }
                );

        museumEntity.setTitle(request.getTitle());
        museumEntity.setDescription(request.getDescription());
        museumEntity.setPhoto(request.getPhoto());
        museumEntity.setGeolocationEntity(geolocationEntity);
        MuseumEntity updatedMuseumEntity = museumRepository.save(museumEntity);

        Museum museum = Museum.newBuilder()
                .setId(updatedMuseumEntity.getId().toString())
                .setTitle(updatedMuseumEntity.getTitle())
                .setDescription(updatedMuseumEntity.getDescription())
                .setPhoto(updatedMuseumEntity.getPhoto())
                .setGeo(GeolocationEntity.toGrpcMessage(updatedMuseumEntity.getGeolocationEntity()))
                .build();

        responseObserver.onNext(museum);
        responseObserver.onCompleted();
    }
}
