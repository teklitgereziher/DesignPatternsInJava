package creationalpatterns.singleton.threadsafe;

public class Government {
    // The field must be declared volatile so that double check lock would work correctly.
    private static volatile Government instance;
    public String name;

    private Government(String value) {
        name = value;
    }

    public static Government getInstance(String value) {
        // Implemented using double-checked locking (DCL) approach.
        Government result = instance;
        if (result != null) {
            return result;
        }

        synchronized(Government.class) {
            if (instance == null) {
                instance = new Government(value);
            }
        }

        return instance;
    }
}
