package creationalpatterns.abstractfactory_p2.factories;

import creationalpatterns.abstractfactory_p2.buttons.Button;
import creationalpatterns.abstractfactory_p2.buttons.MacOSButton;
import creationalpatterns.abstractfactory_p2.checkboxes.CheckBox;
import creationalpatterns.abstractfactory_p2.checkboxes.MacOSCheckBox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
