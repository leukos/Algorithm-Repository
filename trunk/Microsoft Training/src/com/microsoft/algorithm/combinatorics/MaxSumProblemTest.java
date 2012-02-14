package com.microsoft.algorithm.combinatorics;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MaxSumProblemTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMaxSum() {
		MaxSumProblem max = new MaxSumProblem();
		try {
			int[] inp1 = {};
			max.maxSum(inp1);
			assertTrue(false);
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
		
		int[] inp2 = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1};
		int[] outp2 = {-1};
		assertArrayEquals(outp2, max.maxSum(inp2));
		
		int[] inp3 = {22, -22, -11, 11, 0, 0};
		int[] outp3 = {22};
		assertArrayEquals(outp3, max.maxSum(inp3));
		
		int[] inp4 = {0, 10, 20, -40, 10, 20, 30, -60};
		int[] outp4 = {10, 20, 30};
		assertArrayEquals(outp4, max.maxSum(inp4));
		
	}
}
