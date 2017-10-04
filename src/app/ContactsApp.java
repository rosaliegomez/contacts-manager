package app;

import com.sun.tools.doclets.internal.toolkit.util.DocFinder;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.IOException;
import java.util.List;
import util.Input;
import util.FileHandler;


public class ContactsApp {

    public static void main(String[] args) throws IOException{

        Input input = new Input();
        FileHandler fileHandler = new FileHandler("util","FileHandler.java");

        List<String> contactsList = Arrays.asList("Jane Doe, 090909090");
        Files.write(Paths.get("contacts", "contacts.txt"), contactsList);


        //Path contactPath = Paths.get("contacts","contacts.txt");





        do {

            System.out.println("1. View Contacts. \n" +
                    "2. Add a new contact. \n" +
                    "3. Search a contact by name." +
                    "4. Delete and existing contact \n" +
                    "5. Exit \n");

            int selections = input.getInt("Enter an option (1, 2, 3, 4 or 5):");




            switch(selections) {
                case 1:
                    System.out.println(fileHandler.viewContacts());
                    break;
                case 2:

                    break;
//                case 3:
//                    searchContact();
//                    break;
//                case 4:
//                    deleteContact();
//                    break;
//                case 5:
//                    break;
//                    default:
            }

        }while (input.yesNo("Would you like to continue? "));

        String directory = "contacts";
        String filename = "contacts.txt";

        FileHandler contactsFile = new FileHandler(directory, filename);
        contactsFile.createFile();






    }



}

/*
1. View contacts.
        2. Add a new contact.
        3. Search a contact by name.
        4. Delete an existing contact.
        5. Exit.
        Enter an option (1, 2, 3, 4 or 5):*/
