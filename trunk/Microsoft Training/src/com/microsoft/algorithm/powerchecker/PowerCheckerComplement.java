package com.microsoft.algorithm.powerchecker;

public class PowerCheckerComplement implements PowerChecker {

  @Override
  public boolean check(int n) {
    if (n == 0 || n == 1) {
      return false;
    }

    if ((n & ( -n)) == n) {
      return true;
    }
    return false;
  }
}
