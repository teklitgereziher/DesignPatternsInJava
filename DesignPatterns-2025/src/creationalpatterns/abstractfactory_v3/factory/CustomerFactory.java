package creationalpatterns.abstractfactory_v3.factory;

import creationalpatterns.abstractfactory_v3.abstractproducts.Account;
import creationalpatterns.abstractfactory_v3.abstractproducts.Address;
import creationalpatterns.abstractfactory_v3.abstractproducts.CreditCard;

/**
 * Declares the methods to create instances of local or remote family
 * This is the abstract factory
 */
public interface CustomerFactory {
    Address getAddress();

    Account getAccount();

    CreditCard getCreditCard();
}
