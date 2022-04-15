package com.careerit.sl.core.di.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



public class GameServiceImpl implements GameService {
	private Game game;
	

	public GameServiceImpl(Game game) {
		super();
		this.game = game;
	}

	@Override
	public void playGame() {
		game.start();
		game.play();
		game.stop();

	}

}
