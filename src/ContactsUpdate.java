
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ContactsUpdate {

    //display contact
    public void readAndOutput(Path pathToFile) {
        List<String> list = new ArrayList<>();
        try {
            list = Files.readAllLines(pathToFile);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println("Name\t | Number");
        System.out.println("-----------------------");
        for (String line : list) {
            System.out.println(line);
        }
    }

    //Adding contacts:

    public static void addContact(String name, String number, Path path) {
        try {
            Files.writeString(path, name + "\t" + number + "\n", StandardOpenOption.APPEND);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    //Search for existing contact

    public static void searchContact(String name, Path path) {
        List<String> list = new ArrayList<>();
        try {
            list = Files.readAllLines(path);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        Iterator<String> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            String contact = listIterator.next();
            if (contact.contains(name)) {
                System.out.println(contact);
            }
        }
    }

    //Delete method:

    public static void DELETE(String name, Path path) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        try {
            list = Files.readAllLines(path);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        Iterator<String> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            String contact = listIterator.next();
            if (contact.contains(name)) {
                System.out.printf("Are you sure you want to delete %s?\n", name);
                String verify = scanner.next();
                if (verify.equals("y") || verify.equals("yes")) {
                    listIterator.remove();
                } else {
                    break;
                }
            }
        }
        try {
            Files.write(path, list);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ContactsUpdate io = new ContactsUpdate();

        Path toOurData = Paths.get("src/contacts/contacts.txt");
     /*   try {
            if (Files.notExists(toOurData))
                Files.createDirectories(toOurData);
        } else{
            System.out.println("The" + toOurData + " directory already exists");
        }
    } catch (IOException ioe)

    {
        ioe.printStackTrace();
    }
*/
/*
        Path toOurData = Paths.get(String.valueOf(toOurData), "contacts.txt");*/
       /* try {
            if (Files.notExists(toOurData)) {
                Files.createFile(toOurData);
                Files.createFile(toOurData);
            }
            Files.createFile(toOurData);
        }catch(IOException ioe) {
            ioe.printStackTrace();
        }*/

                Scanner scanner = new Scanner(System.in);
                int userInput;

                do {
                    System.out.println("1. View contacts.");
                    System.out.println("2. Add a new contact.");
                    System.out.println("3. Search a contact by name.");
                    System.out.println("4. Delete an existing contact.");
                    System.out.println("5. Exit.");

                    do {
                        System.out.println("Enter an option (1, 2, 3, 4, 5):");
                        userInput = scanner.nextInt();
                    } while (userInput > 5 || userInput < 1);
                    scanner.nextLine();

                    switch (userInput) {
                        case 1:
                            io.readAndOutput(toOurData);
                            break;
                        case 2:
                            System.out.print("Please enter a name:");
                            String name = scanner.nextLine();
                            System.out.print("\nPlease enter number:");
                            String number = scanner.next();
                            Contacts contacts = new Contacts(name, number);
                            addContact(contacts.getName(), contacts.getPhoneNumber(), toOurData);
                            break;
                        case 3:
                            System.out.print("Please enter a name:");
                            String searchName = scanner.nextLine();
                            searchContact(searchName, toOurData);
                            break;
                        case 4:
                            System.out.println("Please enter a name");
                            String deleteName = scanner.nextLine();
                            DELETE(deleteName, toOurData);
                            io.readAndOutput(toOurData);
                            break;
                        case 5:
                            break;

                    }


                } while (userInput != 5);
            }

        }

   /* public void readFile (Path pathToFile) throws IOException {

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

        Contacts contactInfo = new Contacts("Rose Barcus", "2105555555");
        System.out.println(contactInfo);

    }

*/

