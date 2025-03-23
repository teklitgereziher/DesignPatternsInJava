package creationalpatterns.singleton;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger {
    private static FileLogger logger;

    // Prevent clients from using the constructor
    private FileLogger() {
    }

    public static FileLogger getInstance() {
        if (logger == null) {
            logger = new FileLogger();
        }

        return logger;
    }

    public synchronized void log(String msg) {
        try {
            FileWriter myWriter = new FileWriter("./filename.txt");
            myWriter.write(msg);
            myWriter.close();
            System.out.println("Logged to File.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
