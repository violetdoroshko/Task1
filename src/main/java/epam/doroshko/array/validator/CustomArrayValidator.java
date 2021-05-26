package epam.doroshko.array.validator;

import java.util.regex.Pattern;

public class CustomArrayValidator {
  private static final String ISNUMBER = "^[-?[\\d]+\\s]+$";

  public boolean isValidate(String str) {
    var pattern = Pattern.compile(ISNUMBER);
    var matcher = pattern.matcher(str);
    return matcher.matches();
  }
}
