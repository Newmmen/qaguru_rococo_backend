package guru.qa.rococopainting.data.repository;

import java.util.UUID;

import guru.qa.rococopainting.data.entity.ArtistEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<ArtistEntity, UUID> {
}
