package com.javierlobo.codewars.main;

import com.javierlobo.codewars.main.kata.BalancedNumber;
import com.javierlobo.codewars.main.kata.MatrixAddition;

public class Main {
	public static void main(String[] args) {
		// Matrix Addition 
		MatrixAddition ma = new MatrixAddition();
		ma.printKata();

		// Balance Number
		BalancedNumber bn1 = new BalancedNumber(7);
		BalancedNumber bn2 = new BalancedNumber(999);
		BalancedNumber bn3 = new BalancedNumber(13);

		BalancedNumber bn8 = new BalancedNumber(295591);
		BalancedNumber bn9 = new BalancedNumber(1230987);
		BalancedNumber bn10 = new BalancedNumber(56239814);
		
	}
}
