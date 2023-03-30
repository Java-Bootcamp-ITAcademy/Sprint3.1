package n2exercici1.Factories;

import n2exercici1.AbstractFact.AbstractFactory;
import n2exercici1.PhoneNumbers.CatalanPhoneNumber;
import n2exercici1.PhoneNumbers.GermanPhoneNumber;
import n2exercici1.PhoneNumbers.PhoneNumber;
import n2exercici1.PhoneNumbers.UKPhoneNumber;

public class PhoneNumberFactory implements AbstractFactory {
    public static final String CATALONIA="Catalonia";
    public static final String GERMANY="Germany";
    public static final String UK="UK";
    @Override
    public PhoneNumber getPhoneNumber(String country) {
        PhoneNumber phoneNumber=null;
        if(country.equals(CATALONIA)) {
            phoneNumber = new CatalanPhoneNumber();
        }
        else if(country.equals(GERMANY)) {
            phoneNumber = new GermanPhoneNumber();
        }
        else if(country.equals(UK)) {
            phoneNumber = new UKPhoneNumber();
        }
        return phoneNumber;
    }
}
