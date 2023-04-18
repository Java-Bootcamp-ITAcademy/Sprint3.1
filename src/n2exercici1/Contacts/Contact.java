package n2exercici1.Contacts;

import n2exercici1.Addresses.Address;
import n2exercici1.PhoneNumbers.PhoneNumber;


import java.util.ArrayList;
import java.util.List;

public class Contact {
    private Address address;
    private PhoneNumber phoneNumber;
    private static List<Contact> contactList;

    static {
        contactList=new ArrayList<>();
    }

    {
        contactList.add(this); // Adding contact to list once is instantiated through instance initializing block
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
        return "Address: "+this.address.getStreet()+" "+this.address.getNum()+" "+this.address.getFloor()+" | Phone number: "+this.phoneNumber.getPhoneNumber();
    }
}
