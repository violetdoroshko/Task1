package epam.doroshko.array.service.impl;

import epam.doroshko.array.entity.CustomArray;
import epam.doroshko.array.exception.CustomArrayException;
import epam.doroshko.array.service.ArrayCalculateService;

public class ArrayCalculateServiceImpl implements ArrayCalculateService {

  @Override
  public long calculateSumOfArrayElements(CustomArray array) {
    var sum = 0L;
    int[] temp = array.getArray();
    for (int j : temp) {
      sum += j;
    }
    return sum;
  }

  @Override
  public double calculateAverageOfArrayElements(CustomArray array) throws CustomArrayException {
    if (array.isEmpty()) {
      throw new CustomArrayException("Average of elements can't be found in empty array");
    }
    int[] temp = array.getArray();
    return  (double) calculateSumOfArrayElements(array) / temp.length;
  }

  @Override
  public int calculateAmountOfPositiveArrayElements(CustomArray array) {
    var amountOfPositiveArrayElements = 0;
    int[] temp = array.getArray();
    for (int j : temp) {
      if (j > 0) {
        ++amountOfPositiveArrayElements;
      }
    }
    return amountOfPositiveArrayElements;
  }

  @Override
  public int calculateAmountOfNegativeArrayElements(CustomArray array) {
    var amountOfNegativeArrayElements = 0;
    int[] temp = array.getArray();
    for (int j : temp) {
      if (j < 0) {
        ++amountOfNegativeArrayElements;
      }
    }
    return amountOfNegativeArrayElements;
  }

  @Override
  public int findMin(CustomArray array) throws CustomArrayException {
    if (array.isEmpty()) {
      throw new CustomArrayException("Min element can't be found in empty array");
    }
    int[] temp = array.getArray();
    int min = temp[0];
    for (var i = 1; i < temp.length; ++i) {
      if (min > temp[i]) {
        min = temp[i];
      }
    }
    return min;
  }

  @Override
  public int findMax(CustomArray array) throws CustomArrayException {
    if (array.isEmpty()) {
      throw new CustomArrayException("Max element can't be found in empty array");
    }
    int[] temp = array.getArray();
    int max = temp[0];
    for (var i = 1; i < temp.length; ++i) {
      if (max < temp[i]) {
        max = temp[i];
      }
    }
    return max;
  }
}
