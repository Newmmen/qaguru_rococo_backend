package rococo.test.user;


import java.io.IOException;
import java.util.UUID;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openapitools.client.model.NewPaintingDto;
import org.openapitools.client.model.Pageable;
import org.openapitools.client.model.UserDto;
import rococo.apisteps.UserApiStep;
import rococo.jupiter.extention.ApiLoginExtension;
import rococo.jupiter.extention.ContextHolderExtension;
import rococo.jupiter.extention.CreateUserExtension;


@ExtendWith({ContextHolderExtension.class, CreateUserExtension.class, ApiLoginExtension.class})
public class UserValidationTest {
    private final UserApiStep userApiStep = new UserApiStep();
    private Pageable pageable = new Pageable();
    private final int HTTP_SUCCESSFUL = 200;
    private final int HTTP_UNAUTHORIZED = 401;

    @BeforeEach
    void setUp() {
        pageable.setPage(18);
        pageable.setSize(0);
    }

    @Test
    @DisplayName("check unauthorized user cannot get self information")
    void checkUnauthorizedUserCannotGetSelfInfo() throws IOException {
        int code = userApiStep.tryToGetCurrentUser();
        Assertions.assertEquals(HTTP_UNAUTHORIZED, code);
    }

//    @Test
//    @DisplayName("check unauthorized user cannot get session")
//    void checkUnauthorizedUserCannotGetSession() throws IOException {
//        int code = userApiStep.tryToGetCurrentSession();
//        Assertions.assertEquals(HTTP_UNAUTHORIZED, code);
//    }

    @Test
    @DisplayName("check unauthorized user cannot update user")
    void checkUnauthorizedUserCannotUpdateUser() throws IOException {
        UserDto userDto = new UserDto();
        userDto.setAvatar("sample");
        userDto.setUsername("name");
        userDto.setLastname("lastname");

        int code = userApiStep.tryToUpdateUser(userDto);
        Assertions.assertEquals(HTTP_UNAUTHORIZED, code);
    }

}