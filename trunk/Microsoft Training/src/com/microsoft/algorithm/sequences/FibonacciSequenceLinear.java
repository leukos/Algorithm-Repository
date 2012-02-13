package com.microsoft.algorithm.sequences;

public class FibonacciSequenceLinear implements FibonacciSequence {
	/* (non-Javadoc)
	 * @see com.microsoft.algorithm.sequences.FibonacciSequence#fibonacciSequence(int)
	 */
	@Override
	public int fibonacciSequence(int n) {
		if (n < 0) throw new IllegalArgumentException("n must be > 0");
		if (n == 0) return 0;
		if (n == 1) return 1;
		
		int n0 = 0;
		int n1 = 1;
		int n2 = 1;
		for (int i = 2; i <= n; i++) {
			n2 = n0 + n1;
			n0 = n1;
			n1 = n2;
		}
		
		if (n2 < 0 ) throw new IllegalArgumentException("n is too large");
		
		return n2;
	}
}
