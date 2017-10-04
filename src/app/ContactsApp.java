package app;

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

        do {

            System.out.println("1. View Contacts. \n" +
                    "2. Add a new contact. \n" +
                    "3. Search a contact by name." +
                    "4. Delete and existing contact \n" +
                    "5. Exit \n");

            int selections = input.getInt("Enter an option (1, 2, 3, 4 or 5):");

            switch(selections) {
                case 1:
                    viewContacts(fileHandler);
                    break;
                case 2:
                    fileHandler.append(fileHandler);
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



    }
        public static void viewContacts(FileHandler fileHandler) throws IOException {
            System.out.println(fileHandler.readFile());
        }

        public static void addContact(FileHandler fileHandler) {
        Input input = new Input();
            String newContact = input.getString("Enter a new contact");
            System.out.println(fileHandler.append(newContact));
        }
        /*
        public searchContact() {

        }
        public deleteContact() {

        }*/
}

