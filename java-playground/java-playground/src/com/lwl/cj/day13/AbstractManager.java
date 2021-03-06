package com.lwl.cj.day13;

abstract class Three{
	abstract void m2();
}

abstract class One extends Three{
	int x = 10;
	One(int x){
		this.x = x;
		System.out.println("One");
	}
	public void m1() {
		System.out.println("M1 of One");
	}
}

class Two extends One{
	int x = 100;
	Two(){
		super(999);
	}
	public void m1() {
		System.out.println("M1 of One");
	}
	public void m2() {
		 System.out.println("M2 of Two");
	}
}

class Four extends Three{
	int x = 100;
	public void m1() {
		System.out.println("M1 of Two");
	}
	
	@Override
	void m2() {
		System.out.println("M2 of Two");
	}
}

public class AbstractManager {
	public static void main(String[] args) {
//		One one =  new Two();
//		one.m1();
//		System.out.println(one.x);
		Three obj = getInstance();
		if(obj instanceof Two) {
			Two ref = (Two) obj;
			ref.m1();
			ref.m2();
		}
		
	}
	private static One getInstance() {
		return new Two();
	}
}
