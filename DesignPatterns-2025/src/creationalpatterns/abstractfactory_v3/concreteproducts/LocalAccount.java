package creationalpatterns.abstractfactory_v3.concreteproducts;

import creationalpatterns.abstractfactory_v3.abstractproducts.Account;

public class LocalAccount implements Account {
    @Override
    public boolean isValid() {
        return false;
    }

    @Override
    public boolean save() {
        return false;
    }

    @Override
    public String getFirstName() {
        return "Local account first name";
    }

    @Override
    public String getLastName() {
        return "Local account last name";
    }
}
