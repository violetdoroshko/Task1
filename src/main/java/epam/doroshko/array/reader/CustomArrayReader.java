package epam.doroshko.array.reader;

import epam.doroshko.array.exception.CustomArrayException;
import epam.doroshko.array.validator.CustomArrayValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CustomArrayReader {
  private static final Logger logger = LogManager.getLogger();

  public String readFromFile(String path) throws CustomArrayException, FileNotFoundException {
    var reader = new FileReader(path);
    var scan = new Scanner(reader);
    CustomArrayValidator validator = new CustomArrayValidator();
    while (scan.hasNextLine()) {
      var string = scan.nextLine();
      if (validator.isValidate(string)) {
        scan.close();
        return string;
      }
    }
    scan.close();
    logger.log(Level.ERROR, "There is no correct line in the file!");
    throw new CustomArrayException("There is no correct line in the file!");
  }
}