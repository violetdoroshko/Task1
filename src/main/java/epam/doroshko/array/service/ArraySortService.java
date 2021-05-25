package epam.doroshko.array.service;

import epam.doroshko.array.entity.CustomArray;

public interface ArraySortService {
  void bubbleSort(CustomArray array);

  void quickSort(CustomArray array);

  void insertionSort(CustomArray array);
}
