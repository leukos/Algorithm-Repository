package com.microsoft.algorithm.sorting;

public class QuickSort implements Sort {

  @Override
  public int[] sort(int[] array) {
    return quicksort(array, 0, array.length - 1);
  }

  public int[] quicksort(int[] array, int left, int right) {
    if (left < right) {
      int pivot = divide(array, left, right);
      quicksort(array, left, pivot - 1);
      quicksort(array, pivot + 1, right);
    }
    return array;
  }

  public int divide(int[] array, int left, int right) {
    int i = left;
    int j = right - 1;

    int pivot = array[right];

    do {
      while (array[i] <= pivot && i < right) {
        i++ ;
      }

      while (array[j] >= pivot && j > left) {
        j-- ;
      }

      if (i < j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
      }

    } while (i < j);

    if (array[i] > pivot) {
      int tmp = array[right];
      array[right] = array[i];
      array[i] = tmp;
    }

    return i;
  }
}
