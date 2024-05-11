package rococo.db.repository;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;


import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import rococo.db.EmfProvider;
import rococo.db.jpa.JpaService;
import rococo.db.jpa.ThreadLocalEntityManager;
import rococo.db.model.UserEntity;

import static rococo.db.Database.AUTH;

public class UserRepositoryHibernate extends JpaService implements UserRepository {

  private final PasswordEncoder pe = PasswordEncoderFactories.createDelegatingPasswordEncoder();

  public UserRepositoryHibernate() {
    super(
        Map.of(
            AUTH, new ThreadLocalEntityManager(EmfProvider.INSTANCE.emf(AUTH))
        )
    );
  }

  @Override
  public UserEntity createInAuth(UserEntity user) {
    String originalPassword = user.getPassword();
    user.setPassword(pe.encode(originalPassword));
    persist(AUTH, user);
    return user;
  }

  @Override
  public Optional<UserEntity> findByIdInAuth(UUID id) {
    return Optional.of(entityManager(AUTH).find(UserEntity.class, id));
  }


  @Override
  public void deleteInAuthById(UUID id) {
    UserEntity toBeDeleted = findByIdInAuth(id).get();
    remove(AUTH, toBeDeleted);
  }

}
