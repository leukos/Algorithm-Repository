package com.microsoft.datastructures.queue;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StackQueueTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testStackQueue() {
		StackQueue<Integer> stackQueue = new StackQueue<Integer>();

		stackQueue.enqueue(1);
		assertEquals(1, stackQueue.size());

		stackQueue.enqueue(2);
		stackQueue.enqueue(3);
		stackQueue.enqueue(4);
		stackQueue.enqueue(5);
		
		assertEquals(new Integer(1), stackQueue.dequeue());
		assertEquals(new Integer(2), stackQueue.dequeue());
		assertEquals(new Integer(3), stackQueue.dequeue());
		assertEquals(new Integer(4), stackQueue.dequeue());
		assertEquals(new Integer(5), stackQueue.dequeue());
		
		assertEquals(0, stackQueue.size());
	}
	
	@Test
	public void testUnderflow() {
		StackQueue<Integer> stackQueue = new StackQueue<Integer>();
		
		assertEquals(null, stackQueue.dequeue());
	}

}
