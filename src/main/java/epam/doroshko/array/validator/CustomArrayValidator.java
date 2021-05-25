package epam.doroshko.array.validator;

import java.util.regex.Pattern;

public class CustomArrayValidator {
  public boolean isValidate(String str) {
    final var regularString = "^-?(\\d)+((\\s)+-?(\\d)+)*$";
    var pattern = Pattern.compile(regularString);
    var matcher = pattern.matcher(str);
    return matcher.matches();
  }
}
