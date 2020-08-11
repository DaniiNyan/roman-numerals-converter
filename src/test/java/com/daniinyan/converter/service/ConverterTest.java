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
    assertEquals("MMCDXCVII", converter.integerToRomanNumeral(2497));
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
    assertEquals(14, converter.romanNumeralToInteger("XIV"));
    assertEquals(15, converter.romanNumeralToInteger("XV"));
    assertEquals(19, converter.romanNumeralToInteger("XIX"));
    assertEquals(20, converter.romanNumeralToInteger("XX"));
    assertEquals(24, converter.romanNumeralToInteger("XXIV"));
    assertEquals(25, converter.romanNumeralToInteger("XXV"));
    assertEquals(31, converter.romanNumeralToInteger("XXXI"));
    assertEquals(42, converter.romanNumeralToInteger("XLII"));
    assertEquals(53, converter.romanNumeralToInteger("LIII"));
    assertEquals(64, converter.romanNumeralToInteger("LXIV"));
    assertEquals(75, converter.romanNumeralToInteger("LXXV"));
    assertEquals(86, converter.romanNumeralToInteger("LXXXVI"));
    assertEquals(99, converter.romanNumeralToInteger("XCIX"));
    assertEquals(100, converter.romanNumeralToInteger("C"));
    assertEquals(210, converter.romanNumeralToInteger("CCX"));
    assertEquals(320, converter.romanNumeralToInteger("CCCXX"));
    assertEquals(430, converter.romanNumeralToInteger("CDXXX"));
    assertEquals(540, converter.romanNumeralToInteger("DXL"));
    assertEquals(650, converter.romanNumeralToInteger("DCL"));
    assertEquals(760, converter.romanNumeralToInteger("DCCLX"));
    assertEquals(870, converter.romanNumeralToInteger("DCCCLXX"));
    assertEquals(980, converter.romanNumeralToInteger("CMLXXX"));
    assertEquals(1090, converter.romanNumeralToInteger("MXC"));
    assertEquals(2100, converter.romanNumeralToInteger("MMC"));
    assertEquals(2497, converter.romanNumeralToInteger("MMCDXCVII"));
    assertEquals(3000, converter.romanNumeralToInteger("MMM"));
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

  @Test(expected = ValueNotSupportedException.class)
  public void shouldThrowExceptionWhenGivenInvalidRomanNumeral() {
    converter.romanNumeralToInteger("Z");
  }

  @Test(expected = ValueNotSupportedException.class)
  public void shouldThrowExceptionWhenGivenInvalidLetter() {
    converter.romanNumeralToInteger("IXZ");
  }

}
