package com.microsoft.algorithm.combinatorics;

import java.util.Arrays;

public class MaxSumProblem {
	
	/**
	 * Returns the max sub array of the given array.
	 * @param array
	 * @return
	 */
	public int[] maxSum(int[] array) {
		if (array.length < 1) throw new IllegalArgumentException("Array must have at least one element.");
		
		int maxSum = Integer.MIN_VALUE;
		int currSum = 0;
		int start = 0;
		int mStart = 0;
		int mEnd = 0;
		
		for (int i = 0; i < array.length; i++) {
			currSum += array[i];
			if (currSum > maxSum) {
				maxSum = currSum;
				mStart = start;
				mEnd = i;
			}
			
			if (currSum < 0) {
				currSum = 0;
				start = i+1;
			}
		}
		
		return Arrays.copyOfRange(array, mStart, mEnd+1);
	}
}
