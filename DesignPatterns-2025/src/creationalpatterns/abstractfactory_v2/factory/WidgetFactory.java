package creationalpatterns.abstractfactory_v2.factory;

import creationalpatterns.abstractfactory_v2.abstractproducts.Button;
import creationalpatterns.abstractfactory_v2.abstractproducts.Checkbox;
import creationalpatterns.abstractfactory_v2.abstractproducts.ScrollBar;

public interface WidgetFactory {
    ScrollBar createScrollBar();

    Button createButton();

    Checkbox createCheckbox();
}
