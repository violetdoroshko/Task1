package epam.doroshko.firsttask.service.impl;

import epam.doroshko.firsttask.entity.CustomArray;

public class ArraySortServiceImpl {
  void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  public void bubbleSort(CustomArray array) {
    int[] temp = array.getArray();
    boolean hasChanged = true;
    while (hasChanged) {
      hasChanged = false;
      for (int i = 0; i < temp.length - 1; ++i) {
        if (temp[i] > temp[i + 1]) {
          hasChanged = true;
          swap(temp, i, i + 1);
        }
      }
    }
    array.setArray(temp);
  }

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

  public void insertionSort(CustomArray array) {
    int[] temp = array.getArray();
    for (int left = 0; left < temp.length; ++left) {
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
