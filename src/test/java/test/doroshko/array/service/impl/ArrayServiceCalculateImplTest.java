package test.doroshko.array.service.impl;

import epam.doroshko.array.entity.CustomArray;
import epam.doroshko.array.exception.CustomArrayException;
import epam.doroshko.array.service.impl.ArrayCalculateServiceImpl;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

//TODO: calculateAmountOfPositiveArrayElements(), calculateAmountOfNegativeArrayElements().


public class ArrayServiceCalculateImplTest {
  private final ArrayCalculateServiceImpl service = new ArrayCalculateServiceImpl();

  @Test
  void sumOfBaselineArrayElementsTest() throws CustomArrayException {
    CustomArray array = new CustomArray(-5, 7, 8, 3, 5, 9, -8, -7, 0, 10);
    long actualSum = service.calculateSumOfArrayElements(array);
    long expectedSum = 22;
    assertEquals(actualSum, expectedSum);
  }

  @Test
  void sumOfEmptyArrayElementsTest() throws CustomArrayException {
    CustomArray array = new CustomArray();
    long actualSum = service.calculateSumOfArrayElements(array);
    long expectedSum = 0;
    assertEquals(actualSum, expectedSum);
  }

  @Test
  void averageOfBaselineArrayElementsTest() throws CustomArrayException {
    CustomArray array = new CustomArray(-5, 7, 8, 3, 5, 9, -8, -7, 0, 10);
    double actualAverage = service.calculateAverageOfArrayElements(array);
    double expectedAverage = 2.2;
    assertEquals(actualAverage, expectedAverage, 5);
  }

  @Test
  void averageOfEmptyArrayElementsTest() {
    CustomArray array = new CustomArray();
    assertThrows(CustomArrayException.class, () -> service.calculateAverageOfArrayElements(array));
  }

  @Test
  void minNumberOfBaseLineArrayTest() throws CustomArrayException {
    CustomArray array = new CustomArray(-5, 7, 8, 3, 5, 9, -8, -7, 0, 10);
    int actualMin = service.findMin(array);
    int expectedMin = -8;
    assertEquals(actualMin, expectedMin);
  }

  @Test
  void minNumberOfEqualPositiveArrayTest() throws CustomArrayException {
    CustomArray array = new CustomArray(9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9);
    int actualMin = service.findMin(array);
    int expectedMin = 9;
    assertEquals(actualMin, expectedMin);
  }

  @Test
  void minNumberOfEqualNegativeArrayTest() throws CustomArrayException {
    CustomArray array = new CustomArray(-9, -9, -9, -9, -9, -9, -9, -9, -9);
    int actualMin = service.findMin(array);
    int expectedMin = -9;
    assertEquals(actualMin, expectedMin);
  }

  @Test
  void minNumberOfEmptyArrayTest() {
    CustomArray array = new CustomArray();
    assertThrows(CustomArrayException.class, () -> service.findMin(array));
  }

  @Test
  void maxNumberOfBaseLineArrayTest() throws CustomArrayException {
    CustomArray array = new CustomArray(-5, 7, 8, 3, 5, 9, -8, -7, 0, 10);
    int actualMax = service.findMax(array);
    int expectedMax = 10;
    assertEquals(actualMax, expectedMax);
  }

  @Test
  void maxNumberOfEqualPositiveArrayTest() throws CustomArrayException {
    CustomArray array = new CustomArray(9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9);
    int actualMax = service.findMax(array);
    int expectedMax = 9;
    assertEquals(actualMax, expectedMax);
  }

  @Test
  void maxNumberOfEqualNegativeArrayTest() throws CustomArrayException {
    CustomArray array = new CustomArray(-9, -9, -9, -9, -9, -9, -9, -9, -9);
    int actualMax = service.findMax(array);
    int expectedMax = -9;
    assertEquals(actualMax, expectedMax);
  }

  @Test
  void maxNumberOfEmptyArrayTest() {
    CustomArray array = new CustomArray();
    assertThrows(CustomArrayException.class, () -> service.findMax(array));
  }

}
