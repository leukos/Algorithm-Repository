package com.microsoft.algorithm.permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permuations {
	public List<int[]> getPermutations(int[] input) {
		List<int[]> permutations = new ArrayList<int[]>();
		
		if (input.length == 0) return permutations;
		
		// the first permutation is the list itself
		permutations.add(input);
		
		for (int left = 0; left < input.length - 1; left++) {
			// how many permutations are there already
			int nPerm = permutations.size();
			
			// take the current element left and switch it with 
			// the right elements. add the new permutations to the array
			for (int right = left + 1; right < input.length; right++) {
				for (int row = 0; row < nPerm; row++) {
					// create the new permutation
					int[] newperm = Arrays.copyOf(permutations.get(row), input.length);
					// switch elements
					newperm[left] = permutations.get(row)[right];
					newperm[right] = permutations.get(row)[left];
					
					permutations.add(newperm);
				}
			}
		}
		
		
		return permutations;
	}
}
