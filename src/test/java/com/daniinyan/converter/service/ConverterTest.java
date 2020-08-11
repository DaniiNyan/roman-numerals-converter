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
  }

  @Test(expected = ValueNotSupportedException.class)
  public void shouldThrowExceptionWhenGivenNumberGreaterThan3000() {
    converter.toRomanNumeral(3001);
  }

}
