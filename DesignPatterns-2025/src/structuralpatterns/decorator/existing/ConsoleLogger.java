package structuralpatterns.decorator.existing;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println(message);
        System.out.println("Logged to Console");
    }
}
