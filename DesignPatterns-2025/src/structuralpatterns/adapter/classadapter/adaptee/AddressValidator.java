package structuralpatterns.adapter.classadapter.adaptee;

public interface AddressValidator {
    boolean isValidAddress(String inp_address, String inp_zip, String inp_state);
}
