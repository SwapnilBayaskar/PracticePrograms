package com.Programs;

public class SwapTwoNumbers {
	
	public void swapTwoNumbersUsingThirdVariable() {
		
		int intFirstNumber = 10;
		int intSecondNumber = 20;
		int intTemporary;
		
		System.out.println("First Number before swapping : "+intFirstNumber);
		System.out.println("Second Number before swapping : "+intSecondNumber);
		System.out.println("\n");
		
		intTemporary = intFirstNumber;
		intFirstNumber = intSecondNumber;
		intSecondNumber = intTemporary;
		
		System.out.println("First Number after swapping : "+intFirstNumber);
		System.out.println("Second Number after swapping : "+intSecondNumber);
		System.out.println("\n");
	}
	
	public void swapTwoNumbersWithoutUsingThirdVariable() {
		
		int intFirstNumber = 30;
		int intSecondNumber = 20;
		
		System.out.println("SWAPPING WITHOUT USING THIRD VARIABLE");
		System.out.println("First Number before swapping : "+intFirstNumber);
		System.out.println("Second Number before swapping : "+intSecondNumber);
		System.out.println("\n");
		
		intFirstNumber = intFirstNumber + intSecondNumber; //30+20=50
		intSecondNumber = intFirstNumber - intSecondNumber; //50-20=30
		intFirstNumber = intFirstNumber - intSecondNumber; //50-30=20
		
		System.out.println("First Number after swapping : "+intFirstNumber);
		System.out.println("Second Number after swapping : "+intSecondNumber);
	}

}
