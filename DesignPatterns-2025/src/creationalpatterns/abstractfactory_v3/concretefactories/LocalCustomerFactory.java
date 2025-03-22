package creationalpatterns.abstractfactory_v3.concretefactories;

import creationalpatterns.abstractfactory_v3.abstractproducts.Account;
import creationalpatterns.abstractfactory_v3.abstractproducts.Address;
import creationalpatterns.abstractfactory_v3.abstractproducts.CreditCard;
import creationalpatterns.abstractfactory_v3.concreteproducts.LocalAccount;
import creationalpatterns.abstractfactory_v3.concreteproducts.LocalAddress;
import creationalpatterns.abstractfactory_v3.concreteproducts.LocalCreditCard;
import creationalpatterns.abstractfactory_v3.factory.CustomerFactory;

/**
 * This is a concrete factory that specifies its products by overriding each factory method of the abstract factory.
 */
public class LocalCustomerFactory implements CustomerFactory {
    @Override
    public Address getAddress() {
        return new LocalAddress();
    }

    @Override
    public Account getAccount() {
        return new LocalAccount();
    }

    @Override
    public CreditCard getCreditCard() {
        return new LocalCreditCard();
    }
}
