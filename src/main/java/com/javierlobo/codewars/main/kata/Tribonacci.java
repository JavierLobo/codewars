package com.javierlobo.codewars.main.kata;

import java.util.Arrays;

public class Tribonacci {
	
	private int n = 0;
	
	private double[] firm = {0, 0, 1};
	
	private double[] result;
	
	public Tribonacci() {
		this.result = this.tribonacci(this.firm, this.n);
	}
	
	public double[] tribonacci(double[] firm, int n) {
		if (n <= 0) { return new double[0]; }
		
		this.result = new double[n];		
		for (int i=0; i<n && i<firm.length; i++) { result[i] = firm[i]; }
		
		for (int i=3; i<n; i++) {
			result[i] = result[i-3]+result[i-2]+result[i-1];
		}
		
		return this.result;
	}
	
	public void printKata() {
		System.out.println("Tribonacci: n="+ this.n);
		System.out.println("    Result   -> " + Arrays.toString(this.result));
		System.out.println("    Expected -> " + Arrays.toString(this.firm));
	}

}
