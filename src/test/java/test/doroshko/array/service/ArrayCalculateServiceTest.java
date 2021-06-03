package test.doroshko.array.service;

import epam.doroshko.array.entity.CustomArray;
import epam.doroshko.array.exception.CustomArrayException;
import epam.doroshko.array.service.ArrayCalculateService;
import epam.doroshko.array.service.impl.ArrayCalculateServiceImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class ArrayCalculateServiceTest {
  private final ArrayCalculateService service = new ArrayCalculateServiceImpl();
  CustomArray baselineArray;
  CustomArray emptyArray;
  CustomArray nullArray;
  CustomArray equalPositiveArray;
  CustomArray equalNegativeArray;

  @BeforeMethod
  public void setUp() {
    baselineArray = new CustomArray(-5, 7, 8, 3, 5, 9, -8, -7, 0, 10);
    emptyArray = new CustomArray();
    equalPositiveArray = new CustomArray(9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9);
    equalNegativeArray = new CustomArray(-9, -9, -9, -9, -9, -9, -9, -9, -9);
  }


  @Test
  void sumOfBaselineArrayElementsTest() throws CustomArrayException {
    long actualSum = service.calculateSumOfArrayElements(baselineArray);
    long expectedSum = 22;
    assertEquals(actualSum, expectedSum);
  }

  @Test
  void sumOfEmptyArrayElementsTest() throws CustomArrayException {
    long actualSum = service.calculateSumOfArrayElements(emptyArray);
    long expectedSum = 0;
    assertEquals(actualSum, expectedSum);
  }

  @Test
  void sumOfNullArrayElementsTest() throws CustomArrayException {
    long actualSum = service.calculateSumOfArrayElements(nullArray);
    long expectedSum = 0;
    assertEquals(actualSum, expectedSum);
  }


  @Test
  void averageOfBaselineArrayElementsTest() throws CustomArrayException {
    double actualAverage = service.calculateAverageOfArrayElements(baselineArray);
    double expectedAverage = 2.2;
    assertEquals(actualAverage, expectedAverage, 5);
  }

  @Test
  void averageOfEmptyArrayElementsTest() {
    assertThrows(CustomArrayException.class, () -> service.calculateAverageOfArrayElements(emptyArray));
  }

  @Test
  void averageOfNullArrayElementsTest() {
    assertThrows(CustomArrayException.class, () -> service.calculateAverageOfArrayElements(nullArray));
  }

  @Test
  void minNumberOfBaseLineArrayTest() throws CustomArrayException {
    int actualMin = service.findMin(baselineArray);
    int expectedMin = -8;
    assertEquals(actualMin, expectedMin);
  }

  @Test
  void minNumberOfEqualPositiveArrayTest() throws CustomArrayException {
    int actualMin = service.findMin(equalPositiveArray);
    int expectedMin = 9;
    assertEquals(actualMin, expectedMin);
  }

  @Test
  void minNumberOfEqualNegativeArrayTest() throws CustomArrayException {
    int actualMin = service.findMin(equalNegativeArray);
    int expectedMin = -9;
    assertEquals(actualMin, expectedMin);
  }

  @Test
  void minNumberOfEmptyArrayTest() {
    assertThrows(CustomArrayException.class, () -> service.findMin(emptyArray));
  }

  @Test
  void minNumberOfNullArrayTest() {
    assertThrows(CustomArrayException.class, () -> service.findMin(nullArray));
  }

  @Test
  void maxNumberOfBaseLineArrayTest() throws CustomArrayException {
    int actualMax = service.findMax(baselineArray);
    int expectedMax = 10;
    assertEquals(actualMax, expectedMax);
  }

  @Test
  void maxNumberOfEqualPositiveArrayTest() throws CustomArrayException {
    int actualMax = service.findMax(equalPositiveArray);
    int expectedMax = 9;
    assertEquals(actualMax, expectedMax);
  }

  @Test
  void maxNumberOfEqualNegativeArrayTest() throws CustomArrayException {
    int actualMax = service.findMax(equalNegativeArray);
    int expectedMax = -9;
    assertEquals(actualMax, expectedMax);
  }

  @Test
  void maxNumberOfEmptyArrayTest() {
    assertThrows(CustomArrayException.class, () -> service.findMax(emptyArray));
  }

  @Test
  void maxNumberOfNullArrayTest() {
    assertThrows(CustomArrayException.class, () -> service.findMax(nullArray));
  }

  @Test
  void amountOfPositiveBaselineArrayElementsTest() {
    int actualAmount = service.calculateAmountOfPositiveArrayElements(baselineArray);
    int expectedAmount = 6;
    assertEquals(actualAmount, expectedAmount);
  }

  @Test
  void amountOfPositiveEmptyArrayElementsTest() {
    int actualAmount = service.calculateAmountOfPositiveArrayElements(emptyArray);
    int expectedAmount = 0;
    assertEquals(actualAmount, expectedAmount);
  }

  @Test
  void amountOfPositiveNullArrayElementsTest() {
    int actualAmount = service.calculateAmountOfPositiveArrayElements(nullArray);
    int expectedAmount = 0;
    assertEquals(actualAmount, expectedAmount);
  }

  @Test
  void amountOfNegativeBaselineArrayElementsTest() {
    int actualAmount = service.calculateAmountOfNegativeArrayElements(baselineArray);
    int expectedAmount = 3;
    assertEquals(actualAmount, expectedAmount);
  }

  @Test
  void amountOfNegativeEmptyArrayElementsTest() {
    int actualAmount = service.calculateAmountOfNegativeArrayElements(emptyArray);
    int expectedAmount = 0;
    assertEquals(actualAmount, expectedAmount);
  }

  @Test
  void amountOfNegativeNullArrayElementsTest() {
    int actualAmount = service.calculateAmountOfNegativeArrayElements(nullArray);
    int expectedAmount = 0;
    assertEquals(actualAmount, expectedAmount);
  }


}
