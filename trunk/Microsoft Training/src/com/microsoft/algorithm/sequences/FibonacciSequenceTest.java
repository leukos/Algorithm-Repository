package com.microsoft.algorithm.sequences;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class FibonacciSequenceTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFibonacciLinear() {
		FibonacciSequence fibonacci = new FibonacciSequenceLinear();
		
		try {
			fibonacci.fibonacciSequence(-1);
			assertTrue(false);
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
		
		assertEquals(0, fibonacci.fibonacciSequence(0));
		assertEquals(1, fibonacci.fibonacciSequence(1));
		assertEquals(1, fibonacci.fibonacciSequence(2));
		assertEquals(2, fibonacci.fibonacciSequence(3));
		assertEquals(3, fibonacci.fibonacciSequence(4));
		assertEquals(5, fibonacci.fibonacciSequence(5));
		assertEquals(8, fibonacci.fibonacciSequence(6));
		assertEquals(13, fibonacci.fibonacciSequence(7));
		assertEquals(21, fibonacci.fibonacciSequence(8));
		
		try {
			fibonacci.fibonacciSequence(49);
			assertTrue(false);
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	
	@Test
	public void testFibonacciRecursive() {
		FibonacciSequence fibonacci = new FibonacciSequenceRecursive();
		
		try {
			fibonacci.fibonacciSequence(-1);
			assertTrue(false);
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
		
		assertEquals(0, fibonacci.fibonacciSequence(0));
		assertEquals(1, fibonacci.fibonacciSequence(1));
		assertEquals(1, fibonacci.fibonacciSequence(2));
		assertEquals(2, fibonacci.fibonacciSequence(3));
		assertEquals(3, fibonacci.fibonacciSequence(4));
		assertEquals(5, fibonacci.fibonacciSequence(5));
		assertEquals(8, fibonacci.fibonacciSequence(6));
		assertEquals(13, fibonacci.fibonacciSequence(7));
		assertEquals(21, fibonacci.fibonacciSequence(8));
	}
	
	@Test
	public void testFibonacciLogarithmic() {
		FibonacciSequence fibonacci = new FibonacciSequenceLogarithmic();
		
		try {
			fibonacci.fibonacciSequence(-1);
			assertTrue(false);
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
		
		assertEquals(0, fibonacci.fibonacciSequence(0));
		assertEquals(1, fibonacci.fibonacciSequence(1));
		assertEquals(1, fibonacci.fibonacciSequence(2));
		assertEquals(2, fibonacci.fibonacciSequence(3));
		assertEquals(3, fibonacci.fibonacciSequence(4));
		assertEquals(5, fibonacci.fibonacciSequence(5));
		assertEquals(8, fibonacci.fibonacciSequence(6));
		assertEquals(13, fibonacci.fibonacciSequence(7));
		assertEquals(21, fibonacci.fibonacciSequence(8));
		
		try {
			fibonacci.fibonacciSequence(49);
			assertTrue(false);
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	
	
}
