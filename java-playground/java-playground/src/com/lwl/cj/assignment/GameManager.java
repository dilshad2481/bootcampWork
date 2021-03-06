package com.lwl.cj.assignment;

import java.util.concurrent.ThreadLocalRandom;

interface Game{
	public void start();
	public void play();
	public void stop();
}

abstract class AbstractGame implements Game{
	public void start() {
		
	}
	public void stop() {
		
	}
}
class Bike extends AbstractGame implements Game{

	public void play() {
		// TODO Auto-generated method stub
		
	}
	
}

class Boat extends AbstractGame implements Game{



	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	
}

class Car extends AbstractGame implements Game{
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	
}

public class GameManager {
	//Generate 10 random games and store it in an array
	//Print the count of each game
	public static void main(String[] args) {
		//System.out.println(ThreadLocalRandom.current().nextInt(1,3));
		int countBike = 0, countBoat = 0, countCar = 0;
		//System.out.println(rand);
		//Game gameChoser = getGame(rand);
		//System.out.println(gameChoser.getClass().getSimpleName());
		Game[] gamelist = new Game[10];
		for(int i = 0;i < 10;i++) {
			int rand = ThreadLocalRandom.current().nextInt(1,4);
			gamelist[i] = getGame(rand);
		}
		for(Game g:gamelist) {
			//System.out.println(g.getClass().getSimpleName());
			if(g instanceof Bike) {
				System.out.println(g.getClass().getSimpleName() + " " + (g instanceof Bike));
				countBike++;
			} else if(g instanceof Boat) {
				System.out.println(g.getClass().getSimpleName() + " " + (g instanceof Boat));

				countBoat++;
			}else if(g instanceof Car){
				System.out.println(g.getClass().getSimpleName() + " " + (g instanceof Car));

				countCar++;
			}
		}
		System.out.println("Bike: " + countBike + " Boat: " + countBoat + " Car " + countCar);
		
	}

	private static Game getGame(int choser) {
		if(choser == 1) {
			return new Bike();
		} else if(choser == 2) {
			return new Boat();
		} else if(choser == 3) {
			return new Car();
		}
		throw new IllegalArgumentException();
	}
}
