package epam.doroshko.array.service.impl;

import epam.doroshko.array.entity.CustomArray;
import epam.doroshko.array.exception.CustomArrayException;
import epam.doroshko.array.service.ArrayCalculateService;
import epam.doroshko.array.service.ArrayChangeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayChangeServiceImpl implements ArrayChangeService {

  private static final Logger logger = LogManager.getLogger("ArrayChangeService");

  @Override
  public void changeNegativesToOpposite(CustomArray array) {
    if (array != null) {
      int[] temp = array.getArray();
      for (var i = 0; i < temp.length; ++i) {
        if (temp[i] < 0) {
          temp[i] *= -1;
        }
      }
      array.setArray(temp);
    }
    logger.info("All negative elements were changed to opposite");
  }

  @Override
  public void changeMinValueToMaxValue(CustomArray array) throws CustomArrayException {
    if (array == null || array.isEmpty()) {
      logger.error("Max and min elements can't be found in empty array");
      throw new CustomArrayException("Max and min elements can't be found in empty array");
    }
    int[] temp = array.getArray();
    ArrayCalculateService service = new ArrayCalculateServiceImpl();
    int min = service.findMin(array);
    int max = service.findMax(array);
    if (min != max) {
      for (var i = 0; i < temp.length; ++i) {
        if (temp[i] == min) {
          temp[i] = max;
        }
      }
      array.setArray(temp);
    }

    logger.info("All min elements were changed to max elements");
  }
}
