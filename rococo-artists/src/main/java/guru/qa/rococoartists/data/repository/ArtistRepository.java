package guru.qa.rococoartists.data.repository;

import java.util.UUID;

import guru.qa.rococoartists.data.model.ArtistEntity;
import jakarta.annotation.Nonnull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ArtistRepository extends JpaRepository<ArtistEntity, UUID> {

    @Nonnull
    @Query("select art from ArtistEntity art where name like :name")
    Page<ArtistEntity> findAllByNameContainsIgnoreCase(
            @Nonnull @Param("name")String name,
            @Nonnull Pageable pageable
    );
}
