package com.microsoft.algorithm.sorting;

public class BubbleSort implements Sort {

  @Override
  public int[] sort(int[] array) {
    for (int i = 0; i < array.length - 2; i++ ) {
      int value = array[i];
      for (int j = i; j < array.length - 1; j++ ) {
        if (value > array[j]) {
          int tmp = array[j];
          array[j] = value;
          array[j] = tmp;
        }
      }
    }
    return array;
  }

}
