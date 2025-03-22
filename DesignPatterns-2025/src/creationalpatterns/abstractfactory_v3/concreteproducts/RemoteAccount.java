package creationalpatterns.abstractfactory_v3.concreteproducts;

import creationalpatterns.abstractfactory_v3.abstractproducts.Account;

public class RemoteAccount implements Account {
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
        return "Remote account first name";
    }

    @Override
    public String getLastName() {
        return "Remote account last name";
    }
}
