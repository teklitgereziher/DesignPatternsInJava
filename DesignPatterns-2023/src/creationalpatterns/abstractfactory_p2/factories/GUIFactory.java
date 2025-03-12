package creationalpatterns.abstractfactory_p2.factories;

import creationalpatterns.abstractfactory_p2.buttons.Button;
import creationalpatterns.abstractfactory_p2.checkboxes.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
