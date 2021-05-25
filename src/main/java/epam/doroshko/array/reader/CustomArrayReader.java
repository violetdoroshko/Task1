package epam.doroshko.array.reader;

import epam.doroshko.array.exception.CustomArrayException;
import epam.doroshko.array.validator.CustomArrayValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CustomArrayReader {
  private static final Logger logger = LogManager.getLogger();

  public String readCustomArrayFromFile(String path) throws CustomArrayException, IOException {

    try (var bufferedReader = new BufferedReader(new FileReader(path))) {
      CustomArrayValidator validator = new CustomArrayValidator();
      var string = bufferedReader.readLine();

      while (string != null) {
        if (validator.isValidate(string)) {
          return string;
        }
        string = bufferedReader.readLine();
      }
      logger.log(Level.ERROR, "File is incorrect");
      throw new CustomArrayException("File is incorrect");
    }
  }
}