package epam.doroshko.firsttask.service;

import epam.doroshko.firsttask.entity.CustomArray;

public interface ArrayChangeService {
  void changeNegativesToOpposite(CustomArray array);

  void changeMinValueToMaxValue(CustomArray array);
}
