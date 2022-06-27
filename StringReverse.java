package com.Programs;

public class StringReverse {
	
	public void reverseOfString(String strOriginalString) {
		String strReversedString = "";
		char chStringChar;
		
		System.out.println("Original String : "+strOriginalString);
		
		for(int intCount = 0; intCount<strOriginalString.length(); intCount++) {
			chStringChar = strOriginalString.charAt(intCount);
			strReversedString = chStringChar + strReversedString;
		}
		System.out.println("Reversed String : "+strReversedString);
	}

}
