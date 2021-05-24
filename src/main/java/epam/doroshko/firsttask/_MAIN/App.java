package epam.doroshko.firsttask._MAIN;

import epam.doroshko.firsttask.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
  private static final Logger logger = LogManager.getLogger();

  public static void main(String[] arg) {
    logger.info("Log4j2ExampleApp started.");
    CustomArray array = new CustomArray(1, 8, -9, 7, 5, -85, 2, -9, 5);
    logger.info(array);
  }
}
