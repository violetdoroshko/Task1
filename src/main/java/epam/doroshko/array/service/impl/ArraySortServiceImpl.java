package epam.doroshko.array.service.impl;

import epam.doroshko.array.entity.CustomArray;
import epam.doroshko.array.service.ArraySortService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class ArraySortServiceImpl implements ArraySortService {
  private static final Logger logger = LogManager.getLogger("ArraySortService");
  private final Random medianRandom = new Random();

  @Override
  public void bubbleSort(CustomArray array) {
    if (array != null) {
      int[] temp = array.getArray();
      var hasChanged = true;
      while (hasChanged) {
        hasChanged = false;
        for (var i = 0; i < temp.length - 1; ++i) {
          if (temp[i] > temp[i + 1]) {
            hasChanged = true;
            swap(temp, i, i + 1);
          }
        }
      }
      array.setArray(temp);
    }
    logger.info("Array was sorted with bubble sort");
  }

  @Override
  public void quickSort(CustomArray array) {
    if (array != null && !array.isEmpty()) {
      int[] temp = array.getArray();
      quickSort(temp, 0, temp.length - 1);
      array.setArray(temp);
    }
    logger.info("Array was sorted with quick sort");
  }

  @Override
  public void insertionSort(CustomArray array) {
    if (array != null) {
      int[] temp = array.getArray();
      for (var left = 0; left < temp.length; ++left) {
        int key = temp[left];
        int i = left - 1;
        while (i >= 0) {
          if (key < temp[i]) {
            temp[i + 1] = temp[i];
          } else {
            break;
          }
          --i;
        }
        temp[i + 1] = key;
      }
      array.setArray(temp);
    }
    logger.info("Array was sorted with insertion sort");
  }

  private void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  private void quickSort(int[] array, int left, int right) {
    int leftIndex = left;
    int rightIndex = right;
    int median = array[leftIndex + medianRandom.nextInt(rightIndex - leftIndex)];
    while (leftIndex <= rightIndex) {
      while (array[leftIndex] < median) {
        leftIndex++;
      }
      while (array[rightIndex] > median) {
        rightIndex--;
      }
      if (leftIndex <= rightIndex) {
        int tmp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = tmp;
        leftIndex++;
        rightIndex--;
      }
    }
    if (left < rightIndex) {
      quickSort(array, left, rightIndex);
    }
    if (right > leftIndex) {
      quickSort(array, leftIndex, right);
    }
  }
}
