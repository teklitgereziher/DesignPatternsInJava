package creationalpatterns.abstractfactory_v2.concretefactories;

import creationalpatterns.abstractfactory_v2.abstractproducts.Button;
import creationalpatterns.abstractfactory_v2.abstractproducts.Checkbox;
import creationalpatterns.abstractfactory_v2.abstractproducts.ScrollBar;
import creationalpatterns.abstractfactory_v2.concreteproducts.UbuntuButton;
import creationalpatterns.abstractfactory_v2.concreteproducts.UbuntuCheckbox;
import creationalpatterns.abstractfactory_v2.concreteproducts.UbuntuScrollBar;
import creationalpatterns.abstractfactory_v2.factory.WidgetFactory;

public class UbuntuWidgetFactory implements WidgetFactory {
    @Override
    public ScrollBar createScrollBar() {
        return new UbuntuScrollBar();
    }

    @Override
    public Button createButton() {
        return new UbuntuButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new UbuntuCheckbox();
    }
}
