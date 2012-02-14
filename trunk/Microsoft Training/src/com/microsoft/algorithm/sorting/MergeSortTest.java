package com.microsoft.algorithm.sorting;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import org.junit.Test;

import com.microsoft.algorithm.permutations.Permuations;

public class MergeSortTest {

  @Test
  public void testSort() {
    Permuations perm = new Permuations();
    Sort sort = new MergeSort();

    /*int[] inp1 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    int[] outp1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    assertArrayEquals(outp1, sort.sort(inp1));*/

    int[] inp1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    List<int[]> permutations = perm.getPermutations(inp1);
    for (int[] elem : permutations) {
      assertArrayEquals(inp1, sort.sort(elem));
    }
  }

  @Test
  public void testMerge() {
    MergeSort sort = new MergeSort();

    int[] inp1 = {1, 3, 5, 7, 9, 11, 13, 2, 4, 6, 8, 10, 12, 14};
    int[] outp1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    sort.merge(inp1, 0, 6, 13);
    assertArrayEquals(outp1, inp1);

  }

}
