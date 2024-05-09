package rococo.apisteps;

import javax.annotation.Nullable;
import java.io.IOException;

import io.qameta.allure.Step;
import org.openapitools.client.ApiClient;
import org.openapitools.client.api.UserControllerApi;
import org.openapitools.client.api.SessionControllerApi;
import org.openapitools.client.model.UserDto;
import org.openapitools.client.model.Pageable;


public class UserApiStep {
    private final UserControllerApi userControllerApi = new ApiClient().createService(UserControllerApi.class);
    private final SessionControllerApi sessionControllerApi = new ApiClient().createService(SessionControllerApi.class);

    @Step("try to get current user")
    public int tryToGetCurrentUser() throws IOException {
        return userControllerApi.getCurrentUser().execute().code();
    }

    @Step("try to update user")
    public int tryToUpdateUser(UserDto userDto) throws IOException {
        return userControllerApi.updateUser(userDto).execute().code();
    }

//    @Step("try to get current session")
//    public int tryToGetCurrentSession() throws IOException {
//        return sessionControllerApi.session().execute().code();
//    }

}
