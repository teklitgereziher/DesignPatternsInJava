package creationalpatterns.abstractfactory_v3.concreteproducts;

import creationalpatterns.abstractfactory_v3.abstractproducts.CreditCard;

import java.time.LocalDate;

public class RemoteCreditCard implements CreditCard {
    @Override
    public String isValid() {
        return "remote card valid";
    }

    @Override
    public String save() {
        return "remote card saved";
    }

    @Override
    public String getCardType() {
        return "remote card credit";
    }

    @Override
    public String getCardNumber() {
        return "remote 1234567";
    }

    @Override
    public String getCardExpDate() {
        return LocalDate.now().toString();
    }
}
