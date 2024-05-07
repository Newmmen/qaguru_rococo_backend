package guru.qa.rococopainting.data.repository;

import java.util.UUID;

import guru.qa.rococopainting.data.entity.ArtistEntity;
import guru.qa.rococopainting.data.entity.PaintingEntity;
import jakarta.annotation.Nonnull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PaintingRepository extends JpaRepository<PaintingEntity, UUID> {

    @Nonnull
    Page<PaintingEntity> findAllByTitleContainsIgnoreCase(
            @Nonnull String title,
            @Nonnull Pageable pageable
    ); //todo проверить будет ли работь с пустым нейм без метода findall

    @Nonnull
    Page<PaintingEntity> findAll(
            @Nonnull Pageable pageable
    );

    @Nonnull
    Page<PaintingEntity> getAllByArtist( @Nonnull ArtistEntity artist,
            @Nonnull Pageable pageable
    );


}
