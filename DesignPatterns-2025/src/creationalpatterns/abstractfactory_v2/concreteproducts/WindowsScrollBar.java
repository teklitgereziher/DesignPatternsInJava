package creationalpatterns.abstractfactory_v2.concreteproducts;

import creationalpatterns.abstractfactory_v2.abstractproducts.ScrollBar;

public class WindowsScrollBar extends ScrollBar {
    @Override
    public void paint() {
        System.out.println("Windows Scroll Bar created.");
    }
}
