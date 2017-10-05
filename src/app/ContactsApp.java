package app;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.io.IOException;
import java.util.List;
import util.Input;
import util.FileHandler;


public class ContactsApp {


    public static void main(String[] args) throws IOException{

        Input input = new Input();
        FileHandler fileHandler = new FileHandler("util","FileHandler.java");

        Contact contact = new Contact();

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
                    appendContact(fileHandler);
                    break;
                case 3:
                    searchContact(fileHandler);
                    break;
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
            Path contactPath = Paths.get("contacts", "contacts.txt");
            Contact contact = new Contact();
            System.out.println(fileHandler.readFile(contactPath));
            //for (String contact: fileHandler.readFile(contactPath)) {
               // String[] parts = contact.split(" ");
                //System.out.println("Name: " + parts[0] + " Phone number: " + parts[1]);
               // System.out.println(fileHandler.readFile(contactPath));
            //}
        }



        public static void appendContact (FileHandler fileHandler) throws IOException {
            Input input = new Input();
            Contact contact = new Contact();
            Path contactPath = Paths.get("contacts", "contacts.txt");
            /*String newContact = input.getString("Enter a new contact");*/
            List<Contact> contactList = new ArrayList<>();

            Files.write(contactPath, contactList, StandardOpenOption.APPEND);

            System.out.println(contactList);
    }


        public static void searchContact(FileHandler fileHandler) {
            Input input = new Input();
            Path contactPath = Paths.get("contacts", "contacts.txt");
            String searchedName = input.getString("Enter a name to search");
            List<String> contactList = Arrays.asList();

            if (contactList.contains(searchedName)){
                System.out.println(searchedName);
            }


        }
        /*
        public deleteContact() {

        }*/
}

