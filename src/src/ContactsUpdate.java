//package src;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactsUpdate {
    public static List<Contacts> contactsList = new ArrayList<>();

    public static int menu () {
        System.out.println("1. View contacts.");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Search a contact by name.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit.");
        System.out.println("Enter an option (1, 2, 3, 4 or 5):");

        Scanner userInput = new Scanner(System.in);
        int userChoice = userInput.nextInt();
        return userChoice;
    }




}
