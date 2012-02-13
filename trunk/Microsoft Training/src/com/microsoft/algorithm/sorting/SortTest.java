package com.microsoft.algorithm.sorting;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.microsoft.algorithm.permutations.Permuations;

public class SortTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testInsertionSort() {
		Permuations perm = new Permuations();
		Sort sort = new InsertionSort();

		int[] inp1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		List<int[]> permutations = perm.getPermutations(inp1);
		for (int[] elem : permutations) {
			assertArrayEquals(inp1, sort.sort(elem));
		}
		
	}

}
