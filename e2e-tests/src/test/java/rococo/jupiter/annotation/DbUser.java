package rococo.jupiter.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.extension.ExtendWith;
import rococo.jupiter.extention.CreateUserExtension;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@ExtendWith(CreateUserExtension.class)
public @interface DbUser {

    boolean runnable() default true;

    String username() default "";

    String password() default "";
}
