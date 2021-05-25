package epam.doroshko.array.service;

import epam.doroshko.array.entity.CustomArray;
import epam.doroshko.array.exception.CustomArrayException;

public interface ArrayCalculateService {

  long calculateSumOfArrayElements(CustomArray array) throws CustomArrayException;

  double calculateAverageOfArrayElements(CustomArray array) throws CustomArrayException;

  int calculateAmountOfPositiveArrayElements(CustomArray array);

  int calculateAmountOfNegativeArrayElements(CustomArray array);

  int findMin(CustomArray array) throws CustomArrayException;

  int findMax(CustomArray array) throws CustomArrayException;
}
