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
  public void shouldConvertToRomanNumeral() {
    assertEquals("I", converter.toRomanNumeral(1));
    assertEquals("II", converter.toRomanNumeral(2));
    assertEquals("III", converter.toRomanNumeral(3));
    assertEquals("IV", converter.toRomanNumeral(4));
    assertEquals("V", converter.toRomanNumeral(5));
    assertEquals("VI", converter.toRomanNumeral(6));
    assertEquals("VII", converter.toRomanNumeral(7));
    assertEquals("VIII", converter.toRomanNumeral(8));
    assertEquals("IX", converter.toRomanNumeral(9));
    assertEquals("X", converter.toRomanNumeral(10));
    assertEquals("XIV", converter.toRomanNumeral(14));
    assertEquals("XV", converter.toRomanNumeral(15));
    assertEquals("XIX", converter.toRomanNumeral(19));
    assertEquals("XX", converter.toRomanNumeral(20));
    assertEquals("XXIV", converter.toRomanNumeral(24));
    assertEquals("XXV", converter.toRomanNumeral(25));
    assertEquals("XXXI", converter.toRomanNumeral(31));
    assertEquals("XLII", converter.toRomanNumeral(42));
    assertEquals("LIII", converter.toRomanNumeral(53));
    assertEquals("LXIV", converter.toRomanNumeral(64));
    assertEquals("LXXV", converter.toRomanNumeral(75));
    assertEquals("LXXXVI", converter.toRomanNumeral(86));
    assertEquals("XCIX", converter.toRomanNumeral(99));
    assertEquals("C", converter.toRomanNumeral(100));
    assertEquals("CCX", converter.toRomanNumeral(210));
    assertEquals("CCCXX", converter.toRomanNumeral(320));
    assertEquals("CDXXX", converter.toRomanNumeral(430));
    assertEquals("DXL", converter.toRomanNumeral(540));
    assertEquals("DCL", converter.toRomanNumeral(650));
    assertEquals("DCCLX", converter.toRomanNumeral(760));
    assertEquals("DCCCLXX", converter.toRomanNumeral(870));
    assertEquals("CMLXXX", converter.toRomanNumeral(980));
    assertEquals("MXC", converter.toRomanNumeral(1090));
    assertEquals("MMC", converter.toRomanNumeral(2100));
    assertEquals("MMDXCVII", converter.toRomanNumeral(2597));
    assertEquals("MMM", converter.toRomanNumeral(3000));
  }

  @Test(expected = ValueNotSupportedException.class)
  public void shouldThrowExceptionWhenGivenNumberGreaterThan3000() {
    converter.toRomanNumeral(3001);
    converter.toRomanNumeral(0);
    converter.toRomanNumeral(-2);
  }

  @Test(expected = ValueNotSupportedException.class)
  public void shouldThrowExceptionWhenGivenNumberLesserThan1() {
    converter.toRomanNumeral(0);

  }

  @Test(expected = ValueNotSupportedException.class)
  public void shouldThrowExceptionWhenGivenNegativeNumber() {
    converter.toRomanNumeral(-2);
  }

}
