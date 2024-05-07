package rococo.db.repository;

import java.util.Optional;
import java.util.UUID;

import rococo.db.model.UserAuthEntity;


public interface UserRepository {

  UserAuthEntity createInAuth(UserAuthEntity user);

  Optional<UserAuthEntity> findByIdInAuth(UUID id);


  void deleteInAuthById(UUID id);

}
