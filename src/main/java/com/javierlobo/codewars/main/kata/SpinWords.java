package com.javierlobo.codewars.main.kata;

public class SpinWords {
	private String expected = "";
	private String spinWords ="Hey fellow warriors";
	
	public SpinWords() {
		this.expected = this.SpinWords(this.spinWords);
	}
	
	public void printKata() {
		System.out.println("SpinWords: "+ this.spinWords +" ["+ this.expected +"]");	
	}
	
	public String SpinWords(String sentence) {
		String[] newSentence = sentence.split(" ");
		for(int i=0;i<newSentence.length; i++) {
			if (newSentence[i].length()>=5) {
				newSentence[i] = new StringBuilder(newSentence[i]).reverse().toString();
			}
			this.expected = this.expected.concat(" ").concat(newSentence[i]).trim();
		}
		return this.expected;
	}
}
