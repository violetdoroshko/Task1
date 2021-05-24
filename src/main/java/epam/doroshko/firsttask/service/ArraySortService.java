package epam.doroshko.firsttask.service;

import epam.doroshko.firsttask.entity.CustomArray;

public interface ArraySortService {
  void bubbleSort(CustomArray array);

  void quickSort(CustomArray array);

  void insertionSort(CustomArray array);
}
