package epam.doroshko.firsttask.entity;

import epam.doroshko.firsttask.exception.CustomArrayException;

import java.util.Arrays;

public class CustomArray {
  private int[] array;

  public CustomArray(int... array) {
    this.array = array;
  }

  public int[] getArray() {
    return array.clone();
  }

  public void setArray(int[] array) {
    this.array = array;
  }

  public int getLength() {
    return array.length;
  }

  public int getElement(int i) throws CustomArrayException {
    if (i < 0 || i >= getLength())
      throw new CustomArrayException("Index " + i + " is out of bounds [0;" + (getLength() - 1) + "]");
    return array[i];
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("CustomArray{" +
            "array=");
    sb.append(Arrays.toString(array));
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomArray array1 = (CustomArray) o;
    return Arrays.equals(array, array1.array);
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(array);
  }
}
