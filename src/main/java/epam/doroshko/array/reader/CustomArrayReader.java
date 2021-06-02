package epam.doroshko.array.reader;

import epam.doroshko.array.exception.CustomArrayException;

public interface CustomArrayReader {
  String readCustomArrayFromFile(String path) throws CustomArrayException;
}
