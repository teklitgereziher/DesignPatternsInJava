package creationalpatterns.abstractfactory_v2.concreteproducts;

import creationalpatterns.abstractfactory_v2.abstractproducts.ScrollBar;

public class UbuntuScrollBar extends ScrollBar {
    @Override
    public void paint() {
        System.out.println("Ubuntu Scroll Bar created.");
    }
}
