package com.microsoft.datastructures.queue;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ListQueueTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testListQueue() {
		ListQueue<Integer> listQueue = new ListQueue<Integer>();

		listQueue.enqueue(1);
		assertEquals(1, listQueue.size());

		listQueue.enqueue(2);
		listQueue.enqueue(3);
		listQueue.enqueue(4);
		listQueue.enqueue(5);

		assertEquals(5, listQueue.size());
		Integer[] outp1 = { 5, 4, 3, 2, 1 };
		assertArrayEquals(outp1, listQueue.toArray());
		
		assertEquals(new Integer(1), listQueue.dequeue());
		assertEquals(new Integer(2), listQueue.dequeue());
		assertEquals(new Integer(3), listQueue.dequeue());
		assertEquals(new Integer(4), listQueue.dequeue());
		assertEquals(new Integer(5), listQueue.dequeue());
		
		assertEquals(0, listQueue.size());
	}
	
	@Test
	public void testUnderflow() {
		ListQueue<Integer> listQueue = new ListQueue<Integer>();
		
		assertEquals(null, listQueue.dequeue());
	}
}
