package epam.doroshko.array.service.impl;

import epam.doroshko.array.entity.CustomArray;
import epam.doroshko.array.exception.CustomArrayException;
import epam.doroshko.array.service.ArrayCalculateService;
import epam.doroshko.array.service.ArrayChangeService;

public class ArrayChangeServiceImpl implements ArrayChangeService {

  @Override
  public void changeNegativesToOpposite(CustomArray array) {
    int[] temp = array.getArray();
    for (var i = 0; i < temp.length; ++i) {
      if (temp[i] < 0) {
        temp[i] *= -1;
      }
    }
    array.setArray(temp);
  }

  @Override
  public void changeMinValueToMaxValue(CustomArray array) throws CustomArrayException {
    int[] temp = array.getArray();
    ArrayCalculateService service = new ArrayCalculateServiceImpl();
    int min = service.findMin(array);
    int max = service.findMax(array);
    for (var i = 0; i < temp.length; ++i) {
      if (temp[i] == min) {
        temp[i] = max;
      }
    }
    array.setArray(temp);
  }
}
