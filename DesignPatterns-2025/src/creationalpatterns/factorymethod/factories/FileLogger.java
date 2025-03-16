package creationalpatterns.factorymethod.factories;

import creationalpatterns.factorymethod.interfaces.Logger;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileLogger - Stores incoming messages to a log file
 */
public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter("./filename.txt");
            myWriter.write(message);
            myWriter.close();
            System.out.println("Logged to File.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
