package creationalpatterns.abstractfactory_v2.concreteproducts;

import creationalpatterns.abstractfactory_v2.abstractproducts.Button;

public class UbuntuButton extends Button {
    @Override
    public void paint() {
        System.out.println("Ubuntu Button created.");
    }
}
