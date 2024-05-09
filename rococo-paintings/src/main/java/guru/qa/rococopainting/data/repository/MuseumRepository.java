package guru.qa.rococopainting.data.repository;

import java.util.UUID;

import guru.qa.rococopainting.data.entity.MuseumEntity;
import jakarta.annotation.Nonnull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MuseumRepository extends JpaRepository<MuseumEntity, UUID> {

    @Nonnull
    @Query("select mus from MuseumEntity mus where mus.title like :title")
    Page<MuseumEntity> findAllByTitleContainsIgnoreCase(
            @Nonnull @Param("title") String title,
            @Nonnull Pageable pageable
    );
}
