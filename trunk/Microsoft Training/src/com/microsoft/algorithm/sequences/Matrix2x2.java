package com.microsoft.algorithm.sequences;

public class Matrix2x2 {
	private int a11 = 0;
	private int a12 = 0;
	private int a21 = 0;
	private int a22 = 0;

	public Matrix2x2(int a11, int a12, int a21, int a22) {
		super();
		this.a11 = a11;
		this.a12 = a12;
		this.a21 = a21;
		this.a22 = a22;
	}

	public static Matrix2x2 multiply(Matrix2x2 a, Matrix2x2 b) {
		return new Matrix2x2(a.a11 * b.a11 + a.a12 * b.a21, a.a11 * b.a12
				+ a.a12 * b.a22, a.a21 * b.a11 + a.a22 * b.a21, a.a21 * b.a12
				+ a.a22 * b.a22);
	}

	/**
	 * @return the a11
	 */
	public int getA11() {
		return a11;
	}

	/**
	 * @return the a12
	 */
	public int getA12() {
		return a12;
	}

	/**
	 * @return the a21
	 */
	public int getA21() {
		return a21;
	}

	/**
	 * @return the a22
	 */
	public int getA22() {
		return a22;
	}
	
	
}
