package epam.doroshko.array.entity;

import epam.doroshko.array.exception.CustomArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class CustomArray {
  private static final Logger logger = LogManager.getLogger("CustomArray");
  private int[] array;

  public CustomArray(int... array) {
    this.array = array;
  }

  public int[] getArray() {
    return array.clone();
  }

  public void setArray(int... array) {
    this.array = array;
  }

  public int getLength() {
    return array.length;
  }

  public int getElement(int i) throws CustomArrayException {
    if (i < 0 || i >= getLength()) {
      logger.log(Level.ERROR, "Index " + i + " is out of bounds [0;" + (getLength() - 1) + "]");
      throw new CustomArrayException(
              "Index " + i + " is out of bounds [0;" + (getLength() - 1) + "]");
    }
    return array[i];
  }

  public boolean isEmpty() {
    return this.getLength() == 0;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomArray array1 = (CustomArray) o;
    return Arrays.equals(array, array1.array);
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(array);
  }

  @Override
  public String toString() {
    var sb = new StringBuilder();
    sb.append("CustomArray{array= ");
    sb.append(Arrays.toString(array));
    sb.append('}');
    return sb.toString();
  }
}
