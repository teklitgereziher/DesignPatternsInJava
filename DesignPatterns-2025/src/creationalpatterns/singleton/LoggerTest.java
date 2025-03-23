package creationalpatterns.singleton;

public class LoggerTest {
    public static void main(String[] args) {
        FileLogger logger = FileLogger.getInstance();
        logger.log("A message to log from Singleton.");
    }
}
