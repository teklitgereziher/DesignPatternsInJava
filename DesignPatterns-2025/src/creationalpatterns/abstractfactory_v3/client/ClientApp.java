package creationalpatterns.abstractfactory_v3.client;

import creationalpatterns.abstractfactory_v3.factory.CustomerFactory;
import creationalpatterns.abstractfactory_v3.util.CustomerUtil;

public class ClientApp {
    public static void main(String[] args) {
        CustomerFactory factory = CustomerUtil.getCustomerFactory("local");

        var account = factory.getAccount();
        var address = factory.getAddress();
        var credit = factory.getCreditCard();

        System.out.println(account.getFirstName());
        System.out.println(account.getLastName());
        System.out.println(account.isValid());
        System.out.println(account.save());

        System.out.println(address.getAddress());
        System.out.println(address.getState());
        System.out.println(address.isValid());
        System.out.println(address.save());

        System.out.println(credit.getCardNumber());
        System.out.println(credit.getCardType());
        System.out.println(credit.getCardExpDate());
        System.out.println(credit.isValid());
        System.out.println(credit.save());
    }
}
