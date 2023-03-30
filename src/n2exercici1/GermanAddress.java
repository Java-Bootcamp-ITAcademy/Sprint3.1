package n2exercici1;

public class GermanAddress extends Address {
    public void settingAddress(String street, String number, String floor) {
        this.street = street+" Strasse";
        this.num = "num "+number;
        this.floor = floor+" Stock";
    }
}
