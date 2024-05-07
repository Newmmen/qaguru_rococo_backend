package rococo.api;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import rococo.model.SpendJson;

public interface SpendApi {

  @POST("/addSpend")
  Call<SpendJson> addSpend(@Body SpendJson spend);
}
