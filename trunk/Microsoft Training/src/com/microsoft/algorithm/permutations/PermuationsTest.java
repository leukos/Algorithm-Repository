package com.microsoft.algorithm.permutations;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PermuationsTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetPermutations() {
		Permuations perm = new Permuations();
		int[] inp1 = {};
		assertEquals(true, perm.getPermutations(inp1).isEmpty());
		
		int[] inp2 = {1};
		int[] out2 = {1};
		List<int[]> result2 = perm.getPermutations(inp2);
		assertArrayEquals(out2, result2.get(0));
		
		int[] inp3 = {1,2};
		int[] out31 = {1,2};
		int[] out32 = {2,1};
		List<int[]> result3 = perm.getPermutations(inp3);
		assertArrayEquals(out31, result3.get(0));
		assertArrayEquals(out32, result3.get(1));
		
		
		int[] inp4 = {1,2,3};
		int[] out41 = {1,2,3};
		int[] out42 = {2,1,3};
		int[] out43 = {3,2,1};
		int[] out44 = {1,3,2};
		int[] out45 = {2,3,1};
		int[] out46 = {3,1,2};
		
		List<int[]> result4 = perm.getPermutations(inp4);
		assertArrayEquals(out41, result4.get(0));
		assertArrayEquals(out42, result4.get(1));
		assertArrayEquals(out43, result4.get(2));
		assertArrayEquals(out44, result4.get(3));
		assertArrayEquals(out45, result4.get(4));
		assertArrayEquals(out46, result4.get(5));
		
	}

}
