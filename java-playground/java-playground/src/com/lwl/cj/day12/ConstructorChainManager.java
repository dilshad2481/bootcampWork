package com.lwl.cj.day12;
class C1{
	static {
		System.out.println("Static C1");
	}
	{
		System.out.println("IIB C1");
	}
	C1(){
		System.out.println("Constructor of c1");
	}
	
}

class C2 extends C1 {
	static {
		System.out.println("Static C2");
	}
	{
		System.out.println("IIB C2");
	}
	C2(){
		System.out.println("Constructor of c2");
	}
}
public class ConstructorChainManager {
	
	
	public static void main(String[] args) {
		C1 obj1 = new C2();
		//This will print both Construcotr C1 and C2
		//Because every subclass has super() of superclass
		//So it will call C1 constructor first
		//C2 obj1 = new C2();
		

	}

}
