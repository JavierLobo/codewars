package com.javierlobo.codewars.main.kata;

public class MatrixAddition {
	private int[][] expected;
	
	public MatrixAddition() {
		this.expected = this.matrixAddition(
				new int[][] { { 1, 2, 3 }, { 3, 2, 1 }, { 1, 1, 1 } },
				new int[][] { { 2, 2, 1 }, { 3, 2, 3 }, { 1, 1, 3 } });
	}
	
	public void printKata() {
		System.out.print("MatrixAddition: ");
	    for(int x=0; x<expected.length; x++) {
	    	System.out.print("[");
	    	for(int y=0; y<expected[0].length; y++) {
	    		System.out.print(expected[x][y]);
	    	}
	    	System.out.print("]");
	    }
		System.out.println("");	
	}
	
	public static int[][] matrixAddition(int[][] a, int[][] b) {
	    int[][] r = new int[a.length][a[0].length]; // return 

	    for(int x=0; x<a.length; x++) {
	    	for(int y=0; y<a.length; y++) {
		    	r[x][y] = a[x][y] + b[x][y];
	    	}
	    }
	    
		return r;
	}
}