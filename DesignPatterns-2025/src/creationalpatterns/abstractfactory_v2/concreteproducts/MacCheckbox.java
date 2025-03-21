package creationalpatterns.abstractfactory_v2.concreteproducts;

import creationalpatterns.abstractfactory_v2.abstractproducts.Checkbox;

public class MacCheckbox extends Checkbox {
    @Override
    public void paint() {
        System.out.println("macOS Checkbox created.");
    }
}
