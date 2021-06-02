package test.doroshko.array.service;

import epam.doroshko.array.entity.CustomArray;
import epam.doroshko.array.service.ArraySortService;
import epam.doroshko.array.service.impl.ArraySortServiceImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArraySortServiceTest {
  private final ArraySortService service = new ArraySortServiceImpl();
  CustomArray baselineArray;
  CustomArray emptyArray;
  CustomArray nullArray;
  CustomArray equalValuesArray;
  CustomArray alreadySortedArray;

  @BeforeMethod
  public void setUp() {
    baselineArray = new CustomArray(-5, 7, 8, 3, 5, 9, -8, -7, 0, 10, 3, 5, 0);
    emptyArray = new CustomArray();
    equalValuesArray = new CustomArray(9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9);
    alreadySortedArray = new CustomArray(-10, 1, 5, 7, 8, 20, 54, 58, 58, 57);
  }

  @Test
  void bubbleSortBaselineArray() {
    CustomArray actualArray = baselineArray;
    service.bubbleSort(actualArray);
    CustomArray expectedArray = new CustomArray(-8, -7, -5, 0, 0, 3, 3, 5, 5, 7, 8, 9, 10);
    assertEquals(actualArray, expectedArray);
  }

  @Test
  void bubbleSortEmptyArray() {
    CustomArray actualArray = emptyArray;
    service.bubbleSort(actualArray);
    CustomArray expectedArray = emptyArray;
    assertEquals(actualArray, expectedArray);
  }

  @Test
  void bubbleSortNullArray() {
    CustomArray actualArray = nullArray;
    service.bubbleSort(actualArray);
    CustomArray expectedArray = nullArray;
    assertEquals(actualArray, expectedArray);
  }

  @Test
  void bubbleSortEqualValueArray() {
    CustomArray actualArray = equalValuesArray;
    service.bubbleSort(actualArray);
    CustomArray expectedArray = equalValuesArray;
    assertEquals(actualArray, expectedArray);
  }

  @Test
  void bubbleSortAlreadySortedArray() {
    CustomArray actualArray = alreadySortedArray;
    service.bubbleSort(actualArray);
    CustomArray expectedArray = alreadySortedArray;
    assertEquals(actualArray, expectedArray);
  }

  @Test
  void quickSortBaselineArray() {
    CustomArray actualArray = baselineArray;
    service.quickSort(actualArray);
    CustomArray expectedArray = new CustomArray(-8, -7, -5, 0, 0, 3, 3, 5, 5, 7, 8, 9, 10);
    assertEquals(actualArray, expectedArray);
  }

  @Test
  void quickSortEmptyArray() {
    CustomArray actualArray = emptyArray;
    service.quickSort(actualArray);
    CustomArray expectedArray = emptyArray;
    assertEquals(actualArray, expectedArray);
  }

  @Test
  void quickSortNullArray() {
    CustomArray actualArray = nullArray;
    service.quickSort(actualArray);
    CustomArray expectedArray = nullArray;
    assertEquals(actualArray, expectedArray);
  }

  @Test
  void quickSortEqualValueArray() {
    CustomArray actualArray = equalValuesArray;
    service.quickSort(actualArray);
    CustomArray expectedArray = equalValuesArray;
    assertEquals(actualArray, expectedArray);
  }

  @Test
  void quickSortAlreadySortedArray() {
    CustomArray actualArray = alreadySortedArray;
    service.quickSort(actualArray);
    CustomArray expectedArray = alreadySortedArray;
    assertEquals(actualArray, expectedArray);
  }
  //
  @Test
  void insertionSortBaselineArray() {
    CustomArray actualArray = baselineArray;
    service.insertionSort(actualArray);
    CustomArray expectedArray = new CustomArray(-8, -7, -5, 0, 0, 3, 3, 5, 5, 7, 8, 9, 10);
    assertEquals(actualArray, expectedArray);
  }

  @Test
  void insertionSortEmptyArray() {
    CustomArray actualArray = emptyArray;
    service.insertionSort(actualArray);
    CustomArray expectedArray = emptyArray;
    assertEquals(actualArray, expectedArray);
  }

  @Test
  void insertionSortNullArray() {
    CustomArray actualArray = nullArray;
    service.insertionSort(actualArray);
    CustomArray expectedArray = nullArray;
    assertEquals(actualArray, expectedArray);
  }

  @Test
  void insertionSortEqualValueArray() {
    CustomArray actualArray = equalValuesArray;
    service.insertionSort(actualArray);
    CustomArray expectedArray = equalValuesArray;
    assertEquals(actualArray, expectedArray);
  }

  @Test
  void insertionSortAlreadySortedArray() {
    CustomArray actualArray = alreadySortedArray;
    service.insertionSort(actualArray);
    CustomArray expectedArray = alreadySortedArray;
    assertEquals(actualArray, expectedArray);
  }
}
