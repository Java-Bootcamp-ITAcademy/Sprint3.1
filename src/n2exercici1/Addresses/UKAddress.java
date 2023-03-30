package n2exercici1.Addresses;

import n2exercici1.Addresses.Address;

public class UKAddress extends Address {
    public void settingAddress(String street, String number, String floor) {
        this.street = street+" Street";
        this.num = number;
        this.floor = floor+" floor";
    }
}
