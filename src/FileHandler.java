import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHandler {
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
  public boolean writeToFile(){
    return false;
  }
  public boolean readFromFile(){
    return false;
  }

}
