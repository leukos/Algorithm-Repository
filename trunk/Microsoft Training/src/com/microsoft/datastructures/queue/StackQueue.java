package com.microsoft.datastructures.queue;

import java.util.Stack;

/**
 * This queue uses two stacks to implement the queue data structure.
 * 
 * @author leukos
 */
public class StackQueue<E> {
	private Stack<E> stack1 = new Stack<E>();
	private Stack<E> stack2 = new Stack<E>();

	public void enqueue(E elem) {
		stack1.push(elem);
	}

	public E dequeue() {
		if (stack2.size() == 0) {
			while (stack1.size() > 0) {
				stack2.push(stack1.pop());
			}
		}
		
		if (stack2.isEmpty()) return null;
		
		return stack2.pop();
	}

	public int size() {
		return stack1.size();
	}
}
