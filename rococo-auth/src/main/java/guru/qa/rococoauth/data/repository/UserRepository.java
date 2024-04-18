package guru.qa.rococoauth.data.repository;

import java.util.UUID;

import guru.qa.rococoauth.data.UserEntity;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {

    @Nullable
    UserEntity findByUsername(@Nonnull String username);
}
