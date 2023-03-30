package n2exercici1;


import java.util.Scanner;

public class Menu {
    private static Scanner sc;
    protected static final String ADDRESS="Address";
    protected static final String PHONENUMBER="PhoneNumber";


    static {
        sc=new Scanner(System.in);
    }
    public static void menu() {
        boolean keepExecution=true;
        String option="";
        while(keepExecution) {
            System.out.println("Choose an option: ");
            System.out.println("1: Add contact");
            System.out.println("2: Show contacts list");
            System.out.println("3: Delete contact from the list");
            System.out.println("0: Terminate program");
            option=sc.nextLine();
            switch (option) {
                case "1": {
                    insertContact();
                    break;
                }
                case "2": {
                    listContacts();
                    break;
                }
                case "3": {
                    deleteContact();
                    break;
                }
                case "0": {
                    sc.close();
                    keepExecution=false;
                }
            }
        }
    }
    public static void insertContact() {
        System.out.println("Introduce Country");
        String country=sc.nextLine();
        System.out.println("Introduce Street");
        String street=sc.nextLine();
        System.out.println("Introduce Number");
        String number=sc.nextLine();
        System.out.println("Introduce floor");
        String floor=sc.nextLine();
        System.out.println("Introduce Phone number");
        String phone=sc.nextLine();
        /* Generating address factory */
        AbstractFactory abstractFactory = FactoryCreator.getFactory(ADDRESS);
        /* Now we create a given country address */
        Address address = abstractFactory.getAddress(country);
        /* Setting address */
        address.settingAddress(street,number,floor);
        /* Generating phone number factory */
        abstractFactory = FactoryCreator.getFactory(PHONENUMBER);
        /* Now we create a given country phone number */
        PhoneNumber phoneNumber = abstractFactory.getPhoneNumber(country);
        /* Setting phone number */
        phoneNumber.settingPhoneNumber(phone);
        /* Creating new contact */
        Contact contact = new Contact(address, phoneNumber);
    }
    public static void listContacts() {
        int i=1;
        for(Contact contact:Contact.getContactList()) {
            System.out.println(i+": "+contact);
            i++;
        }
    }
    public static void deleteContact() {
        int positionToDelete;
        System.out.println("Which contact do you want to delete?");
        listContacts();
        positionToDelete = Integer.parseInt(sc.nextLine());
        Contact.getContactList().remove(positionToDelete - 1);
    }
}
