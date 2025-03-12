package creationalpatterns.abstractfactory_p2.buttons;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOS Button.");
    }
}
