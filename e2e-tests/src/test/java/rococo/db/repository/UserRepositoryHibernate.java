package rococo.db.repository;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import rococo.db.EmfProvider;
import rococo.db.jpa.JpaService;
import rococo.db.model.UserAuthEntity;
import rococo.db.model.UserEntity;

import static rococo.db.Database.AUTH;


public class UserRepositoryHibernate extends JpaService implements UserRepository {

  private final PasswordEncoder pe = PasswordEncoderFactories.createDelegatingPasswordEncoder();

  public UserRepositoryHibernate() {
    super(
        Map.of(
            AUTH, EmfProvider.INSTANCE.emf(AUTH).createEntityManager()
        )
    );
  }

  @Override
  public UserAuthEntity createInAuth(UserAuthEntity user) {
    String originalPassword = user.getPassword();
    user.setPassword(pe.encode(originalPassword));
    persist(AUTH, user);
    user.setPassword(originalPassword);
    return user;
  }

  @Override
  public Optional<UserAuthEntity> findByIdInAuth(UUID id) {
    return Optional.of(entityManager(AUTH).find(UserAuthEntity.class, id));
  }

  @Override
  public void deleteInAuthById(UUID id) {
    UserAuthEntity toBeDeleted = findByIdInAuth(id).get();
    remove(AUTH, toBeDeleted);
  }
}
