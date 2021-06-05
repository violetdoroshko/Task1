package epam.doroshko.array.reader.impl;

import epam.doroshko.array.exception.CustomArrayException;
import epam.doroshko.array.reader.CustomArrayReader;
import epam.doroshko.array.validator.CustomArrayValidator;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayReaderImpl implements CustomArrayReader {
  private static final Logger logger = LogManager.getLogger("CustomArrayReader");

  @Override
  public String readCustomArrayFromFile(String path) throws CustomArrayException {

    String resultString = null;

    try {
      var bufferedReader = new BufferedReader(new FileReader(path));
      var string = bufferedReader.readLine();


      while (string != null) {
        if (CustomArrayValidator.validateInteger(string)) {
          resultString = string;
          break;
        }
        string = bufferedReader.readLine();
      }
      bufferedReader.close();

    } catch (FileNotFoundException e) {
      logger.log(Level.ERROR, "File can't be found");
      throw new CustomArrayException("File can't be found");
    } catch (IOException exception) {
      logger.log(Level.ERROR, "File can't be open");
      throw new CustomArrayException("File can't be open");
    }
    return resultString;
  }
}