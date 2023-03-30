package n2exercici1;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private Address address;
    private PhoneNumber phoneNumber;
    private static List<Contact> contactList=new ArrayList<>();

    {
        contactList.add(this);
    }

    public Contact(Address address, PhoneNumber phoneNumber) {
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public static List<Contact> getContactList() {
        return contactList;
    }

    @Override
    public String toString() {
        return "Address: "+this.address.street+" "+this.address.num+" "+this.address.floor+" | Phone number: "+this.phoneNumber.phoneNumber;
    }
}
