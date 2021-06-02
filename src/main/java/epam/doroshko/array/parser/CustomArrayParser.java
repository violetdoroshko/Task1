package epam.doroshko.array.parser;

public class CustomArrayParser {
  private static final String SPACE = "\\s";

  public int[] parse(String str) {

    var array = new int[str.split(SPACE).length];
    var i = 0;
    for (String element : str.split(SPACE)) {
      array[i] = Integer.parseInt(element);
      ++i;
    }
    return array;
  }
}