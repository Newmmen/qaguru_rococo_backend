package rococo.jupiter.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.extension.ExtendWith;
import rococo.jupiter.extention.ApiForClientExtension;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ApiForClientLogin {

  String username() default "apilogin";

  String password() default "admin";

  DbUser user() default @DbUser(runnable = false);
}
