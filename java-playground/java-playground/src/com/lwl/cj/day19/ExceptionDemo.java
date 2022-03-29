package com.lwl.cj.day19;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

class Player{
	private String name;
	private String role;
	private double price;
	private String country;
	private String team;
}

public class ExceptionDemo {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)){
			
			System.out.println("Enter the num1: ");
			int num1 = sc.nextInt();
			System.out.println("Enter the num2: ");
			int num2 = sc.nextInt();
			int res = num1 / num2;
			System.out.println("Result: " + res);
		//}catch(IOException e) {
			
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(NumberFormatException e) {			
		}catch(Exception e) {
			
		}
//		finally {
//			System.out.println("End of main method");
//			sc.close();
//		}
//		
	}
}
