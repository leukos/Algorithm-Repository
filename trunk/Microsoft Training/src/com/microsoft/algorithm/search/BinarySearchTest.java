package com.microsoft.algorithm.search;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSearch() {
		BinarySearch search = new BinarySearch();

		int[] in1 = { 1, 2, 3, 4, 5 };
		assertEquals(0, search.search(in1, 1));
		assertEquals(1, search.search(in1, 2));
		assertEquals(2, search.search(in1, 3));
		assertEquals(3, search.search(in1, 4));
		assertEquals(4, search.search(in1, 5));

		int[] in2 = { 10, 14, 892, 1982, 3929, 344334, 32423432, 99099833,
				834734190 };
		assertEquals(2, search.search(in2, 892));
		
		int[] in3 = {};
		assertEquals(-1, search.search(in3, 4));
		
		int[] in4 = {1,2,3,4,5};
		assertEquals(-1, search.search(in4, 6));
		
	}

	@Test
	public void testSearchFirstOcc() {
		BinarySearch search = new BinarySearch();

		int[] in1 = { 1, 2, 3, 4, 5 };
		assertEquals(0, search.searchFirstOcc(in1, 1));
		assertEquals(1, search.searchFirstOcc(in1, 2));
		assertEquals(2, search.searchFirstOcc(in1, 3));
		assertEquals(3, search.searchFirstOcc(in1, 4));
		assertEquals(4, search.searchFirstOcc(in1, 5));

		int[] in2 = { 10, 14, 892, 1982, 3929, 344334, 32423432, 99099833,
				834734190 };
		assertEquals(2, search.searchFirstOcc(in2, 892));
		
		int[] in3 = { 1, 1, 2, 3, 4, 4, 4, 5, 6, 6, 6, 6, 7};
		assertEquals(0, search.searchFirstOcc(in3, 1));
		assertEquals(2, search.searchFirstOcc(in3, 2));
		assertEquals(3, search.searchFirstOcc(in3, 3));
		assertEquals(4, search.searchFirstOcc(in3, 4));
		assertEquals(7, search.searchFirstOcc(in3, 5));
	}
	
	@Test
	public void testSearchElemLargerK() {
		BinarySearch search = new BinarySearch();

		int[] in1 = { 1, 2, 3, 4, 5 };
		assertEquals(1, search.searchElemLargerK(in1, 1));
		assertEquals(2, search.searchElemLargerK(in1, 2));
		assertEquals(3, search.searchElemLargerK(in1, 3));
		assertEquals(4, search.searchElemLargerK(in1, 4));
		assertEquals(-1, search.searchElemLargerK(in1, 5));
		
		int[] in2 = { 10, 14, 892, 1982, 3929, 344334, 32423432, 99099833,
				834734190 };
		assertEquals(3, search.searchElemLargerK(in2, 892));
	}

}
