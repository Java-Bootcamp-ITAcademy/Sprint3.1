package n2exercici1;

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
