package app;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.io.IOException;
import java.util.List;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import util.Input;
import util.FileHandler;


public class ContactsApp {

    public static Input input = new Input();

    public static void main(String[] args) throws IOException, ConcurrentModificationException {

        FileHandler fileHandler = new FileHandler("contacts", "contacts.txt");

        do {

            System.out.println("1. View Contacts. \n" +
                    "2. Add a new contact. \n" +
                    "3. Search a contact by name. \n" +
                    "4. Delete and existing contact \n" +
                    "5. Exit \n");

            int selections = input.getInt("Enter an option (1, 2, 3, 4 or 5):");


            switch (selections) {
                case 1:
                    viewContacts(fileHandler);
                    break;
                case 2:
                    appendContact(fileHandler);
                    break;
                case 3:
                    searchContact(fileHandler);
                    break;
                case 4:
                    deleteContact(fileHandler);
                    break;
//                case 5:
//                    break;
//                    default:
            }

        } while (input.yesNo("Would you like to continue? "));
    }

    public static void viewContacts(FileHandler fileHandler) throws IOException {
        for (String contact : fileHandler.readFile()) {
//            String[] parts = contact.split(" ");

            System.out.println(contact);
        }
    }

    public static void appendContact(FileHandler fileHandler) throws IOException {
        String contactName = input.getString("Enter a contact name");
        String contactPhone = formatPhoneNumber(input.getPhoneNumber("Enter a phone #: "));

        List<String> contactList = new ArrayList<String>();
        contactList.add(contactName +  " | " + contactPhone);
//        for(String number: contactList){
//            String[] parts = number.split(" | ");
//            if(parts[3].) {
//                System.out.println("Add a valid number");
//            }
//
//        }

        fileHandler.writeToFile(contactList, true);

    }


    public static void searchContact(FileHandler fileHandler) throws IOException {
        String searchedName = input.getString("Enter a name to search");
        List<String> contactList = fileHandler.readFile();

        for (String contact : contactList) {
            if (contact.contains(searchedName)) {
                System.out.println(contact);
            }
        }
    }

    public static void deleteContact(FileHandler fileHandler) throws IOException, ConcurrentModificationException {

        String contactToBeDeleted = input.getString("Which name would you like to delete??");
        List<String> contactList = fileHandler.readFile();
        List<String> newList = new ArrayList<>();

        for (String contact : contactList) {
            if (contact.contains(contactToBeDeleted) &&
                    input.yesNo("Delete " + contact + " ? (y/n)")) {
                continue;
            }
            newList.add(contact);
        }

        //test
        fileHandler.writeToFile(newList, false);

    }
    public static String formatPhoneNumber(String phoneNumber){
        String areaCode = phoneNumber.substring(0,3);
        String whateverYouCallTheFirstThreeNumbersInAPhoneNumber = phoneNumber.substring(3,6);
        String lastFour = phoneNumber.substring(6,10);
        String formattedNumber = "(" + areaCode + ")" + whateverYouCallTheFirstThreeNumbersInAPhoneNumber + "-" + lastFour;
        return formattedNumber;
    }
}

