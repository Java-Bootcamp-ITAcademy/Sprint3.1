package n2exercici1.AbstractFact;

import n2exercici1.Factories.AddressFactory;
import n2exercici1.Factories.PhoneNumberFactory;

public class FactoryCreator {
    public static AbstractFactory getFactory(String factory) {
        AbstractFactory abstractFactory=null;
        if(factory.equals("Address")) {
            abstractFactory = new AddressFactory();
        }
        else if(factory.equals("PhoneNumber")) {
            abstractFactory = new PhoneNumberFactory();
        }
        return abstractFactory;
    }
}
