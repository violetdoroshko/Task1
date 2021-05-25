package epam.doroshko.array.service;

import epam.doroshko.array.entity.CustomArray;
import epam.doroshko.array.exception.CustomArrayException;

public interface ArrayChangeService {
  void changeNegativesToOpposite(CustomArray array);

  void changeMinValueToMaxValue(CustomArray array) throws CustomArrayException;
}
