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

}
