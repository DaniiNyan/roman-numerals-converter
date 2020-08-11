package com.daniinyan.converter.service;

import static org.junit.Assert.assertEquals;

import com.daniinyan.converter.exception.ValueNotSupportedException;
import org.junit.Before;
import org.junit.Test;

public class ConverterTest {

  private Converter converter;

  @Before
  public void setUp() {
    converter = new Converter();
  }

  @Test
  public void shouldConvertIntegerToRomanNumeral() {
    assertEquals("I", converter.integerToRomanNumeral(1));
    assertEquals("II", converter.integerToRomanNumeral(2));
    assertEquals("III", converter.integerToRomanNumeral(3));
    assertEquals("IV", converter.integerToRomanNumeral(4));
    assertEquals("V", converter.integerToRomanNumeral(5));
    assertEquals("VI", converter.integerToRomanNumeral(6));
    assertEquals("VII", converter.integerToRomanNumeral(7));
    assertEquals("VIII", converter.integerToRomanNumeral(8));
    assertEquals("IX", converter.integerToRomanNumeral(9));
    assertEquals("X", converter.integerToRomanNumeral(10));
    assertEquals("XIV", converter.integerToRomanNumeral(14));
    assertEquals("XV", converter.integerToRomanNumeral(15));
    assertEquals("XIX", converter.integerToRomanNumeral(19));
    assertEquals("XX", converter.integerToRomanNumeral(20));
    assertEquals("XXIV", converter.integerToRomanNumeral(24));
    assertEquals("XXV", converter.integerToRomanNumeral(25));
    assertEquals("XXXI", converter.integerToRomanNumeral(31));
    assertEquals("XLII", converter.integerToRomanNumeral(42));
    assertEquals("LIII", converter.integerToRomanNumeral(53));
    assertEquals("LXIV", converter.integerToRomanNumeral(64));
    assertEquals("LXXV", converter.integerToRomanNumeral(75));
    assertEquals("LXXXVI", converter.integerToRomanNumeral(86));
    assertEquals("XCIX", converter.integerToRomanNumeral(99));
    assertEquals("C", converter.integerToRomanNumeral(100));
    assertEquals("CCX", converter.integerToRomanNumeral(210));
    assertEquals("CCCXX", converter.integerToRomanNumeral(320));
    assertEquals("CDXXX", converter.integerToRomanNumeral(430));
    assertEquals("DXL", converter.integerToRomanNumeral(540));
    assertEquals("DCL", converter.integerToRomanNumeral(650));
    assertEquals("DCCLX", converter.integerToRomanNumeral(760));
    assertEquals("DCCCLXX", converter.integerToRomanNumeral(870));
    assertEquals("CMLXXX", converter.integerToRomanNumeral(980));
    assertEquals("MXC", converter.integerToRomanNumeral(1090));
    assertEquals("MMC", converter.integerToRomanNumeral(2100));
    assertEquals("MMDXCVII", converter.integerToRomanNumeral(2597));
    assertEquals("MMM", converter.integerToRomanNumeral(3000));
  }

  @Test
  public void shouldConvertRomanNumeralToInteger() {
    assertEquals(1, converter.romanNumeralToInteger("I"));
    assertEquals(2, converter.romanNumeralToInteger("II"));
    assertEquals(3, converter.romanNumeralToInteger("III"));
    assertEquals(4, converter.romanNumeralToInteger("IV"));
    assertEquals(5, converter.romanNumeralToInteger("V"));
    assertEquals(6, converter.romanNumeralToInteger("VI"));
    assertEquals(7, converter.romanNumeralToInteger("VII"));
    assertEquals(8, converter.romanNumeralToInteger("VIII"));
    assertEquals(9, converter.romanNumeralToInteger("IX"));
    assertEquals(10, converter.romanNumeralToInteger("X"));
  }

  @Test(expected = ValueNotSupportedException.class)
  public void shouldThrowExceptionWhenGivenNumberGreaterThan3000() {
    converter.integerToRomanNumeral(3001);
    converter.integerToRomanNumeral(0);
    converter.integerToRomanNumeral(-2);
  }

  @Test(expected = ValueNotSupportedException.class)
  public void shouldThrowExceptionWhenGivenNumberLesserThan1() {
    converter.integerToRomanNumeral(0);

  }

  @Test(expected = ValueNotSupportedException.class)
  public void shouldThrowExceptionWhenGivenNegativeNumber() {
    converter.integerToRomanNumeral(-2);
  }

}
