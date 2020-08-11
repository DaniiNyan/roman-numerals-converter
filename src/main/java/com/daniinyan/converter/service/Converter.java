package com.daniinyan.converter.service;

import com.daniinyan.converter.exception.ValueNotSupportedException;

public class Converter {

  public String toRomanNumeral(int number) {
    if (number > 3000) {
      throw new ValueNotSupportedException("Can't convert numbers greater than 3000.");
    }

    StringBuilder result = new StringBuilder();
    int numberOfThousands = number / 1000;
    result.append(addLetter(numberOfThousands, "M"));

    int numberOfHundreds = number / 100 % 10;
    result.append(addHundreds(numberOfHundreds));

    int numberOfDozens = number / 10 % 10;
    result.append(addDozens(numberOfDozens));

    int firstDozen = number % 10;
    if (firstDozen > 0) {
      result.append(addFirstDozen(firstDozen));
    }

    return result.toString();
  }

  private String addHundreds(int numberOfHundreds) {
    switch (numberOfHundreds) {
      case 1:
      case 2:
      case 3:
        return addLetter(numberOfHundreds, "C");
      case 4:
        return "CD";
      case 5:
        return "D";
      case 6:
      case 7:
      case 8:
        return "D" + addLetter(numberOfHundreds - 5, "C");
      case 9:
        return "CM";
      default:
        return "";
    }
  }

  private String addDozens(int numberOfDozens) {
    switch (numberOfDozens) {
      case 1:
      case 2:
      case 3:
        return addLetter(numberOfDozens, "X");
      case 4:
        return "XL";
      case 5:
        return "L";
      case 6:
      case 7:
      case 8:
        return "L" + addLetter(numberOfDozens - 5, "X");
      case 9:
        return "XC";
      default:
        return "";
    }
  }

  private String addFirstDozen(int number) {
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
