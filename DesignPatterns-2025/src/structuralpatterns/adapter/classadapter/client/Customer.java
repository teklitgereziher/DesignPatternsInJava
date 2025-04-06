package structuralpatterns.adapter.classadapter.client;

import structuralpatterns.adapter.classadapter.adaptee.AddressValidator;
import structuralpatterns.adapter.classadapter.adaptee.USAddress;
import structuralpatterns.adapter.classadapter.adapter.CAAddressAdapter;

public class Customer {
    public static final String US = "US";
    public static final String CANADA = "Canada";
    private String address;
    private String name;
    private String zip, state, type;

    public Customer(String inp_name, String inp_address,
                    String inp_zip, String inp_state,
                    String inp_type) {
        name = inp_name;
        address = inp_address;
        zip = inp_zip;
        state = inp_state;
        type = inp_type;
    }

    public boolean isValidAddress() {
        //get an appropriate address validator
        AddressValidator validator = getValidator(type);
        //Polymorphic call to validate the address
        return validator.isValidAddress(address, zip, state);
    }

    private AddressValidator getValidator(String custType) {
        AddressValidator validator = null;
        if (custType.equals(Customer.US)) {
            validator = new USAddress();
        }
        if (custType.equals(Customer.CANADA)) {
            validator = new CAAddressAdapter();
        }
        return validator;
    }
}
