package com.microsoft.algorithm.powerchecker;

public class PowerCheckerWhile implements PowerChecker {

  @Override
  public boolean check(int n) {
    if (n == 0 || n == 1) {
      return false;
    }

    int j = n;

    while ((j % 2) == 0) {
      j = j / 2;
    }

    if (j == 1) {
      return true;
    }

    return false;
  }
}
