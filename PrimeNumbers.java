package com.Programs;

public class PrimeNumbers {
	
	public void printPrimeNumbersFrom1toN(int intNumberCount) {
		int intCount;
		
		for(int intNumber = 2; intNumber<=intNumberCount; intNumber++) {
			
			intCount = 0;
			
			for(int intDivisible = 1; intDivisible<=intNumber; intDivisible++) {
				if(intNumber % intDivisible == 0) {
					intCount++;
				}
									
			}
			if(intCount == 2) {
				System.out.println(intNumber+" ");
			}
		}
	}

}
