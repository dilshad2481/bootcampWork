package com.lwl.cj.day14;

interface One{
	void m1();
	default void m3() {
		m1();
	}
}

interface Two extends One{
	void m1();
	void m2();
}

interface Three extends One, Two{
	void m3();
	void m4();
}

abstract class AbstractGame{
	public abstract void start();
	public void play() {
		start();
		stop();
	}
	public abstract void stop();
}

class oneImpl implements One{
	@Override
	public void m1() {
		System.out.println("M1 method of OneImpl");
	}
}


public class InterfaceManager {
	public static void main(String[] args) {
		One obj = new oneImpl();
		obj.m3();
	}
	
}
