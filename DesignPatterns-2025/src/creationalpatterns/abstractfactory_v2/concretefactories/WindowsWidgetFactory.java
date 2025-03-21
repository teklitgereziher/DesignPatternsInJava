package creationalpatterns.abstractfactory_v2.concretefactories;

import creationalpatterns.abstractfactory_v2.abstractproducts.Button;
import creationalpatterns.abstractfactory_v2.abstractproducts.Checkbox;
import creationalpatterns.abstractfactory_v2.abstractproducts.ScrollBar;
import creationalpatterns.abstractfactory_v2.concreteproducts.WindowsButton;
import creationalpatterns.abstractfactory_v2.concreteproducts.WindowsCheckbox;
import creationalpatterns.abstractfactory_v2.concreteproducts.WindowsScrollBar;
import creationalpatterns.abstractfactory_v2.factory.WidgetFactory;

public class WindowsWidgetFactory implements WidgetFactory {
    @Override
    public ScrollBar createScrollBar() {
        return new WindowsScrollBar();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
