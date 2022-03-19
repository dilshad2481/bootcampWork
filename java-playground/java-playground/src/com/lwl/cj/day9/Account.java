package com.lwl.cj.day9;
import com.lwl.cj.day9.MaskUtil;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * private:
 * public:
 * protected: 
 * (default):
 */




public class Account {
	//These fields are state of the object
	private String name;
	private double balance;
	private String accNumber;
	
	
	public Account(String name, double balance) {
		this.accNumber = MaskUtil.newAccountNumber();
		this.name = name;
		this.setBalance(balance);
	}
	
	void showInfo() {
		System.out.println("Acc    :" + MaskUtil.maskAccountNumber(accNumber));
		System.out.println("Name   :" + name);
		System.out.println("Balance :" + getBalance());
	}
	void setValues(String name, int balance, String accNumber) {
		this.setBalance(balance);
		this.name = name;
		this.accNumber = accNumber;
	}
	void deposit(double amount) {
		this.setBalance(this.getBalance() + amount);
		System.out.println("Balance on account is: " + this.getBalance() + " on date of " + LocalDate.now());
	}
	//Methods maintain state
	public void withDraw(double amount) {
		if(this.getBalance() >= amount) {
			this.setBalance(this.getBalance() - amount);
		}else {
			System.out.println("You out of money boy.");
		}
		
	}
	
	public int showBalance() {
		return 0;
	}
	
	public String miniStatement() {
		return null;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
