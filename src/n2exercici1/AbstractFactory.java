package n2exercici1;

public interface AbstractFactory {
    default Address getAddress(String address) {
        return null;
    }
    default PhoneNumber getPhoneNumber(String phoneNumber) {
        return null;
    }
}

