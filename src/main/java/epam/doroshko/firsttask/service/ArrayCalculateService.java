package epam.doroshko.firsttask.service;

import epam.doroshko.firsttask.entity.CustomArray;

public interface ArrayCalculateService {
  long calculateSumOfArrayElements(CustomArray array);

  int calculateAverageOfArrayElements(CustomArray array);

  int calculateAmountOfPositiveArrayElements(CustomArray array);

  int calculateAmountOfNegativeArrayElements(CustomArray array);

  int findMin(CustomArray array);
  int findMax(CustomArray array);
}
