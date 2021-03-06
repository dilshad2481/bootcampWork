package com.lwl.cj.day14;


//Marker interfaces
interface I1{
	
}

class Product implements Cloneable{
	int pid;
	String pname;
	double price;
	public Product(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	public String toString() {
		return "Product [pid= " + pid + ", pname= " + pname + " price= " + price + "]";
	}
}

interface I2{
	int biggest(int a, int b);
}
//class I2Impl implements I2{
//
//	@Override
//	public int biggest(int a, int b) {
//		return a > b ? a:b;
//	}	
//}
public class InterfaceTypesExample {
	public static void main(String[] args) throws CloneNotSupportedException {
//		Product p1 = new Product(1, "Dell XPS", 45000);
//		Product p2 = (Product) p1.clone();
//		System.out.println(p1);
//		System.out.println(p2);	
//		I2 obj = new I2() {
//			//Anonymous class that replaces I2Impl
//			@Override
//			public int biggest(int a, int b) {
//				return a > b ? a : b;
//			}
//		};
		I2 obj = (a,b) -> a > b ? a:b;
		System.out.println(obj.toString());
	}
	
	
}
