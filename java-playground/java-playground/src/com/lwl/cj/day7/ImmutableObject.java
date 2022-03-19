package com.lwl.cj.day7;

public class ImmutableObject {
	public static void main(String[] args) {
		String[] names = "Krish,Manoj,Jayesh,Suresh,Charan,Kiran".split(",");
		//better performance than string
		//As it does not create new string everytime
		//but changes the value 
		//mutable
		StringBuilder message = new StringBuilder("");
		for(String name:names) {
			message.append("Welcome " + name + "\n");
			System.out.println(message);
	}
	
	}
	public static boolean isPalindrome(String str) {
		return new StringBuilder(str).reverse().toString().equals(str);
	}
}
