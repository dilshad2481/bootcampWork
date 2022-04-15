package com.careerit.sl.core.di.javaconfig;

import org.springframework.stereotype.Component;


public class Bike extends Game{

	@Override
	public void play() {
		System.out.println("You are playing " + this.getClass().getSimpleName() + "game, Please wear helmet...");
		
	}
	
}
