package creationalpatterns.abstractfactory_v3.concreteproducts;

import creationalpatterns.abstractfactory_v3.abstractproducts.CreditCard;

import java.time.LocalDate;

public class LocalCreditCard implements CreditCard {
    @Override
    public String isValid() {
        return "valid card";
    }

    @Override
    public String save() {
        return "saved cared";
    }

    @Override
    public String getCardType() {
        return "credit";
    }

    @Override
    public String getCardNumber() {
        return "123456";
    }

    @Override
    public String getCardExpDate() {
        return LocalDate.now().toString();
    }
}
