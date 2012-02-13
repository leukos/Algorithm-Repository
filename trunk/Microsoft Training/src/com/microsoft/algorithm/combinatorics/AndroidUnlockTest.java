package com.microsoft.algorithm.combinatorics;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AndroidUnlockTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculate() {
		AndroidUnlock unlock = new AndroidUnlock();
		
		assertEquals(60, unlock.calculate(2, 2));
		assertEquals(470, unlock.calculate(2, 3));
		assertEquals(10296, unlock.calculate(3, 3));
		assertEquals(193912, unlock.calculate(3, 4));
		assertEquals(12029624, unlock.calculate(4, 4));
	}

}
