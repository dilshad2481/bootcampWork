package com.lwl.cj.day11;

public class MathOperations {
	public int add(int a, int b) {
		return a + b;
	}
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
//	public int add(int[] arr) {
//		//logic
//		return 0;
//	}
//	public int add(int... arr) {
//		return 0;

	public int add(int a, int b, int... arr) {
		return a + b;
	}
	public float add(float a, float b) {
		return a + b;
	}
//	private double add(int x, int y) {
//		return x + y;
//	}
	public static void main(String[] args) {
		MathOperations m = new MathOperations();
		int res = m.add(1,2);
		//m.add(1);
		m.add(1,2,3,4,5,6,7);
		System.out.println(res);
	}
}
