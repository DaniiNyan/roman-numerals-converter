package com.daniinyan.converter;

import com.daniinyan.converter.service.Menu;
import java.util.Scanner;

public class Application {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Menu menu = new Menu();

    boolean wantToContinue = true;

    while (wantToContinue) {
      menu.showOptions();
      int selectedOption = keyboard.nextInt();

      switch (selectedOption) {
        case 1: {
          menu.convertIntegerToRomanNumeral(keyboard);
          break;
        }
        case 2: {
          menu.convertRomanNumeralToInteger(keyboard);
          break;
        }

        default: {
          wantToContinue = false;
          break;
        }
      }
    }
    menu.exit();
  }
}
