package creationalpatterns.abstractfactory_v3.abstractproducts;

public interface Address {
    boolean isValid();

    boolean save();

    String getAddress();

    String getState();
}
