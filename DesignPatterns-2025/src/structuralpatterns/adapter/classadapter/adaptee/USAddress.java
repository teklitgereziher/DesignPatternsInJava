package structuralpatterns.adapter.classadapter.adaptee;

public class USAddress implements AddressValidator {
    public boolean isValidAddress(String inp_address,
                                  String inp_zip, String inp_state) {
        if (inp_address.trim().length() < 10)
            return false;
        if (inp_zip.trim().length() < 5)
            return false;
        if (inp_zip.trim().length() > 10)
            return false;
        return inp_state.trim().length() == 2;
    }
}//end of class