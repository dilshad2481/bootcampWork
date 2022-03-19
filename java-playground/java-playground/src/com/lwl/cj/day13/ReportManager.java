package com.lwl.cj.day13;

interface Greeting{
	
	void Greet();
	
}

class BirthdayGreetings implements Greeting{
	public void Greet() {
		System.out.println("Many  many happy returns of the day");
	}
}

class GenericGreetings implements Greeting{

	@Override
	public void Greet() {
		// TODO Auto-generated method stub
		System.out.println("Congratulations... ");
	}
	
}

public class ReportManager {
	public static void main(String[] args) {
		Greeting obj = new BirthdayGreetings();
		obj.Greet();
	}
	
}
