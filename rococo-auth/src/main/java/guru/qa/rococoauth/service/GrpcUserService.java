package guru.qa.rococoauth.service;

import guru.qa.grpc.rococo.grpc.Painting;
import guru.qa.grpc.rococo.grpc.PaintingResponse;
import guru.qa.grpc.rococo.grpc.RococoUserServiceGrpc;
import guru.qa.grpc.rococo.grpc.User;
import guru.qa.grpc.rococo.grpc.UserIdRequest;
import guru.qa.rococoauth.data.UserEntity;
import guru.qa.rococoauth.data.repository.UserRepository;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import static com.google.common.base.Strings.nullToEmpty;


@GrpcService
public class GrpcUserService extends RococoUserServiceGrpc.RococoUserServiceImplBase {

    private final UserRepository userRepository;

    public GrpcUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void getUser(UserIdRequest request,
                        StreamObserver<User> responseObserver) {
        UserEntity userEntity = userRepository.findByUsername(request.getUsername());

        User user = User.newBuilder()
                .setId(userEntity.getId().toString())
                //  .setFirstname(userEntity.getFirstName())
                //  .setLastname(userEntity.getLastName())
                .setUsername(userEntity.getUsername())
                .build();

        responseObserver.onNext(user);
        responseObserver.onCompleted();
    }

    @Override
    public void updateUser(User request,
                           StreamObserver<User> responseObserver) {
        UserEntity userEntity = userRepository.findByUsername(request.getUsername());

        userEntity.setUsername(request.getUsername());
        userEntity.setLastName(request.getLastname());
        userEntity.setFirstName(request.getFirstname());
        userEntity.setAvatar(request.getAvatar());

        UserEntity created = userRepository.save(userEntity);

        User.Builder userBuilder = User.newBuilder();

        if (!nullToEmpty(created.getFirstName()).trim().isEmpty()) {
            userBuilder.setFirstname(created.getFirstName());
        }
        if (!nullToEmpty(created.getLastName()).trim().isEmpty()) {
            userBuilder.setLastname(created.getLastName());
        }
        if (!nullToEmpty(created.getAvatar()).trim().isEmpty()) {
            userBuilder.setAvatar(created.getAvatar());
        }

        User user = userBuilder
                .setUsername(created.getUsername())
                .setId(created.getId().toString())
                .build();

        responseObserver.onNext(user);
        responseObserver.onCompleted();
    }

}
