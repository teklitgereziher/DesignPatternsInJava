package creationalpatterns.abstractfactory_v3.abstractproducts;

public interface Account {
    boolean isValid();

    boolean save();

    String getFirstName();

    String getLastName();
}
