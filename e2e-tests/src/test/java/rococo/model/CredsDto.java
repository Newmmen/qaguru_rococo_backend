package rococo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public record CredsDto(
    @JsonIgnore String userName,
    @JsonIgnore String password
) {
}
