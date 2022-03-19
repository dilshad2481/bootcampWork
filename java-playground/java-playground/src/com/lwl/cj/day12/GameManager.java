package com.lwl.cj.day12;

abstract class Game{
	int x = 100;
	public void start() {
		System.out.println(this.getClass().getSimpleName()+" is going start");
	}
	public abstract void play(); 
	public void stop() {
		System.out.println(this.getClass().getSimpleName()+" is going to stop");
	}
	
	
}

class Bike extends Game{
	int x = 999;
	public void play() {
		System.out.println("You are plalying " + this.getClass().getSimpleName() + ", Please wear helement");
	}
	public void showInfo() {
		System.out.println("Description about Bike ");
	}
}

abstract class One{
	abstract void m1();
	abstract void m2();
	abstract void m3();
}

abstract class Two extends One{
	@Override
	void m1() {
		
	}


}

class Three extends Two{

	@Override
	void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void m3() {
		// TODO Auto-generated method stub
		
	}
	
}

abstract class Four{
	public void m4() {
		
	}
}
//Dynamic ploymorphism applies to methods, not with variables
//E.g. g.x will get x from Game class so output is 100
//E.g. g.play() will print from bike class
//E.g. g.showInfo() doesnt work

public class GameManager {
	public static void main(String[] args) {
		Game g = new Bike();
		Bike b = new Bike();
		b.showInfo();
		g.play();
		System.out.println(g.x);
	}
}
