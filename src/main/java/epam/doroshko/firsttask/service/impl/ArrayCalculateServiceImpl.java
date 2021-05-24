package epam.doroshko.firsttask.service.impl;

import epam.doroshko.firsttask.entity.CustomArray;
import epam.doroshko.firsttask.service.ArrayCalculateService;

public class ArrayCalculateServiceImpl implements ArrayCalculateService {

  public long calculateSumOfArrayElements(CustomArray array) {
    long sum = 0L;
    int[] temp = array.getArray();
    for (int j : temp) {
      sum += j;
    }
    return sum;
  }

  public int calculateAverageOfArrayElements(CustomArray array) {
    int[] temp = array.getArray();
    return (int) calculateSumOfArrayElements(array) / temp.length;
  }

  public int calculateAmountOfPositiveArrayElements(CustomArray array) {
    int amountOfPositiveArrayElements = 0;
    int[] temp = array.getArray();
    for (int j : temp) {
      if (j > 0) {
        ++amountOfPositiveArrayElements;
      }
    }
    return amountOfPositiveArrayElements;
  }

  public int calculateAmountOfNegativeArrayElements(CustomArray array) {
    int amountOfNegativeArrayElements = 0;
    int[] temp = array.getArray();
    for (int j : temp) {
      if (j < 0) {
        ++amountOfNegativeArrayElements;
      }
    }
    return amountOfNegativeArrayElements;
  }


  public int findMin(CustomArray array) {
    int[] temp = array.getArray();
    int min = temp[0];
    for (int i = 1; i < temp.length; ++i) {
      if (min > temp[i]) {
        min = temp[i];
      }
    }
    return min;
  }

  public int findMax(CustomArray array) {
    int[] temp = array.getArray();
    int max = temp[0];
    for (int i = 1; i < temp.length; ++i) {
      if (max < temp[i]) {
        max = temp[i];
      }
    }
    return max;
  }
}
