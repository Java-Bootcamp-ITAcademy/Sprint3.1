package n2exercici1.Utils;
import n2exercici1.AbstractFact.AbstractFactory;
import n2exercici1.AbstractFact.FactoryCreator;
import n2exercici1.Addresses.Address;
import n2exercici1.Addresses.CatalanAddress;
import n2exercici1.Addresses.GermanAddress;
import n2exercici1.Addresses.UKAddress;
import n2exercici1.PhoneNumbers.CatalanPhoneNumber;
import n2exercici1.PhoneNumbers.GermanPhoneNumber;
import n2exercici1.PhoneNumbers.PhoneNumber;
import n2exercici1.PhoneNumbers.UKPhoneNumber;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static n2exercici1.Utils.Menu.ADDRESS;
import static n2exercici1.Utils.Menu.PHONENUMBER;
import static n2exercici1.Factories.AddressFactory.CATALONIA;
import static n2exercici1.Factories.AddressFactory.GERMANY;
import static n2exercici1.Factories.AddressFactory.UK;


public class AbstractFactoryTest {
    private static AbstractFactory abstractFactoryAddress= FactoryCreator.getFactory(ADDRESS);
    private static AbstractFactory abstractFactoryPhoneNumber=FactoryCreator.getFactory(PHONENUMBER);
    private static Address addressCatalonia = abstractFactoryAddress.getAddress(CATALONIA);
    private static Address addressGermany = abstractFactoryAddress.getAddress(GERMANY);
    private static Address addressUK = abstractFactoryAddress.getAddress(UK);
    private static PhoneNumber catalanPhoneNumber = abstractFactoryPhoneNumber.getPhoneNumber(CATALONIA);
    private static PhoneNumber germanPhoneNumber = abstractFactoryPhoneNumber.getPhoneNumber(GERMANY);
    private static PhoneNumber ukPhoneNumber = abstractFactoryPhoneNumber.getPhoneNumber(UK);

    /* Testing whether factories instantiate proper instances */
    @Test
    void isCatalanAddress() {
        assertTrue(addressCatalonia instanceof CatalanAddress);
    }
    @Test
    void isGermanAddress() {
        assertTrue(addressGermany instanceof GermanAddress);
    }
    @Test
    void isUKAddress() {
        assertTrue(addressUK instanceof UKAddress);
    }
    @Test
    void isCatalanPhoneNumber() {
        assertTrue(catalanPhoneNumber instanceof CatalanPhoneNumber);
    }
    void isGermanPhoneNumber() {
        assertTrue(germanPhoneNumber instanceof GermanPhoneNumber);
    }
    @Test
    void isUKPhoneNumber() {
        assertTrue(ukPhoneNumber instanceof UKPhoneNumber);
    }
}
