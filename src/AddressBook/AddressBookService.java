package AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookService {
	public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Contact> arrayOfContacts = new ArrayList<Contact>();
    public static void addContact()
    {

        System.out.println("Please enter your first name :");
        String first_name = sc.next();
        System.out.println("Please enter your last name :");
        String last_name = sc.next();
        sc.nextLine();
        System.out.println("Please enter your address :");
        String address = sc.nextLine();
        System.out.println("Please enter your city :");
        String city = sc.next();
        System.out.println("Please enter your state :");
        String state = sc.next();
        System.out.println("Please enter your zip code :");
        int zip = sc.nextInt();
        System.out.println("Please enter your phone number :");
        long phone = sc.nextLong();
        System.out.println("Please enter your email id :");
        String email_id = sc.next();
        Contact c = new Contact(first_name, last_name, address, city, state, zip, phone, email_id);
        arrayOfContacts.add(c);
    }
    public static void display()
    {
        for (Contact c:arrayOfContacts) {
            System.out.println(c);
        }
    }

    private static int edit(String editName)
    {


        for (Contact contact : arrayOfContacts) {
            if (editName.compareToIgnoreCase(contact.getFirstName()) == 0) {
                return arrayOfContacts.indexOf(contact);
            }
        }

        return -1;
    }
    public static void editContact()
    {
        System.out.println("Enter the name you want to edit.");
        String editName = sc.next();
        int ans = edit(editName);
        if(ans == -1)
        {
            System.out.println("Contact with name "+editName+" not found");
        }
        else {
            System.out.println("Found the contact\nPlease edit the details: ");
            addContact();
        }
    }

}


