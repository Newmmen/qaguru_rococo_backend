package guru.qa.rococopainting.data.repository;

import java.util.UUID;

import guru.qa.rococopainting.data.entity.ArtistEntity;
import guru.qa.rococopainting.data.entity.PaintingEntity;
import jakarta.annotation.Nonnull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PaintingRepository extends JpaRepository<PaintingEntity, UUID> {

    @Nonnull
    @Query("select paint from PaintingEntity paint where paint.title like :title")
    Page<PaintingEntity> findAllByTitleContainsIgnoreCase(
            @Nonnull @Param("title") String title,
            @Nonnull Pageable pageable
    );

    @Nonnull
    Page<PaintingEntity> getAllByArtist(@Nonnull ArtistEntity artist,
                                        @Nonnull Pageable pageable
    );
}
