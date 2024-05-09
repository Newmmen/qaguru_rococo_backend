package rococo.jupiter.extention;

public class BearerStorage {
    private static final ThreadLocal<String> bearer = new ThreadLocal<>();

    public static String getCurrentBearer() {
        return bearer.get() == null ? "Bearer" : bearer.get();
    }

    public static void storeBearer(String currentBearer) {
        bearer.set(currentBearer);
    }
}
