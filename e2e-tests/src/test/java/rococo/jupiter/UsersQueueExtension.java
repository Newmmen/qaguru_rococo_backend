package rococo.jupiter;

import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;


import rococo.exception.NoDataForTest;
import rococo.model.CredsDto;
import rococo.model.UserJson;
import rococo.model.UserType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;


public class UsersQueueExtension implements BeforeEachCallback, AfterTestExecutionCallback, ParameterResolver {

    public static final ExtensionContext.Namespace USERS_NAMESPACE
            = ExtensionContext.Namespace.create(UsersQueueExtension.class);

    private static final Map<UserType, Queue<CredsDto>> USERS = new ConcurrentHashMap<>();

    static {
        Queue<CredsDto> defaultUsers = new ConcurrentLinkedQueue<>();

        defaultUsers.add(new CredsDto("admin", "admin"));
        USERS.put(UserType.DEFAULT, defaultUsers);
    }

    @Override
    public void beforeEach(ExtensionContext context) {
        List<Method> methods = new ArrayList<>();
        methods.add(context.getRequiredTestMethod());

        Arrays.stream(context.getRequiredTestClass().getDeclaredMethods())
                .filter(method -> method.isAnnotationPresent(BeforeEach.class))
                .forEach(methods::add);

        List<Parameter> parameters = methods.stream()
                .map(Executable::getParameters)
                .flatMap(Arrays::stream)
                .filter(parameter -> parameter.isAnnotationPresent(User.class))
                .filter(parameter -> parameter.getType().isAssignableFrom(CredsDto.class))
                .toList();

        Map<UserType, CredsDto> usersForSave = new HashMap<>();
        for (Parameter parameter : parameters) {
            UserType userType = parameter.getAnnotation(User.class).value();
            if (usersForSave.containsKey(userType)) {
                continue;
            }

            CredsDto testCandidate = null;
            int safeCounter = 0;
            Queue<CredsDto> queue = USERS.get(userType);
            while (testCandidate == null && safeCounter < 300) {
                testCandidate = queue.poll();
                if (testCandidate == null) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new NoDataForTest("Cant find unused user for AT");
                    }
                    safeCounter++;
                }
            }
            if (testCandidate == null) {
                throw new NoDataForTest("Cant find unused user for AT");
            }

            usersForSave.put(userType, testCandidate);
        }
        context.getStore(USERS_NAMESPACE).put(context.getUniqueId(), usersForSave);


    }


    @Override
    public void afterTestExecution(ExtensionContext context) throws Exception {
        Map<UserType, CredsDto> usersFromTest = (Map<UserType, CredsDto>) context.getStore(USERS_NAMESPACE)
                .get(context.getUniqueId(), Map.class);

        for (UserType userType : usersFromTest.keySet()) {
            USERS.get(userType).add(usersFromTest.get(userType));
        }
    }

    @Override
    public boolean supportsParameter(ParameterContext parameterContext,
                                     ExtensionContext extensionContext) throws ParameterResolutionException {
        return parameterContext.getParameter()
                .getType()
                .isAssignableFrom(UserJson.class) &&
                parameterContext.getParameter().isAnnotationPresent(User.class);
    }

    @Override
    public UserJson resolveParameter(ParameterContext parameterContext,
                                     ExtensionContext extensionContext) throws ParameterResolutionException {
        return (UserJson) extensionContext.getStore(USERS_NAMESPACE)
                .get(extensionContext.getUniqueId(), Map.class)
                .get(parameterContext.findAnnotation(User.class).get().value());
    }
}
