package util;

import app.ContactsApp;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.io.IOException;
import java.util.List;
import util.Input;
import util.FileHandler;


public class FileHandler {
  Path contactPath = Paths.get("contacts","contacts.txt");
  Input input = new Input();
  ContactsApp contactsApp = new ContactsApp();



  private String directory;
  private String filename;
  private Path filePath;



  public FileHandler(String directory, String filename) {
    this.directory = directory;
    this.filename = filename;
  }

  public boolean createFile(){
    Path dataDirectory = Paths.get(this.directory);
    this.filePath = Paths.get(this.directory, this.filename);

    try {
      if (Files.notExists(dataDirectory)) {
        Files.createDirectories(dataDirectory);
      }

      if (Files.notExists(this.filePath)) {
        Files.createFile(this.filePath);
      }
    }catch (IOException e){
      return false;
    }
    return true;
  }


  public List readFile () throws IOException {
    return Files.readAllLines(contactPath);


  }

  public List append (List contacts) throws IOException {
    Files.write(contactPath, contacts, StandardOpenOption.APPEND);
    return contacts;
  }



  }


