package creationalpatterns.abstractfactory_v2.concreteproducts;

import creationalpatterns.abstractfactory_v2.abstractproducts.Button;

public class WindowsButton extends Button {
    @Override
    public void paint() {
        System.out.println("Windows Button created.");
    }
}
