package guru.qa.rococopainting.utils;

import java.util.Optional;

import guru.qa.rococopainting.exception.NotFoundException;

public class RepositoryUtil {

    public static <T> T fetchEntity(Optional<T> entity) {
        return entity.orElseThrow(() ->
                new NotFoundException("Can't find an object"));
    }
}
