package com.microsoft.algorithm.search;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RotatedBinaryTest {

  @Test
  public void testRotateArray() {
    int[] inp3 = {1, 2, 3, 4, 5};
    int[] outp3 = {1, 2, 3, 4, 5};
    assertArrayEquals(RotatedBinary.rotateArray(inp3, 0), outp3);
    assertArrayEquals(RotatedBinary.rotateArray(inp3, 5), outp3);

    int[] inp1 = {1, 2, 3, 4, 5};
    int[] outp1 = {3, 4, 5, 1, 2};
    assertArrayEquals(RotatedBinary.rotateArray(inp1, 3), outp1);

    int[] inp2 = {40, 45, 71, 202};
    int[] outp2 = {202, 40, 45, 71};
    assertArrayEquals(RotatedBinary.rotateArray(inp2, 1), outp2);
  }

  @Test
  public void testFindElement() {
    int[] inp1 = {1, 2, 3, 4, 5};
    assertEquals(0, RotatedBinary.findElement(inp1, 1));
    assertEquals(1, RotatedBinary.findElement(inp1, 2));
    assertEquals(2, RotatedBinary.findElement(inp1, 3));
    assertEquals(3, RotatedBinary.findElement(inp1, 4));
    assertEquals(4, RotatedBinary.findElement(inp1, 5));

    assertEquals( -1, RotatedBinary.findElement(inp1, 3423));
  }

  @Test
  public void testFindElementInRotated() {
    int[] inp1 = {1, 2, 3, 4, 5};
    //inp1 = RotatedBinary.rotateArray(inp1, 0);
    assertEquals(0, RotatedBinary.findElementInRotated(inp1, 1));
    assertEquals(1, RotatedBinary.findElementInRotated(inp1, 2));
    assertEquals(2, RotatedBinary.findElementInRotated(inp1, 3));
    assertEquals(3, RotatedBinary.findElementInRotated(inp1, 4));
    assertEquals(4, RotatedBinary.findElementInRotated(inp1, 5));

    assertEquals( -1, RotatedBinary.findElementInRotated(inp1, 3423));
  }
}
