package com.lwl.cj.day10;

public class Product {
	private int pid;
	private String pname;
	private double price;
	private double discount;
	private String description;
	private static int count = 0;

	 {
		 System.out.println("IIBS");
		count++;
	}
	 static {
		 System.out.println("i am static block ");
	 }

	public Product(int pid, String pname, double price) {
		
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		//System.out.println("one");
	}

	public Product(int pid, String pname, double price, double discount) {
		this(pid, pname, price);
		this.discount = discount;
		//System.out.println("Two");
	}

	public Product(int pid, String pname, double price, double discount, String description) {
		this(pid, pname, price, discount);
		this.description = description;
		//System.out.println("three");
	}

	
	public static int getCount() {
		return count;
	}
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
