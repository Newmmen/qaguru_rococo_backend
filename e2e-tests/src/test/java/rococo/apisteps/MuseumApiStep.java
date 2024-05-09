package rococo.apisteps;

import javax.annotation.Nullable;
import java.io.IOException;

import io.qameta.allure.Step;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.openapitools.client.ApiClient;
import org.openapitools.client.api.MuseumControllerApi;
import org.openapitools.client.model.CreatedMuseumDto;
import org.openapitools.client.model.MuseumDto;
import org.openapitools.client.model.NewMuseumDto;
import org.openapitools.client.model.CountryDto;
import org.openapitools.client.model.PageCountryDto;
import org.openapitools.client.model.Pageable;
import org.openapitools.client.auth.HttpBearerAuth;
import rococo.api.interceptor.CodeInterceptor;
import rococo.jupiter.extention.BearerStorage;


public class MuseumApiStep {
    private final HttpBearerAuth httpBearerAuth = new HttpBearerAuth("bearer");
    private final MuseumControllerApi museumControllerApi = new ApiClient().createService(MuseumControllerApi.class);
    private final ApiClient apiClient = new ApiClient();


    @Step("try to get all museums and return response code")
    public int getAllMuseumResponseCode(Pageable pageable, @Nullable String name) throws IOException {
        return museumControllerApi.getAllMuseums(pageable, name).execute().code();
    }

    @Step("try to create new museum")
    public int tryToCreateNewMuseum(NewMuseumDto museumDto) throws IOException {
        return museumControllerApi.createMuseum(museumDto).execute().code();
    }
    @Step("create new museum")
    public CreatedMuseumDto createNewMuseum(NewMuseumDto museumDto) throws IOException {
        apiClient.addAuthorization("api", httpBearerAuth).setBearerToken(BearerStorage.getCurrentBearer());
        MuseumControllerApi api = apiClient.createService(MuseumControllerApi.class);
        return api.createMuseum(museumDto).execute().body();
    }

    @Step("try to update museum")
    public int tryToUpdateMuseum(MuseumDto museumDto) throws IOException {
        return museumControllerApi.updateMuseum(museumDto).execute().code();
    }

    @Step("try to get all countries")
    public int tryToGetAllCountries(Pageable pageable) throws IOException {
        return museumControllerApi.getAllCountries(pageable).execute().code();
    }

    @Step("get all countries")
    public PageCountryDto getAllCountries(Pageable pageable) throws IOException {
        apiClient.addAuthorization("api", httpBearerAuth).setBearerToken(BearerStorage.getCurrentBearer());
        MuseumControllerApi api = apiClient.createService(MuseumControllerApi.class);
        return api.getAllCountries(pageable).execute().body();
    }

    @Step("get country by name")
    public CountryDto getCountryByName(Pageable pageable, String countryName) throws IOException {
        apiClient.addAuthorization("api", httpBearerAuth).setBearerToken(BearerStorage.getCurrentBearer());
        MuseumControllerApi api = apiClient.createService(MuseumControllerApi.class);
        return api.getAllCountries(pageable).execute().body().getContent()
                .stream()
                .filter(countryDto -> countryDto.getName().equals(countryName))
                .findFirst()
                .orElseThrow(()-> new RuntimeException("Cannot find country by country name"));
    }
}
