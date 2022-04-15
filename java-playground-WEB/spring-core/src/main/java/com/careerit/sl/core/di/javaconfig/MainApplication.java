package com.careerit.sl.core.di.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.careerit.sl.core.di.javaconfig"})
public class MainApplication {
	//Can't use anotation when using someone else class
	//so use javabased configuration
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		GameService gameService = context.getBean(GameService.class);
		gameService.playGame();
		
	}

}
