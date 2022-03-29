package com.careerit.iplstat;

import java.util.List;

import com.careerit.iplstat.domain.Player;
import com.careerit.iplstat.util.CsvReaderUtilEnum;

public class Manager {
	public static void main(String[] args) {
		//IplStatServiceImpl stats = new IplStatServiceImpl();
		//stats.getPlayers("GT").stream().forEach(System.out::println);
//		stats.getPlayers("CSK", "Bowler")
//			.stream()
//			.forEach(System.out::println);
//		stats.getPlayers("GT", "Batsman", "India").stream()
//		.forEach(System.out::println);
		//System.out.println(stats.getMaxPaidPlayers());
		
		List<Player> players = CsvReaderUtilEnum.obj.loadPlayers();
		System.out.println(players);

	}
}
