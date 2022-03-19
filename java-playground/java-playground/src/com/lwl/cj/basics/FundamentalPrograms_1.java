package com.lwl.cj.basics;

public class FundamentalPrograms_1 {
	
	public int addNumbers(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public int substractNumbers(int a, int b) {
		
		return a - b;
	}

	public float average(int a, int b, int c) {
		return ((float) a + b + c) / 3;
	}

	public String swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		return a + " and " + b; // don't change this return statement

	}

	public float simpleInterest(float p, float t, float r) {
		return (p * r * t) / 100;
	}
}
