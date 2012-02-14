package com.microsoft.algorithm.sorting;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import org.junit.Test;

import com.microsoft.algorithm.permutations.Permuations;

public class BubbleSortTest {

  @Test
  public void testSort() {
    Permuations perm = new Permuations();
    Sort sort = new BubbleSort();

    int[] inp1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    List<int[]> permutations = perm.getPermutations(inp1);
    for (int[] elem : permutations) {
      assertArrayEquals(inp1, sort.sort(elem));
    }
  }

}
