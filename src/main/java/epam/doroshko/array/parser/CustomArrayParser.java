package epam.doroshko.array.parser;

import epam.doroshko.array.entity.CustomArray;
import epam.doroshko.array.exception.CustomArrayException;
import epam.doroshko.array.validator.CustomArrayValidator;

public class CustomArrayParser {
  public CustomArray parse(String str) throws CustomArrayException {
    CustomArrayValidator validator = new CustomArrayValidator();
    if (validator.isValidate(str)) {
      final var space = "\\s+";
      int size = str.split(space).length;
      var array = new int[size];
      var i = 0;
      for (String element : str.split(space)) {
        array[i] = Integer.parseInt(element);
        ++i;
      }
      return new CustomArray(array);
    } else {
      throw new CustomArrayException("This line is not correct");
    }
  }
}
