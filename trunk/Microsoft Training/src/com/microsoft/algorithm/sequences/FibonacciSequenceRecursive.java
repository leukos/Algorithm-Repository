package com.microsoft.algorithm.sequences;

public class FibonacciSequenceRecursive implements FibonacciSequence {

	@Override
	public int fibonacciSequence(int n) {
		if (n < 0) throw new IllegalArgumentException();
		
		return fibonacciSequenceRecursive(n);
	}
	
	public int fibonacciSequenceRecursive(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		
		int n2 = fibonacciSequenceRecursive(n-1) + fibonacciSequenceRecursive(n-2);
		if (n2 < 0 ) throw new IllegalArgumentException();
		return n2;
	}

}
