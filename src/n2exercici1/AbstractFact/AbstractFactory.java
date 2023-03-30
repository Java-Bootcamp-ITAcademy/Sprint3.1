package n2exercici1.AbstractFact;

import n2exercici1.Addresses.Address;
import n2exercici1.PhoneNumbers.PhoneNumber;

public interface AbstractFactory {
    default Address getAddress(String address) {
        return null;
    }
    default PhoneNumber getPhoneNumber(String phoneNumber) {
        return null;
    }
}

