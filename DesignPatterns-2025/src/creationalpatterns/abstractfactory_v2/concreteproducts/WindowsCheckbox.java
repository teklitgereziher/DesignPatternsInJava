package creationalpatterns.abstractfactory_v2.concreteproducts;

import creationalpatterns.abstractfactory_v2.abstractproducts.Checkbox;

public class WindowsCheckbox extends Checkbox {
    @Override
    public void paint() {
        System.out.println("Windows Checkbox created.");
    }
}
