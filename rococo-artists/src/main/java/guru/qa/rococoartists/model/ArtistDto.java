package guru.qa.rococoartists.model;

import java.util.UUID;

public record ArtistDto(UUID id, String name, String biography, String photo) {
}
