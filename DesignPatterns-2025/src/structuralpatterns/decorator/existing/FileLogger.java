package structuralpatterns.decorator.existing;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        FileWriter myWriter;
        try {
            myWriter = new FileWriter("./filename.txt", true);
            myWriter.write(message);
            myWriter.write("\n");
            myWriter.close();
            System.out.println("Logged to File.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
