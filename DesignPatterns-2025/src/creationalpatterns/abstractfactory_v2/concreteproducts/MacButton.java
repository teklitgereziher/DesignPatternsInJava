package creationalpatterns.abstractfactory_v2.concreteproducts;

import creationalpatterns.abstractfactory_v2.abstractproducts.Button;

public class MacButton extends Button {
    @Override
    public void paint() {
        System.out.println("macOS Button Created.");
    }
}
