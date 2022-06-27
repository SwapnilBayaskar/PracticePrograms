package com.Programs;

public class Factorial {
	
	public void calculateFactorialOfNumber(int intNumber) {
		
		int intFactorial = 1;
		
		for(int intCount = 1; intCount<=intNumber; intCount++) {
			intFactorial = intFactorial * intCount;
		}
		
		System.out.println("Factorial of a given number : "+intFactorial);
	}
}
