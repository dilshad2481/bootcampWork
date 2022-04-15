package com.careerit.sl.core.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.careerit.sl.core"})
public class MainApplication {
	public static void main(String[] args) {
//		Game game = new Car();
//		GameService gameService = new GameServiceImp(game);
//		gameService.playGame();
		//ApplicationContext context = new ClassPathXmlApplicationContext("game-spring.xml");
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MainApplication.class);
		GameService gameService = context.getBean(GameService.class);
		gameService.playGame();
		
	}

}
