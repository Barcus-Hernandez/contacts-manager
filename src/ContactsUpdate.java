import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactsUpdate {

    public void readFile (Path pathToFile) throws IOException {

    }

    public static List<Contacts> contactsList = new ArrayList<>();
    public static void menu (Path path) {

        System.out.println("1. View contacts.");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Search a contact by name.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit.");
        System.out.println("Enter an option (1, 2, 3, 4 or 5):");
        Input input = new Input();
        int in = input.getInt(1, 5);
        switch (in) {
            case 1:
                //View Contacts List
                viewContacts(path);
                break;
            case 2:
                System.out.println("Enter Name:");

                addContact(path);
                break;
            case 3:
                searchContact(path);
                break;
            case 4:
                deleteContact(path);
                break;
            case 5:
                System.out.println("Bye Bye!");
              System.exit(5);
            }

        }





    public static void viewContacts(){
        System.out.println("Your selection was '1' : View Contacts");
//        contacts.readFile(co)


    }

    public static void addContact(){

    }

    public static void searchContact(){

    }

    public static void deleteContact(){

    }

    public static void exitProgram(){

    }


    public static void main(String[] args) {

        Contacts contactInfo = new Contacts("Rose", "Barcus", "2105555555");
        System.out.println(contactInfo);

    }


}
