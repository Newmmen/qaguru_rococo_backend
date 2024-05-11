package rococo.db.repository;

import java.util.Optional;
import java.util.UUID;

import rococo.db.model.UserEntity;


public interface UserRepository {

    UserEntity createInAuth(UserEntity user);

    Optional<UserEntity> findByIdInAuth(UUID id);

    void deleteInAuthById(UUID id);

}
