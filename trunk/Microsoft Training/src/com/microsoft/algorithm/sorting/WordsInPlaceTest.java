package com.microsoft.algorithm.sorting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WordsInPlaceTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSortInPlace() {
		assertEquals("eHllo dlorW" ,WordsInPlace.sortInPlace("Hello World"));
		assertEquals("eHllo dlorW AFKS" ,WordsInPlace.sortInPlace("Hello World ASKF"));
	}

}
