package com.javierlobo.codewars.main.kata;

public class BalancedNumber {

	private String expected;

	private int number;
	
	public BalancedNumber(int number) {
		this.number = number;
		this.expected = BalancedNumber.balancedNum(this.number);
		this.printKata();
	}
	
	public void printKata() {
		System.out.println("BalancedNumber: "+ this.number + " " + this.expected);	
	}
	
    public static String balancedNum(long number) {
    	String strNumber = String.valueOf(number);
    	int longitud = (strNumber.length()/2);
    	int sumaLadoIzq = 0; int sumaLadoDer = 0;
    	
    	if (strNumber.length()%2==0) { longitud --;}
    	
    	String[] ladoIzq = strNumber.substring(0, longitud).split("");
    	String[] ladoDer = strNumber.substring(strNumber.length() - longitud, strNumber.length()).split("");
    	
    	for (int i=0; i<longitud; i++) {
    		sumaLadoIzq += Integer.parseInt(ladoIzq[i]);
    		sumaLadoDer += Integer.parseInt(ladoDer[i]);
    	}
    	
    	if (sumaLadoIzq == sumaLadoDer) {
    		return "Balanced";
    	} else {
    		return "Not Balanced";
    	}
    }
}