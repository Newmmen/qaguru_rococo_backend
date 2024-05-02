package niffler.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public record TestData(
    @JsonIgnore String password,
    @JsonIgnore UserType userType
) {
}
