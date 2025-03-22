package creationalpatterns.abstractfactory_v3.util;

import creationalpatterns.abstractfactory_v3.concretefactories.LocalCustomerFactory;
import creationalpatterns.abstractfactory_v3.concretefactories.RemoteCustomerFactory;
import creationalpatterns.abstractfactory_v3.factory.CustomerFactory;

/**
 * Application mode: local or remote
 */
public class CustomerUtil {
    public static CustomerFactory getCustomerFactory(String mode) {
        CustomerFactory factory;
        if (mode.equals("remote")) {
            factory = new RemoteCustomerFactory();
        } else {
            factory = new LocalCustomerFactory();
        }

        return factory;
    }
}
