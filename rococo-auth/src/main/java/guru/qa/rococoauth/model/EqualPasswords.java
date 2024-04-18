package guru.qa.rococoauth.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import guru.qa.rococoauth.service.EqualPasswordsValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {EqualPasswordsValidator.class})
public @interface EqualPasswords {
    String message() default "Passwords should be equal";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
