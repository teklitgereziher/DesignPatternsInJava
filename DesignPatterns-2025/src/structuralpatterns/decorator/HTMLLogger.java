package structuralpatterns.decorator;

import structuralpatterns.decorator.decorator.LoggerDecorator;
import structuralpatterns.decorator.existing.Logger;

public class HTMLLogger extends LoggerDecorator {
    public HTMLLogger(Logger inp_logger) {
        super(inp_logger);
    }

    public void log(String DataLine) {
        /*
        Added functionality
        */
        DataLine = makeHTML(DataLine);
        /*
        Now forward the encrypted text to the FileLogger
        for storage
        */
        logger.log(DataLine);
    }

    public String makeHTML(String DataLine) {
        /*
        Make it into an HTML document.
        */
        DataLine = "<HTML>" + "\n" +
                "<BODY>" + "\n" +
                "<b>" + DataLine + "</b>" + "\n" +
                "</BODY>" + "\n" +
                "</HTML>";
        return DataLine;
    }
}
