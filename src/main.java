

import java.io.*;

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

        Input input = new Input();

        String directory = "contacts";
        String filename = "contacts.txt";
        Path dataDirectory = Paths.get(directory, filename);
        Path path = Paths.get("contacts", "contacts.txt");

        //Path Files.write(Path filepath, List<String> lines[, StandardOpenOption option])
        List<String> contacts = Arrays.asList("Contact1");
        Files.write(Paths.get("contacts", "contacts.txt"), contacts);
    }

}