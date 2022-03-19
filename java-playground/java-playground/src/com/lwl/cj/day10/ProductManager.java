package com.lwl.cj.day10;

public class ProductManager {
	public static void main(String[] args) {
		Product p1 = new Product(1001, "Lenovo Thinkpad",45000);
		Product p2 = new Product(1002,"Dell XPS",65000);
		Product p3 = new Product(1003,"Mac AirPro",1250000,5000);
		Product p4 = new Product(1004, "MacBook Pro",5000000,10000,"M1 mac pro is fast");
		System.out.println(Product.getCount());
	}
}
