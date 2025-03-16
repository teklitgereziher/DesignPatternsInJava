package creationalpatterns.factorymethod.factories;

import creationalpatterns.factorymethod.interfaces.Logger;

public class DBLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println(message);
        System.out.println("Logged to Database.");
    }
}
