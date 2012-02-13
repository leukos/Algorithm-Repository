package com.microsoft.algorithm.sequences;

public class FibonacciSequenceLogarithmic implements FibonacciSequence {
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.microsoft.algorithm.sequences.FibonacciSequence#fibonacciSequence
	 * (int)
	 */
	@Override
	public int fibonacciSequence(int n) {
		if (n < 0)
			throw new IllegalArgumentException();
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		

		Matrix2x2 m = new Matrix2x2(1, 1, 1, 0);
		
		return matrixPower(m, n-1).getA11();
	}
	
	public Matrix2x2 matrixPower(Matrix2x2 m, int n) {
		if (n == 0) return new Matrix2x2(1,0,0,1);
		if (n == 1) return m;
		if (n == 2) return Matrix2x2.multiply(m, m);
		
		Matrix2x2 matrix = null;
		if (n % 2 == 0) {
			matrix = matrixPower(m, n/2);
			return Matrix2x2.multiply(matrix, matrix);
		}
		
		matrix = matrixPower(m, (n-1)/2);
		return Matrix2x2.multiply(m, Matrix2x2.multiply(matrix, matrix));
	
	}
}
