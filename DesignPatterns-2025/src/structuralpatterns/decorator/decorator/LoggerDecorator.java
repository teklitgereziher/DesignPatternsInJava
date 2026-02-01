package structuralpatterns.decorator.decorator;

import structuralpatterns.decorator.existing.Logger;

public class LoggerDecorator implements Logger {
    public Logger logger;

    public LoggerDecorator(Logger inp_logger) {
        logger = inp_logger;
    }

    public void log(String DataLine) {
        /*
        Default implementation
        to be overriden by subclasses.
        */
        logger.log(DataLine);
    }
}
