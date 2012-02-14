package com.microsoft.algorithm.palindrome;

public class Palindrome {

  public boolean isPaldinrome(String input) {
    int last = 0;
    if (input.length() % 2 == 0) {
      last = input.length() / 2;
    } else {
      last = (int) Math.floor(input.length() / 2);
    }

    for (int i = 0; i < last - 1; i++ ) {
      if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
        return false;
      }
    }

    return true;
  }
}
