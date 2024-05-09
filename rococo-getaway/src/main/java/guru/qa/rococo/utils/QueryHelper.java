package guru.qa.rococo.utils;

import jakarta.validation.constraints.NotNull;
import lombok.experimental.UtilityClass;

@UtilityClass
public class QueryHelper {

    @NotNull
    public static String wrapFilter(@NotNull String filter) {
        return "%" + filter + "%";
    }
}
