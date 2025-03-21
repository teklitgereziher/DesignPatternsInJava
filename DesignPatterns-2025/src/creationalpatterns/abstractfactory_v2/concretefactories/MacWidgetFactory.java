package creationalpatterns.abstractfactory_v2.concretefactories;

import creationalpatterns.abstractfactory_v2.abstractproducts.Button;
import creationalpatterns.abstractfactory_v2.abstractproducts.Checkbox;
import creationalpatterns.abstractfactory_v2.abstractproducts.ScrollBar;
import creationalpatterns.abstractfactory_v2.concreteproducts.MacButton;
import creationalpatterns.abstractfactory_v2.concreteproducts.MacCheckbox;
import creationalpatterns.abstractfactory_v2.concreteproducts.MacScrollBar;
import creationalpatterns.abstractfactory_v2.factory.WidgetFactory;

public class MacWidgetFactory implements WidgetFactory {
    @Override
    public ScrollBar createScrollBar() {
        return new MacScrollBar();
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
