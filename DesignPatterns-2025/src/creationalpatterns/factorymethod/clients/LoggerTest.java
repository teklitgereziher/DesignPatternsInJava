package creationalpatterns.factorymethod.clients;

import creationalpatterns.factorymethod.concretes.LoggerFactory;
import creationalpatterns.factorymethod.interfaces.Logger;

/**
 * To log messages, an application object such as the LoggerTest needs to:
 *  Identify an appropriate Logger implementer by reading the FileLogging
 * property value from the logger.properties file
 *  Instantiate the Logger implementer and invoke the log method by
 * passing the message text to be logged as an argument
 *
 * This requires every application object to:
 *  Be aware of the existence and the functionality of all implementers of the
 * Logger interface and their subclasses
 *  Provide the implementation required to select and instantiate an appropriate
 * Logger implementer
 */
public class LoggerTest {
    public static void main(String[] args) {
        LoggerFactory factory = new LoggerFactory();
        Logger logger = factory.getLogger();
        logger.log("A Message to Log");
    }
}
