package rococo.apisteps;

import java.io.IOException;

import io.qameta.allure.Step;
import org.openapitools.client.ApiClient;
import org.openapitools.client.api.UserControllerApi;
import org.openapitools.client.model.UserDto;


public class UserApiStep {
    private final UserControllerApi userControllerApi = new ApiClient().createService(UserControllerApi.class);

    @Step("try to get current user")
    public int tryToGetCurrentUser() throws IOException {
        return userControllerApi.getCurrentUser().execute().code();
    }

    @Step("try to update user")
    public int tryToUpdateUser(UserDto userDto) throws IOException {
        return userControllerApi.updateUser(userDto).execute().code();
    }
}
