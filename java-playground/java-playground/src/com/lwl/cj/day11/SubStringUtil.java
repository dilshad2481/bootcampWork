package com.lwl.cj.day11;

public class SubStringUtil {
	//for given string return first N characters
	//for given string return characters in range 
	//for given string return characters from the given index
	
	//"Corejava", 3 => Cor
	//"Corejava", 1,3 => ore
	//"CoreJava", 2 => reJava
	
	public String subString(String str, int n) {
		return str.substring(0, n + 1);
	}
	
	public String subString(String str, int s, int e) {
		return null;
	}
	
	public String subStringFromGivenIndex(String str, int n) {
		return str.substring(n);
	}
	
	
}
