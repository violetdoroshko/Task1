package epam.doroshko.firsttask.service.impl;

import epam.doroshko.firsttask.entity.CustomArray;
import epam.doroshko.firsttask.service.ArrayCalculateService;
import epam.doroshko.firsttask.service.ArrayChangeService;

public class ArrayChangeServiceImpl implements ArrayChangeService {

  public void changeNegativesToOpposite(CustomArray array) {
    int[] temp = array.getArray();
    for (int i = 0; i < temp.length; ++i) {
      if (temp[i] < 0) {
        temp[i] *= -1;
      }
    }
    array.setArray(temp);
  }

  public void changeMinValueToMaxValue(CustomArray array) {
    int[] temp = array.getArray();
    ArrayCalculateService service = new ArrayCalculateServiceImpl();
    int min = service.findMin(array);
    int max = service.findMax(array);
    for (int i = 0; i < temp.length; ++i) {
      if (temp[i] == min) {
        temp[i] = max;
      }
    }
    array.setArray(temp);
  }
}
