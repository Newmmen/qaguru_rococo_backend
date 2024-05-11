package rococo.test.user;


import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openapitools.client.model.UserDto;
import rococo.apisteps.UserApiStep;
import rococo.jupiter.extention.ApiLoginExtension;
import rococo.jupiter.extention.ContextHolderExtension;

@Tag("API")
@DisplayName("API user vaidation tests")
@ExtendWith({ContextHolderExtension.class, ApiLoginExtension.class})
public class UserValidationTest {
    private final UserApiStep userApiStep = new UserApiStep();
    private final int HTTP_UNAUTHORIZED = 401;

    @Test
    @DisplayName("check unauthorized user cannot get self information")
    void checkUnauthorizedUserCannotGetSelfInfo() throws IOException {
        int code = userApiStep.tryToGetCurrentUser();
        Assertions.assertEquals(HTTP_UNAUTHORIZED, code);
    }

    @Test
    @DisplayName("check unauthorized user cannot update user")
    void checkUnauthorizedUserCannotUpdateUser() throws IOException {
        UserDto userDto = new UserDto();

        int code = userApiStep.tryToUpdateUser(userDto);
        Assertions.assertEquals(HTTP_UNAUTHORIZED, code);
    }

}