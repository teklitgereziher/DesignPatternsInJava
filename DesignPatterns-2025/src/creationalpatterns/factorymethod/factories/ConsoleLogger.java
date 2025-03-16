package creationalpatterns.factorymethod.factories;

import creationalpatterns.factorymethod.interfaces.Logger;

/**
 * ConsoleLogger - Displays incoming messages on the screen
 */
public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println(message);
        System.out.println("Logged to Console");
    }
}
