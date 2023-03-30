package n2exercici1;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static n2exercici1.Menu.ADDRESS;
import static n2exercici1.Menu.PHONENUMBER;
import static n2exercici1.AddressFactory.CATALONIA;
import static n2exercici1.AddressFactory.GERMANY;
import static n2exercici1.AddressFactory.UK;


public class AbstractFactoryTest {
    private static AbstractFactory abstractFactoryAddress=FactoryCreator.getFactory(ADDRESS);
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
