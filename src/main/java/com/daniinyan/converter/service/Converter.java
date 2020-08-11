package com.daniinyan.converter.service;

import com.daniinyan.converter.exception.ValueNotSupportedException;

public class Converter {

  public String toRomanNumeral(int number) {
    if (number > 3000) {
      throw new ValueNotSupportedException("Can't convert numbers greater than 3000.");
    }
    StringBuilder result = new StringBuilder();
    result.append(convert(number));

    return result.toString();
  }

  private String convert(int number) {
    switch (number) {
      case 1:
      case 2:
      case 3:
        return addLetter(number, "I");
      case 4:
        return "IV";
      case 5:
        return "V";
      case 6:
      case 7:
      case 8:
        return "V" + addLetter(number - 5, "I");
      case 9:
        return "IX";
      default:
        return "";
    }
  }

  private String addLetter(Integer times, String letter) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < times; i++) {
      result.append(letter);
    }
    return result.toString();
  }
}
