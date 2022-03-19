package com.lwl.cj.day15;

import java.util.function.Predicate;

public class PlayerManager {

	public static void main(String[] args) {
		PlayerService pservice = new PlayerServiceImpl();
		int count = pservice.playerCount((player)->player.getRole().equals("Bowler") && player.getPrice()==2000000);
		
		System.out.println(count);
		
		double bowlerSum = pservice.totalAmount((player)->player.getRole().equals("Bowler"));
		System.out.println(bowlerSum);
		//It will only return player that meets these conditions
		
	}
}
