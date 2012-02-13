package com.microsoft.datastructures.queue;

import java.util.LinkedList;

public class ListQueue<E> extends LinkedList<E>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Add an element at the beginning of the queue.
	 * @param elem
	 * @return 
	 */
	public boolean enqueue(E elem) {
		this.add(0, elem);
		return true;
	}
	
	/**
	 * Returns and deletes the head of the queue or null if queue is empty.
	 * @return
	 */
	public E dequeue() {
		if (this.size() == 0) return null;
		
		E elem = this.get(this.size()-1);
		this.remove(this.size()-1);
		return elem;
	}
	
}
