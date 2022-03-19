package com.lwl.cj.day19;

import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2: ");
		int num2 = sc.nextInt();
		try {
			int res = num1 / num2;
			System.out.println("Result: " + res);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("End of main method");
		sc.close();
	}
}
