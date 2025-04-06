package structuralpatterns.adapter.objectadapter.adapter;

import structuralpatterns.adapter.objectadapter.adaptee.AddressValidator;
import structuralpatterns.adapter.objectadapter.adaptee.CAAddress;

public class CAAddressAdapter implements AddressValidator {
    private CAAddress caAddress;

    public CAAddressAdapter(CAAddress address) {
        caAddress = address;
    }

    public boolean isValidAddress(String inp_address, String inp_zip, String inp_state) {
        return caAddress.isValidCanadianAddr(inp_address, inp_zip, inp_state);
    }
}
