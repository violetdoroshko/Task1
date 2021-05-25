package epam.doroshko.array.service.impl;

import epam.doroshko.array.entity.CustomArray;
import epam.doroshko.array.service.ArraySortService;

public class ArraySortServiceImpl implements ArraySortService {
  void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  @Override
  public void bubbleSort(CustomArray array) {
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

  @Override
  public void quickSort(CustomArray array) {
    int[] temp = array.getArray();
    quickSort(temp, 0, temp.length - 1);
    array.setArray(temp);
  }

  private void quickSort(int[] array, int left, int right) {
    if (left < right) {
      int middle = partition(array, left, right);
      quickSort(array, left, middle);
      quickSort(array, middle + 1, right);
    }
  }

  private int partition(int[] array, int leftBorder, int rightBorder) {
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

  @Override
  public void insertionSort(CustomArray array) {
    int[] temp = array.getArray();
    for (var left = 0; left < temp.length; ++left) {
      int key = temp[left];
      int i = left - 1;
      for (; i >= 0; --i) {
        if (key < temp[i]) {
          temp[i + 1] = temp[i];
        } else {
          break;
        }
      }
      temp[i + 1] = key;
    }
    array.setArray(temp);
  }
}
