

import java.io.*;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.io.IOException;
import java.util.List;
import static java.nio.file.Files.*;


public class main {

    public static void main(String[] args) throws IOException{

//        Input input = new Input();
//
//        do {
//
//            System.out.println("1. View Contacts. \n" +
//                    "2. Add a new contact. \n" +
//                    "3. Search a contact by name." +
//                    "4. Delete and existing contact \n" +
//                    "5. Exit \n");
//
//            int selections = input.getInt("Enter an option (1, 2, 3, 4 or 5):");
//
//            switch(selections) {
//                case 1:
//                    viewContacts();
//                    break;
//                case 2:
//                    addContact();
//                    break;
//                case 3:
//                    searchContact();
//                    break;
//                case 4:
//                    deleteContact();
//                    break;
//                case 5:
//                    break;
//            }
//
//        }while (input.yesNo("Would you like to continue? "));

        String directory = "contacts";
        String filename = "contacts.txt";

        FileHandler contactsFile = new FileHandler(directory, filename);
        contactsFile.createFile();

        //Path Files.write(Path filepath, List<String> lines[, StandardOpenOption option])
        List<String> contacts = Arrays.asList("Jane Doe, 090909090");
        Files.write(Paths.get("contacts", "contacts.txt"), contacts);




    }

    private String viewContacts(){
    return "";
    }

    private String addContact(){
     return "";
    }

    private String searchContact(){
    return "";
    }

    private String deleteContact(){
    return "";
    }

}

/*
1. View contacts.
        2. Add a new contact.
        3. Search a contact by name.
        4. Delete an existing contact.
        5. Exit.
        Enter an option (1, 2, 3, 4 or 5):*/
