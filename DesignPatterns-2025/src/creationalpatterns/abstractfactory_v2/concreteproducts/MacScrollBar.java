package creationalpatterns.abstractfactory_v2.concreteproducts;

import creationalpatterns.abstractfactory_v2.abstractproducts.ScrollBar;

public class MacScrollBar extends ScrollBar {
    @Override
    public void paint() {
        System.out.println("macOS Scroll Bar created.");
    }
}
