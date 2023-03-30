package n2exercici1.Factories;

import n2exercici1.AbstractFact.AbstractFactory;
import n2exercici1.Addresses.Address;
import n2exercici1.Addresses.CatalanAddress;
import n2exercici1.Addresses.GermanAddress;
import n2exercici1.Addresses.UKAddress;

public class AddressFactory implements AbstractFactory {
    public static final String CATALONIA="Catalonia";
    public static final String GERMANY="Germany";
    public static final String UK="UK";
    public Address getAddress(String country) {
        Address address=new CatalanAddress();
        if(country.equals(CATALONIA)) {
            address = new CatalanAddress();
        }
        else if(country.equals(GERMANY)) {
            address = new GermanAddress();
        }
        else if(country.equals(UK)) {
            address = new UKAddress();
        }
        return address;
    }
}
