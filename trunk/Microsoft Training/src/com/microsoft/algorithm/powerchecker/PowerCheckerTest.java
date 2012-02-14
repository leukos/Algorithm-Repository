package com.microsoft.algorithm.powerchecker;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PowerCheckerTest {

  /**
   * Test method for {@link com.microsoft.algorithm.powerchecker.PowerChecker#check(int)}.
   */
  @Test
  public void testCheck() {
    PowerChecker checker = new PowerCheckerWhile();

    assertEquals(true, checker.check(2));
    assertEquals(true, checker.check(4));
    assertEquals(true, checker.check(8));
    assertEquals(true, checker.check(16));
    assertEquals(true, checker.check(1024));

    assertEquals(false, checker.check(0));
    assertEquals(false, checker.check(1));
    assertEquals(false, checker.check(3));
    assertEquals(false, checker.check(22));
    assertEquals(false, checker.check(31));
    assertEquals(false, checker.check(1022));
  }

  @Test
  public void testCheckComplement() {
    PowerChecker checker = new PowerCheckerComplement();

    assertEquals(true, checker.check(2));
    assertEquals(true, checker.check(4));
    assertEquals(true, checker.check(8));
    assertEquals(true, checker.check(16));
    assertEquals(true, checker.check(1024));

    assertEquals(false, checker.check(0));
    assertEquals(false, checker.check(1));
    assertEquals(false, checker.check(3));
    assertEquals(false, checker.check(22));
    assertEquals(false, checker.check(31));
    assertEquals(false, checker.check(1022));
  }

}
