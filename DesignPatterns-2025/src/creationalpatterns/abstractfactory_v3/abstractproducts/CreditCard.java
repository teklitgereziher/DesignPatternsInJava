package creationalpatterns.abstractfactory_v3.abstractproducts;

public interface CreditCard {
    String isValid();

    String save();

    String getCardType();

    String getCardNumber();

    String getCardExpDate();
}
