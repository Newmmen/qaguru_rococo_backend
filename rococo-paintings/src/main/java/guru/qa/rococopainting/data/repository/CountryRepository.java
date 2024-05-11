package guru.qa.rococopainting.data.repository;

import java.util.UUID;

import guru.qa.rococopainting.data.entity.CountryEntity;
import jakarta.annotation.Nonnull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<CountryEntity, UUID> {

    @Nonnull
    Page<CountryEntity> findAll(
            @Nonnull Pageable pageable
    );
}
