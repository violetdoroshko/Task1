package test.doroshko.array.service;

import epam.doroshko.array.entity.CustomArray;
import epam.doroshko.array.exception.CustomArrayException;
import epam.doroshko.array.service.ArrayChangeService;
import epam.doroshko.array.service.impl.ArrayChangeServiceImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class ArrayChangeServiceTest {
  private final ArrayChangeService service = new ArrayChangeServiceImpl();
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
  void changeNegativesToOppositeInBaselineArray() throws CustomArrayException {
    CustomArray actualArray = baselineArray;
    service.changeNegativesToOpposite(actualArray);
    CustomArray expectedArray = new CustomArray(5, 7, 8, 3, 5, 9, 8, 7, 0, 10);
    assertEquals(actualArray, expectedArray);
  }

  @Test
  void changeNegativesToOppositeInEmptyArray() throws CustomArrayException {
    CustomArray actualArray = emptyArray;
    service.changeNegativesToOpposite(actualArray);
    CustomArray expectedArray = new CustomArray();
    assertEquals(actualArray, expectedArray);
  }

  @Test
  void changeNegativesToOppositeInNullArray() {
    CustomArray actualArray = nullArray;
    service.changeNegativesToOpposite(actualArray);
    CustomArray expectedArray = null;
    assertEquals(actualArray, expectedArray);
  }

  @Test
  void changeNegativesToOppositeInEqualPositiveArray() {
    CustomArray actualArray = equalPositiveArray;
    service.changeNegativesToOpposite(actualArray);
    CustomArray expectedArray = new CustomArray(9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9);
    assertEquals(actualArray, expectedArray);
  }

  @Test
  void changeNegativesToOppositeInEqualNegativeArray() {
    CustomArray actualArray = equalNegativeArray;
    service.changeNegativesToOpposite(actualArray);
    CustomArray expectedArray = new CustomArray(9, 9, 9, 9, 9, 9, 9, 9, 9);
    assertEquals(actualArray, expectedArray);
  }

  @Test
  void changeMinToMaxInBaselineArray() throws CustomArrayException {
    CustomArray actualArray = baselineArray;
    service.changeMinValueToMaxValue(actualArray);
    CustomArray expectedArray = new CustomArray(-5, 7, 8, 3, 5, 9, 10, -7, 0, 10);
    assertEquals(actualArray, expectedArray);
  }

  @Test
  void changeMinToMaxInEmptyArray() {
    assertThrows(CustomArrayException.class, () -> service.changeMinValueToMaxValue(emptyArray));
  }

  @Test
  void changeMinToMaxInNullArray() {
    assertThrows(CustomArrayException.class, () -> service.changeMinValueToMaxValue(nullArray));
  }

  @Test
  void changeMinToMaxInEqualPositiveArray() throws CustomArrayException {
    CustomArray actualArray = equalPositiveArray;
    service.changeMinValueToMaxValue(actualArray);
    CustomArray expectedArray = new CustomArray(9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9);
    assertEquals(actualArray, expectedArray);
  }

  @Test
  void changeMinToMaxInEqualNegativeArray() throws CustomArrayException {
    CustomArray actualArray = equalNegativeArray;
    service.changeMinValueToMaxValue(actualArray);
    CustomArray expectedArray = new CustomArray(-9, -9, -9, -9, -9, -9, -9, -9, -9);
    assertEquals(actualArray, expectedArray);
  }


}
