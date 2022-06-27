package com.Programs;

public class SplitString {
	
	public void splitStringExample() {
		
		String strString = "I live in Pune Maharashtra";
		
		String[] strSplitString = strString.split(" ");
		
		for(String result : strSplitString) {
			System.out.print(result+" + ");
			
		}
	}
		
}

