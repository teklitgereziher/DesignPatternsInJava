package creationalpatterns.abstractfactory_v3.concreteproducts;

import creationalpatterns.abstractfactory_v3.abstractproducts.Address;

public class RemoteAddress implements Address {
    @Override
    public boolean isValid() {
        return false;
    }

    @Override
    public boolean save() {
        return false;
    }

    @Override
    public String getAddress() {
        return "Remote address";
    }

    @Override
    public String getState() {
        return "Remote address state";
    }
}
