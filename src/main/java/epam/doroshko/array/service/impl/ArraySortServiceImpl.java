package epam.doroshko.array.service.impl;

import epam.doroshko.array.entity.CustomArray;
import epam.doroshko.array.service.ArraySortService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySortServiceImpl implements ArraySortService {
  private static final Logger logger = LogManager.getLogger("ArraySortService");

  //TODO rewrite quick sort
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
    if (array != null) {
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
    if (left < right) {
      int middle = recalculateMiddle(array, left, right);
      quickSort(array, left, middle);
      quickSort(array, middle + 1, right);
    }
  }

  private int recalculateMiddle(int[] array, int leftBorder, int rightBorder) {
    int middleIndex = (leftBorder + rightBorder) / 2;
    int leftIndex = leftBorder;
    int rightIndex = rightBorder;
    while (leftIndex <= rightIndex) {
      while (array[leftIndex] < array[middleIndex]) {
        ++leftIndex;
      }
      while (array[rightIndex] > array[middleIndex]) {
        --rightIndex;
      }
      if (leftIndex >= rightIndex) {
        break;
      }
      swap(array, leftIndex++, rightIndex--);
    }
    return rightIndex;
  }


}
