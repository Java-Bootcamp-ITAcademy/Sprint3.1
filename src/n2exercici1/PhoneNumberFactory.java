package n2exercici1;

public class PhoneNumberFactory implements AbstractFactory{
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
