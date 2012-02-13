package com.microsoft.algorithm.sorting;

/**
 * Insertion sort implements the sort interface using
 * and inplace insertion sort algorithms
 * @author leukos
 */
public class InsertionSort implements Sort {

	@Override
	public int[] sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int key = array[i];
			
			// take the next element insert it into the already sorted list on the left
			int j = i-1;
			while (j >= 0 && array[j] < key) {
				// switch elements
				array[j+1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
		return array;
	}

}
