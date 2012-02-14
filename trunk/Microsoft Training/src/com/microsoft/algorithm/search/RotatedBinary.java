package com.microsoft.algorithm.search;

public class RotatedBinary {

  /**
   * Rotates an array by the offset in rotate.
   * 
   * @param array The array to rotate.
   * @param rotate The offset.
   * @return The rotated array.
   */
  public static int[] rotateArray(int[] array, int rotate) {
    int r = rotate % array.length;

    if (r == 0) {
      return array;
    }

    int currentElement = 0;
    int goingTo = (currentElement + r) % array.length;
    int tmp = array[currentElement];
    for (int i = 0; i < array.length; i++ ) {
      int tmp2 = array[goingTo];
      array[goingTo] = tmp;
      currentElement = goingTo;
      goingTo = (currentElement + r) % array.length;
      tmp = tmp2;
    }
    return array;
  }

  /**
   * Simple binary search algorithm.
   * 
   * @param array The sorted array.
   * @param x The element to find.
   * @return The position of the element or -1.
   */
  public static int findElement(int[] array, int x) {
    // simple binary search
    int start = 0;
    int end = array.length - 1;
    int middle = 0;

    while (start <= end) {
      middle = start + (int) Math.floor((end - start) / 2);
      if (array[middle] == x) {
        return middle;
      } else if (middle < x) {
        start = middle + 1;
      } else {
        end = middle - 1;
      }
    }

    return -1;
  }

  public static int findElementInRotated(int[] array, int x) {
    int start = 0;
    int end = array.length - 1;
    int middle = 0;

    while (start <= end) {
      middle = start + (int) Math.floor((end - start) / 2);
      if (array[middle] == x) {
        return middle;
      }
      // determine the sorted part of the array
      if (middle - 1 > 0 && array[start] <= array[middle - 1]) {
        if (array[start] <= x && array[middle - 1] >= x) {
          // this is the sorted part and x is in here
          end = middle - 1;
        } else {
          start = middle + 1;
        }

      } else if (middle + 1 < array.length - 1 && array[middle + 1] <= array[end]) {
        if (array[middle + 1] <= x && array[end] >= x) {
          // this is the sorted part and x is in here
          start = middle + 1;
        } else {
          end = middle - 1;
        }
      }
    }

    return -1;
  }
}
