package n2exercici1.Addresses;

import java.util.List;

public abstract class Address {
    protected String street;
    protected String num;
    protected String floor;


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }
    public abstract void settingAddress(String street, String number, String floor);
}
