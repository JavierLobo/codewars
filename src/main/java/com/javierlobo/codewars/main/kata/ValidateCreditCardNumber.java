package com.javierlobo.codewars.main.kata;

public class ValidateCreditCardNumber {
	
	private int expected = 0;
	private String  creditCardNumber;
	
	public ValidateCreditCardNumber(String number) {
		this.creditCardNumber = number;
	}
	
	public void printKata() {
		System.out.print("CreditCardNumber: "+ this.creditCardNumber);
		System.out.print(new String().concat(" [").concat((validadte(this.creditCardNumber))? "Valid]":"Not Valid]"));
	}
	
	public static boolean validadte(String number) {
		int n = 0;
		
		// Paso 1: duplicar cada dos digitos desde la derecha
		String[] numbers = number.split("");
		for(int i=numbers.length-2; i>=0; i-=2) {
			int num = Integer.parseInt(numbers[i])*2;
			if (num > 9) { num -= 9; }
			numbers[i] = String.valueOf(num);
		}
		
		// Paso 3: sumar todos los dígitos
		for(int i=0; i<numbers.length; i++) {
			n += Integer.parseInt(numbers[i]);
		}
		return ((n % 10) == 0)? true: false;
	}
}
