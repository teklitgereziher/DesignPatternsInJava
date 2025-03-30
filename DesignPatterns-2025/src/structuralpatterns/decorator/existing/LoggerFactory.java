package structuralpatterns.decorator.existing;


import java.io.IOException;
import java.util.Properties;

public class LoggerFactory {
    public String checkMedia() {
        Properties p = new Properties();
        try {
            p.load(ClassLoader.getSystemResourceAsStream("logger.properties"));
            return p.getProperty("Media");
            //fileLoggingValue.equalsIgnoreCase("ON");

        } catch (IOException e) {
            return null;
        }
    }

    //Factory Method
    public Logger getLogger() {
        if (checkMedia().equalsIgnoreCase("File")) {
            return new FileLogger();
        }
        if (checkMedia().equalsIgnoreCase("Console")) {
            return new ConsoleLogger();
        } else {
            return new ConsoleLogger();
        }
    }
}
