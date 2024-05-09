package rococo.api.interceptor;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;
import rococo.jupiter.extention.ApiForClientExtension;
import rococo.jupiter.extention.ApiLoginExtension;
import rococo.jupiter.extention.ContextHolderExtension;

public class CodeForApiInterceptor implements Interceptor {
  @Override
  public Response intercept(Chain chain) throws IOException {
    final Response response = chain.proceed(chain.request());
    if (response.isRedirect()) {
      final String location = response.header("Location");
      if (location.contains("code=")) {
        final String code = StringUtils.substringAfter(location, "code=");
        ApiForClientExtension.setCode(
            ContextHolderExtension.Holder.INSTANCE.context(),
            code
        );
      }
    }
    return response;
  }
}
