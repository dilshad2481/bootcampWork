package com.lwl.cj.day13;

import java.util.Scanner;

abstract class Game{
	public abstract void play();
}

class Car extends Game{

	@Override
	public void play() {
		System.out.println("Car goes broom broomm");
		
	}
	

	
}

class Bike extends Game{

	@Override
	public void play() {
		System.out.println("Biking time");
		
	}
	public void fly() {
		System.out.println("I am flying");
	}
	
}

class Boat extends Game{

	@Override
	public void play() {
		System.out.println("Its time to play with BOAT. I AM ON A BOAT");
		
	}
	
}
public class GameManager {
	public static void main(String[] args) {
		System.out.println("---------------------1.Car 2.Bike 3.Boat-------------------------------");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		Game ref = getUserChoiceGame(ch);
		//When user select bike game ensure fly method is called
		if(ref instanceof Bike) {
			Bike b = (Bike) ref;
			b.play();
			b.fly();
		}else {
			ref.play();
		}
		
		
//		if (ref instanceof Car) {
//			Car game = (Car) ref;
//			game.play();			
//		} else if(ref instanceof Bike) {
//			Bike game = (Bike) ref;
//			game.play();
//			game.fly();
//		} else {
//			Boat game = (Boat) ref;
//			game.play();
//		}
	} 

	private static Game getUserChoiceGame(int ch) {
		if(ch == 1) {
			return new Car();
		}
		else if(ch == 2) {
			return new Bike();
		}
		else if(ch == 3) {
			return new Boat();
		}
		throw new IllegalArgumentException("Please enter only 1-3");
	}
}
