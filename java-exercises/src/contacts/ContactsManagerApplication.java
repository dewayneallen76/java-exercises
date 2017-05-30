package contacts;

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

}
