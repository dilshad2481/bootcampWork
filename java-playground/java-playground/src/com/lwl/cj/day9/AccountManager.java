package com.lwl.cj.day9;

public class AccountManager {

	public static void main(String[] args) {
		Account acc1 = new Account("Raghav", 3500);
		Account acc2 = new Account("John", 5000);
		Account acc3 = new Account("Kalyan", 15000);
		Account acc4 = new Account("Charan", 55000);
		Account acc5 = new Account("Jayesh", 5000);
		
//		Account[] arr = new Account[] {acc1,acc2,acc3,acc4,acc5};
//		double totalBalance = 0;
//		for(Account acc:arr) {
//			totalBalance += acc.getBalance();
//		}
//		System.out.println(totalBalance);
		 
		acc1.showInfo();
	}

}
