package creationalpatterns.factorymethod.interfaces;

public interface Logger {
    /**
     * To be used by the client objects to log messages.
     * In general, an incoming message could be logged to different output media,
     * in different formats. Different concrete implementer classes of the Logger interface
     * can handle these differences in implementation.
     * @param message
     */
    public void log(String message);

    // Suppose that the overall application
    //message logging configuration can be specified using the logger.properties
    //property file.
}
