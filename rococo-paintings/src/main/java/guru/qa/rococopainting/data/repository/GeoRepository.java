package guru.qa.rococopainting.data.repository;

import java.util.Optional;
import java.util.UUID;

import guru.qa.rococopainting.data.entity.CountryEntity;
import guru.qa.rococopainting.data.entity.GeolocationEntity;
import jakarta.annotation.Nonnull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeoRepository extends JpaRepository<GeolocationEntity, UUID> {

    @Nonnull
    Optional<GeolocationEntity> findByCity(@Nonnull String city);


}
