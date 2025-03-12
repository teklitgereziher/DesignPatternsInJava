package creationalpatterns.abstractfactory_p2.checkboxes;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("You have created Windows Checkbox.");
    }
}
