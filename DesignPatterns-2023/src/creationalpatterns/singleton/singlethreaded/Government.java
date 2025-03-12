package creationalpatterns.singleton.singlethreaded;

public final class Government {
    private static Government instance;
    public String name;

    private Government(String value) {
        name = value;
    }

    public static Government getInstance(String value) {
        if (instance == null) {
            instance = new Government(value);
        }

        return instance;
    }
}
