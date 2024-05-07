package guru.qa.rococopainting.data.repository;

import java.util.UUID;

import guru.qa.rococopainting.data.entity.ArtistEntity;
import guru.qa.rococopainting.data.entity.MuseumEntity;
import guru.qa.rococopainting.data.entity.PaintingEntity;
import jakarta.annotation.Nonnull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MuseumRepository extends JpaRepository<MuseumEntity, UUID> {

    @Nonnull
    Page<MuseumEntity> findAllByTitleContainsIgnoreCase(
            @Nonnull String title,
            @Nonnull Pageable pageable
    ); //todo проверить будет ли работь с пустым нейм без метода findall

    @Nonnull
    Page<MuseumEntity> findAll(@Nonnull Pageable pageable
    );


}
