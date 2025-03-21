package creationalpatterns.abstractfactory_v2.client;

import creationalpatterns.abstractfactory_v2.concretefactories.MacWidgetFactory;
import creationalpatterns.abstractfactory_v2.concretefactories.UbuntuWidgetFactory;
import creationalpatterns.abstractfactory_v2.concretefactories.WindowsWidgetFactory;
import creationalpatterns.abstractfactory_v2.factory.WidgetFactory;

public class ClientApp {
    public static void main(String[] args) {
        String osName = getOperatingSystem();
        WidgetFactory factory;

        switch (osName) {
            case "Windows 11" -> factory = new WindowsWidgetFactory();
            case "Ubuntu" -> factory = new UbuntuWidgetFactory();
            default -> factory = new MacWidgetFactory();
        }

        var button = factory.createButton();
        var checkbox = factory.createCheckbox();
        var scrollBar = factory.createScrollBar();

        button.paint();
        checkbox.paint();
        scrollBar.paint();
    }

    public static String getOperatingSystem() {
        String os = System.getProperty("os.name");
        System.out.printf("You are using %s OS.\n", os);
        return os;
    }
}
