package creationalpatterns.abstractfactory_p2.checkboxes;

public class MacOSCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
