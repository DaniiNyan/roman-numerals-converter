package com.daniinyan.converter.service;

import com.daniinyan.converter.exception.ValueNotSupportedException;
import java.util.Scanner;

public class Menu {

  private final Converter converter = new Converter();

  public void showOptions() {
    System.out.println("========================");
    System.out.println("Available Options:");
    System.out.println("1. Convert normal number to roman numeral;");
    System.out.println("2. Convert roman numeral to normal number;");
    System.out.println("========================");
    System.out.println("Press the option you want or any other key to exit.");
  }

  public void convertIntegerToRomanNumeral(Scanner keyboard) {
    System.out.println("You selected option 1, convert normal number to roman number.");
    System.out.println("Type a normal number to be converted.");
    int number = keyboard.nextInt();

    try {
      System.out.println("Result: " + converter.integerToRomanNumeral(number));
    } catch (ValueNotSupportedException e) {
      System.out.println(e.getMessage());
    }
  }

  public void convertRomanNumeralToInteger(Scanner keyboard) {
    System.out.println("You selected option 2, convert roman numeral to normal number.");
    System.out.println("Type a roman numeral to be converted.");
    String romanNumeral = keyboard.next();

    try {
      System.out.println("Result: " + converter.romanNumeralToInteger(romanNumeral));
    } catch (ValueNotSupportedException e) {
      System.out.println(e.getMessage());
    }
  }

  public void exit() {
    System.out.println("You exited.");
    System.exit(0);
  }
}
