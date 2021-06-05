package epam.doroshko.array.service.impl;

import epam.doroshko.array.entity.CustomArray;
import epam.doroshko.array.exception.CustomArrayException;
import epam.doroshko.array.service.ArrayCalculateService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArrayCalculateStreamServiceImpl implements ArrayCalculateService {
  private static final Logger logger = LogManager.getLogger("ArrayCalculateService");

  @Override
  public long calculateSumOfArrayElements(CustomArray array) throws CustomArrayException {
    var sum = 0L;
    if (array != null) {
      sum = Arrays.stream(array.getArray()).sum();
    }
    logger.info("Calculated sum of array elements with stream: " + sum);
    return sum;
  }

  @Override
  public double calculateAverageOfArrayElements(CustomArray array) throws CustomArrayException {
    double average = 0;
    if (array == null || array.isEmpty()) {
      logger.error("Average of elements can't be found in empty array");
      throw new CustomArrayException("Average of elements can't be found in empty array");
    }
    average = Arrays.stream(array.getArray()).average().getAsDouble();
    logger.info("Calculated average of array elements with stream: " + average);
    return average;
  }

  @Override
  public int calculateAmountOfPositiveArrayElements(CustomArray array) {
    var amountOfPositiveArrayElements = 0;
    if (array != null) {
      amountOfPositiveArrayElements = (int) Arrays.stream(array.getArray()).filter(i -> i > 0).count();
    }
    logger.info("Calculated amount of positive array elements: " + amountOfPositiveArrayElements);
    return amountOfPositiveArrayElements;
  }

  @Override
  public int calculateAmountOfNegativeArrayElements(CustomArray array) {
    var amountOfNegativeArrayElements = 0;
    if (array != null) {
      amountOfNegativeArrayElements = (int) Arrays.stream(array.getArray()).filter(i -> i < 0).count();
    }
    logger.info("Calculated amount of negative array elements: " + amountOfNegativeArrayElements);
    return amountOfNegativeArrayElements;
  }

  @Override
  public int findMin(CustomArray array) throws CustomArrayException {
    if (array == null || array.isEmpty()) {
      logger.error("Min element can't be found in empty array");
      throw new CustomArrayException("Min element can't be found in empty array");
    }
    var min = Arrays.stream(array.getArray()).min().getAsInt();
    logger.info("Find min: " + min);
    return min;
  }

  @Override
  public int findMax(CustomArray array) throws CustomArrayException {
    if (array == null || array.isEmpty()) {
      logger.error("Max element can't be found in empty array");
      throw new CustomArrayException("Max element can't be found in empty array");
    }
    var max = Arrays.stream(array.getArray()).max().getAsInt();
    logger.info("Find max: " + max);
    return max;
  }
}
