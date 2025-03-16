package creationalpatterns.factorymethod.concretes;

import creationalpatterns.factorymethod.factories.ConsoleLogger;
import creationalpatterns.factorymethod.factories.DBLogger;
import creationalpatterns.factorymethod.factories.FileLogger;
import creationalpatterns.factorymethod.interfaces.Logger;

import java.io.IOException;
import java.util.Properties;

/**
 * LoggerFactory has the role of the ConcreteCreator.
 * As part of its implementation, the factory method getLogger checks the
 * logger.properties property file to see if file logging is enabled and decides
 * which Logger implementation is to be instantiated. The selected Logger implementer
 * instance is returned as an object of type Logger.
 */
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
        } if (checkMedia().equalsIgnoreCase("Console")){
            return new ConsoleLogger();
        }if (checkMedia().equalsIgnoreCase("Database")){
            return new DBLogger();
        }else {
            return new ConsoleLogger();
        }
    }
}
