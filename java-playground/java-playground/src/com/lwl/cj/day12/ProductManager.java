package com.lwl.cj.day12;

import java.util.Objects;

class Product{
	private int pid;
	private String name;
	private double price;
	public Product(int pid, String name, double price) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product {pid=" + pid + " , name= " + name + ", price " + price + "]";		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, pid, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && pid == other.pid
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	
	
	
}


public class ProductManager {

	public static void main(String[] args) {
		Product p1 = new Product(1001,"Dell xps studio", 45000);
		Product p2 = new Product(1001, "Dell xps studio", 45000);
		Product p3 = p1;
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println(p1 == p2);//compares the address
		System.out.println(p1.equals(p2));
		
		System.out.println(p1 == p3);//compares the address
		System.out.println(p2.equals(p3));
		
		
//		String s1 = new String("Rajesh");
//		String s2 = new String("Rajesh");
//		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));
	}

}
