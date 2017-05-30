package contacts;

import java.io.IOException;

/**
 * Created by dewayneallen on 5/30/17.
 */
public class ContactsManagerApplication {
    private static Contacts contactsDao = new TextFileContacts();

    public static void showContacts() {
        System.out.println();
        System.out.println(" Name | Number ");
        for(Contact contact : contactsDao.findAll()) {
            System.out.printf(
                    "%s | %s\n",
                    contact.getName(),
                    contact.getNumber()
            );
        }
        System.out.println();
    }

    public static void addContact() {
        Contact newContact = new Contact(
                Input.getString("name: "),
                Input.getString("number: ")
        );

        try{
            contactsDao.add(newContact);
            System.out.println("Contact added!");
        } catch (IOException e) {
            System.out.println("Error adding new contact!");
            e.printStackTrace();
        }
    }

    public static void searchByName() {

    }

    public static void searchByNumber() {

    }

    public static void removeContact() {
        String name = Input.getString("Enter the name of the contact to remove: ");
        Contact toRemove = contactsDao.findByName(name);
        if(toRemove == null) {
            System.out.println("Sorry, no contact by that name was found.");
            return;
        }
        contactsDao.delete(toRemove);
        System.out.println("Contact removed!");
    }

    public
}
