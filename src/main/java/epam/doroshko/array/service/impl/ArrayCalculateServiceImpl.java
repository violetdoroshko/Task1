package epam.doroshko.array.service.impl;

import epam.doroshko.array.entity.CustomArray;
import epam.doroshko.array.exception.CustomArrayException;
import epam.doroshko.array.service.ArrayCalculateService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayCalculateServiceImpl implements ArrayCalculateService {

  private static final Logger logger = LogManager.getLogger("ArrayCalculateService");

  @Override
  public long calculateSumOfArrayElements(CustomArray array) {
    var sum = 0L;
    if (array != null) {
      int[] temp = array.getArray();
      for (int j : temp) {
        sum += j;
      }
    }
    logger.info("Calculate sum of array elements: " + sum);
    return sum;
  }

  @Override
  public double calculateAverageOfArrayElements(CustomArray array) throws CustomArrayException {
    if (array == null || array.isEmpty()) {
      logger.error("Average of elements can't be found in empty array");
      throw new CustomArrayException("Average of elements can't be found in empty array");
    }
    int[] temp = array.getArray();
    double average = (double) calculateSumOfArrayElements(array) / temp.length;
    logger.info("Calculate average of array elements: " + average);
    return average;
  }

  @Override
  public int calculateAmountOfPositiveArrayElements(CustomArray array) {
    var amountOfPositiveArrayElements = 0;
    if (array != null) {
      int[] temp = array.getArray();
      for (int j : temp) {
        if (j > 0) {
          ++amountOfPositiveArrayElements;
        }
      }
    }
    logger.info("Calculate amount of positive array elements: " + amountOfPositiveArrayElements);
    return amountOfPositiveArrayElements;
  }

  @Override
  public int calculateAmountOfNegativeArrayElements(CustomArray array) {
    var amountOfNegativeArrayElements = 0;
    if (array != null) {
      int[] temp = array.getArray();
      for (int j : temp) {
        if (j < 0) {
          ++amountOfNegativeArrayElements;
        }
      }
    }
    logger.info("Calculate amount of negative array elements: " + amountOfNegativeArrayElements);
    return amountOfNegativeArrayElements;
  }

  @Override
  public int findMin(CustomArray array) throws CustomArrayException {
    if (array == null || array.isEmpty()) {
      logger.error("Min element can't be found in empty array");
      throw new CustomArrayException("Min element can't be found in empty array");
    }
    int[] temp = array.getArray();
    int min = temp[0];
    for (var i = 1; i < temp.length; ++i) {
      if (min > temp[i]) {
        min = temp[i];
      }
    }
    logger.info("Find min: " + min);
    return min;
  }

  @Override
  public int findMax(CustomArray array) throws CustomArrayException {
    if (array == null || array.isEmpty()) {
      logger.error("Max element can't be found in empty array");
      throw new CustomArrayException("Max element can't be found in empty array");
    }
    int[] temp = array.getArray();
    int max = temp[0];
    for (var i = 1; i < temp.length; ++i) {
      if (max < temp[i]) {
        max = temp[i];
      }
    }
    logger.info("Find max: " + max);
    return max;
  }
}
