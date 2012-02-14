package com.microsoft.algorithm.sorting;

import java.util.Arrays;

public class MergeSort implements Sort {

  @Override
  public int[] sort(int[] array) {
    return mergeSort(array, 0, array.length - 1);
  }

  public int[] mergeSort(int[] array, int start, int end) {
    if (end - start < 2) {
      // sort the entries
      if (array[end] < array[start]) {
        int tmp = array[end];
        array[end] = array[start];
        array[start] = tmp;
      }
    } else {
      int middle = start + (end - start) / 2;
      mergeSort(array, start, middle);
      mergeSort(array, middle + 1, end);

      merge(array, start, middle, end);
    }
    return array;
  }

  public void merge(int[] array, int start, int middle, int end) {
    int[] array1 = Arrays.copyOfRange(array, start, middle + 1);
    int[] array2 = Arrays.copyOfRange(array, middle + 1, end + 1);

    // sort back into the original array
    int index1 = 0;
    int index2 = 0;
    for (int i = start; i <= end; i++ ) {

      if (index1 >= array1.length) {
        array[i] = array2[index2];
        index2++ ;
        continue;
      }
      if (index2 >= array2.length) {
        array[i] = array1[index1];
        index1++ ;
        continue;
      }

      if (array1[index1] < array2[index2]) {
        array[i] = array1[index1];
        index1++ ;
      } else {
        array[i] = array2[index2];
        index2++ ;
      }

    }
  }
}
