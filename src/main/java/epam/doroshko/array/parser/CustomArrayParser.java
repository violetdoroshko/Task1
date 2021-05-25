package epam.doroshko.array.parser;

import epam.doroshko.array.entity.CustomArray;

public class CustomArrayParser {
  public CustomArray parse(String str) {

    final var space = "//s";
    int length = str.split(space).length;
    var array = new int[length];
    var i = 0;
    for (String element : str.split(space)) {
      array[i] = Integer.parseInt(element);
      ++i;
    }
    return new CustomArray(array);
  }
}