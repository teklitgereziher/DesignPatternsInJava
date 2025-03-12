package creationalpatterns.abstractfactory_p2.factories;

import creationalpatterns.abstractfactory_p2.buttons.Button;
import creationalpatterns.abstractfactory_p2.buttons.WindowsButton;
import creationalpatterns.abstractfactory_p2.checkboxes.CheckBox;
import creationalpatterns.abstractfactory_p2.checkboxes.WindowsCheckBox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
