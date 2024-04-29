package guru.qa.rococopainting.data.repository;

import java.util.UUID;

import guru.qa.rococopainting.data.entity.ArtistEntity;
import guru.qa.rococopainting.data.entity.PaintingEntity;
import jakarta.annotation.Nonnull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<ArtistEntity, UUID> {


}
