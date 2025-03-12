package creationalpatterns.abstractfactory_p2.buttons;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created Windows Button.");
    }
}
