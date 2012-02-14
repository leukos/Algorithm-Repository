package com.microsoft.algorithm.palindrome;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromeTest {

  @Test
  public void testIsPaldinrome() {
    Palindrome pal = new Palindrome();

    assertEquals(true, pal.isPaldinrome("AAABBBAAA"));
    assertEquals(true, pal.isPaldinrome("AAABCCBAAA"));

    assertEquals(false, pal.isPaldinrome("ADACBBB"));
    assertEquals(false, pal.isPaldinrome("ADABBB"));
  }

}
