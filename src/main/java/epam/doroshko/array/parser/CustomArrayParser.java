package epam.doroshko.array.parser;

import epam.doroshko.array.entity.CustomArray;

public class CustomArrayParser {
  public CustomArray parse(String str) {

    int length = str.split(" ").length;
    var array = new int[length];
    var i = 0;
    for (String element : str.split(" ")) {
      array[i] = Integer.parseInt(element);
      ++i;
    }
    return new CustomArray(array);
  }
}