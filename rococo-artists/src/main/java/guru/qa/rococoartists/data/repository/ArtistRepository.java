package guru.qa.rococoartists.data.repository;

import java.util.UUID;

import guru.qa.rococoartists.data.model.ArtistEntity;
import jakarta.annotation.Nonnull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<ArtistEntity, UUID> {

    @Nonnull
    Page<ArtistEntity> findAllByNameContainsIgnoreCase(
            @Nonnull String name,
            @Nonnull Pageable pageable
    );

    @Nonnull
    Page<ArtistEntity> findAll(
            @Nonnull Pageable pageable
    );


}
