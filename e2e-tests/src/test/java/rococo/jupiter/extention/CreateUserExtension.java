package rococo.jupiter.extention;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;
import org.junit.platform.commons.support.AnnotationSupport;
import rococo.db.model.Authority;
import rococo.db.model.AuthorityEntity;
import rococo.db.model.UserAuthEntity;
import rococo.db.model.UserEntity;
import rococo.db.repository.UserRepository;
import rococo.db.repository.UserRepositoryHibernate;
import rococo.jupiter.annotation.ApiLogin;
import rococo.jupiter.annotation.DbUser;
import rococo.utils.DataUtils;

public class CreateUserExtension implements BeforeEachCallback, AfterTestExecutionCallback, ParameterResolver {

  public static final ExtensionContext.Namespace DB_CREATE_USER_NAMESPACE
      = ExtensionContext.Namespace.create(CreateUserExtension.class);

  //private static UserRepository userRepository = new UserRepositoryHibernate();


  @Override
  public void beforeEach(ExtensionContext extensionContext) throws Exception {
    Optional<ApiLogin> apiLoginAnnotation = AnnotationSupport.findAnnotation(
            extensionContext.getRequiredTestMethod(),
            ApiLogin.class
    );
    boolean apiLoginB = false;
    if (apiLoginAnnotation.isPresent()) {
      ApiLogin apiLogin = apiLoginAnnotation.get();
      apiLoginB = apiLogin.user().runnable();
    }

    Optional<DbUser> dbUserAnnotation = AnnotationSupport.findAnnotation(
        extensionContext.getRequiredTestMethod(),
        DbUser.class
    );

    if (dbUserAnnotation.isPresent() || apiLoginB) {
      DbUser dbUser = apiLoginB
              ? apiLoginAnnotation.get().user()
              : dbUserAnnotation.get();
      String username = dbUser.username().isEmpty()
          ? DataUtils.generateRandomUsername()
          : dbUser.username();
      String password = dbUser.password().isEmpty()
          ? "12345"
          : dbUser.password();

      UserAuthEntity userAuth = new UserAuthEntity();
      userAuth.setUsername(username);
      userAuth.setPassword(password);
      userAuth.setEnabled(true);
      userAuth.setAccountNonExpired(true);
      userAuth.setAccountNonLocked(true);
      userAuth.setCredentialsNonExpired(true);//todo УБРАТЬ АВТОРИТИЬ
      AuthorityEntity[] authorities = Arrays.stream(Authority.values()).map(
          a -> {
            AuthorityEntity ae = new AuthorityEntity();
            ae.setAuthority(a);
            return ae;
          }
      ).toArray(AuthorityEntity[]::new);

      userAuth.addAuthorities(authorities);

      UserEntity user = new UserEntity();
      user.setUsername(username);

      Map<String, Object> createdUser = Map.of(
          "auth", userAuth,
          "userdata", user
      );

      extensionContext.getStore(DB_CREATE_USER_NAMESPACE).put(extensionContext.getUniqueId(), createdUser);
    }
  }

  @Override
  public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
//    Map createdUser = extensionContext.getStore(DB_CREATE_USER_NAMESPACE)
//        .get(extensionContext.getUniqueId(), Map.class);
//    userRepository.deleteInAuthById(((UserAuthEntity) createdUser.get("auth")).getId());
  }

  @Override
  public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
    return AnnotationSupport.findAnnotation(extensionContext.getRequiredTestMethod(), DbUser.class)
        .isPresent() &&
        parameterContext.getParameter().getType().isAssignableFrom(UserAuthEntity.class);
  }

  @Override
  public UserAuthEntity resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
    return (UserAuthEntity) extensionContext.getStore(DB_CREATE_USER_NAMESPACE).get(extensionContext.getUniqueId(), Map.class)
        .get("auth");
  }
}
