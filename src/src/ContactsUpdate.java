//package src;


import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactsUpdate {

    public void readFile (Path pathToFile) throws IOException {

    }

    public static List<Contacts> contactsList = new ArrayList<>();



    public static int menu () {
        System.out.println("1. View contacts.");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Search a contact by name.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit.");
        System.out.println("Enter an option (1, 2, 3, 4 or 5):");


        // TODO: 6/10/21 Build methods so that they return user selection form the main menu 
        System.out.println(menu());
        switch (menu()){
            case 1:
                //View Contacts List
                viewContacts();
                break;
            case 2:
                addContact();
                break;
            case 3:
                searchContact();
                break;
            case 4:
                deleteContact();
                break;
            case 5:
                exitProgram();

        }

        Scanner userInput = new Scanner(System.in);
        int userChoice = userInput.nextInt();
        return userChoice;
    }

    public static void viewContacts(){
        System.out.println("Your selection was '1' : View Contacts");
        contacts.readFile(co)


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
