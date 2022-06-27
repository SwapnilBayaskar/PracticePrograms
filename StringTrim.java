package com.Programs;

public class StringTrim {
	
	public void removeSpaceFromBothEnds() {
		
		String strString = "      My Company name is VSTL   ";		
		System.out.println("String before trim : "+strString);
		
		String strNewString = strString.trim();
		System.out.println("String after trim : "+strNewString);
	}

}
