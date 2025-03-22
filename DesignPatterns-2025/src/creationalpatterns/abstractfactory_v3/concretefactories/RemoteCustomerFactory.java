package creationalpatterns.abstractfactory_v3.concretefactories;

import creationalpatterns.abstractfactory_v3.abstractproducts.Account;
import creationalpatterns.abstractfactory_v3.abstractproducts.Address;
import creationalpatterns.abstractfactory_v3.abstractproducts.CreditCard;
import creationalpatterns.abstractfactory_v3.concreteproducts.RemoteAccount;
import creationalpatterns.abstractfactory_v3.concreteproducts.RemoteAddress;
import creationalpatterns.abstractfactory_v3.concreteproducts.RemoteCreditCard;
import creationalpatterns.abstractfactory_v3.factory.CustomerFactory;

/**
 * This is a concrete factory that specifies its products by overriding each factory method of the abstract factory.
 */
public class RemoteCustomerFactory implements CustomerFactory {
    @Override
    public Address getAddress() {
        return new RemoteAddress();
    }

    @Override
    public Account getAccount() {
        return new RemoteAccount();
    }

    @Override
    public CreditCard getCreditCard() {
        return new RemoteCreditCard();
    }
}
