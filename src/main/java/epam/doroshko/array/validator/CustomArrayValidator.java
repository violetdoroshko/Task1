package epam.doroshko.array.validator;

import java.util.regex.Pattern;

public class CustomArrayValidator {
  private static final String IS_NUMBER = "^-?(\\d)+((\\s)+-?(\\d)+)*$";

  private CustomArrayValidator() {
  }

  public static boolean validateInteger(String str) {
    var pattern = Pattern.compile(IS_NUMBER);
    var matcher = pattern.matcher(str);
    return matcher.matches();
  }
}
