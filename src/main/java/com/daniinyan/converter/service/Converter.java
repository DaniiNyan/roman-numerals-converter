package com.daniinyan.converter.service;

import com.daniinyan.converter.exception.ValueNotSupportedException;
import java.util.Arrays;
import java.util.List;

public class Converter {

  private final List<String> numeralsToConvertFirstDecimalPlace = Arrays.asList("I", "IV", "V", "IX", "X");
  private final List<String> numeralsToConvertTens = Arrays.asList("X", "XL", "L", "XC", "C");
  private final List<String> numeralsToConvertHundreds = Arrays.asList("C", "CD", "D", "CM", "M");

  public String toRomanNumeral(int number) {
    if (number > 3000) {
      throw new ValueNotSupportedException("Can't convert numbers greater than 3000.");
    }

    if (number < 1) {
      throw new ValueNotSupportedException("Can't convert numbers lesser than 1.");
    }

    StringBuilder result = new StringBuilder();
    int numberOfThousands = number / 1000;
    result.append(addRomanNumerals(numberOfThousands, "M"));

    int numberOfHundreds = number / 100 % 10;
    result.append(addRomanNumerals(numberOfHundreds, numeralsToConvertHundreds));

    int numberOfTens = number / 10 % 10;
    result.append(addRomanNumerals(numberOfTens, numeralsToConvertTens));

    int firstDecimalPlace = number % 10;
    if (firstDecimalPlace > 0) {
      result.append(addRomanNumerals(firstDecimalPlace, numeralsToConvertFirstDecimalPlace));
    }

    return result.toString();
  }

  private String addRomanNumerals(int number, List<String> romanNumeralsNeeded) {
    switch (number) {
      case 1:
      case 2:
      case 3:
        return addRomanNumerals(number, romanNumeralsNeeded.get(0));
      case 4:
        return romanNumeralsNeeded.get(1);
      case 5:
        return romanNumeralsNeeded.get(2);
      case 6:
      case 7:
      case 8:
        return romanNumeralsNeeded.get(2) + addRomanNumerals(number - 5, romanNumeralsNeeded.get(0));
      case 9:
        return romanNumeralsNeeded.get(3);
      default:
        return "";
    }
  }

  private String addRomanNumerals(Integer times, String letter) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < times; i++) {
      result.append(letter);
    }
    return result.toString();
  }
}
