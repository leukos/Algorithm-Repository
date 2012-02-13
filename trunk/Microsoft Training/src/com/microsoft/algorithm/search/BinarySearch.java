package com.microsoft.algorithm.search;

public class BinarySearch {
	
	/**
	 * Searches in a sorted array for elem.
	 * @param array A sorted array of integer.
	 * @param elem The elem to search.
	 * @return The array pos of elem.
	 */
	public int search(int[] array, int elem) {
		int start = 0;
		int end = array.length-1;
		
		while(start<=end){
			// calculate middle
			int middle = start + (int) Math.floor((end - start) / 2);

			if (array[middle] == elem) return middle;
			else if (array[middle] < elem) start = middle+1;
			else end = middle-1;
		}
		
		return -1;
	}
	
	/**
	 * Searches for the first appearance of an int elem.
	 * @param array A sorted array of integers.
	 * @param elem The elem to search.
	 * @return The array pos of the first appearance.
	 */
	public int searchFirstOcc(int[] array, int elem) {
		int start = 0;
		int end = array.length-1;
		
		while(start<=end){
			// calculate middle
			int middle = start + (int) Math.floor((end - start) / 2);

			if (array[middle] == elem) {
				if (middle == 0) return middle;
				while (array[middle-1] == elem)	
					middle--;
				return middle;
				
			}
			else if (array[middle] < elem) start = middle+1;
			else end = middle-1;
		}
		
		return -1;
	}
	
	/**
	 * Searches for the first element in array that is larger than k.
	 * @param array An sorted array of integers.
	 * @param k The threshold value.
	 * @return The position of the found element.
	 */
	public int searchElemLargerK(int[] array, int k) {
		int start = 0;
		int end = array.length-1;
		int middle = 0;
		while(start<=end){
			// calculate middle
			middle = start + (int) Math.floor((end - start) / 2);

			if (array[middle] == k) {
				if (middle < array.length-1) return middle+1;
				else return -1;
			}
			else if (array[middle] < k) start = middle+1;
			else end = middle-1;
		}
		if (middle < array.length-1) return middle+1;		
		
		return -1;
	}
}
