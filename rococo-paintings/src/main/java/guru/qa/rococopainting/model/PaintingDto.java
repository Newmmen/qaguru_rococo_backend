package guru.qa.rococopainting.model;

import java.util.UUID;

public record PaintingDto(UUID id, String title, String description, String content, ArtistDto artist) {
}
