package com.lwl.cj.day18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lwl.cj.day9.Player;

public class MapIplExample {
	
	private static Player[] loadPlayers() {
		Player[] arr = null;
		try {
			List<String> list = Files.readAllLines(Paths.get("C:\\Users\\dilshad\\Documents\\java-code\\my work\\java-playground\\java-playground\\src\\ipl_2022_data.csv"));
			arr = new Player[list.size() - 1];
			int c = 0;
			for (int i = 1; i < list.size(); i++) {
				String[] data = list.get(i).split(",");
				String name = data[0];
				String role = data[1];
				double price = Double.parseDouble(data[2]);
				String country = data[3];
				String team = data[4];
				arr[c++] = new Player(name, role, price, country, team);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Player[] arr = loadPlayers();
		Map<String, List<Player>> map = new HashMap<>();
		for(Player eachPlayer: arr) {
			String teamName = eachPlayer.getTeam();
			map.putIfAbsent(teamName, new ArrayList<Player>());
			List<Player> list = map.get(teamName);
			list.add(eachPlayer);
			map.put(teamName, list);
		}
		
		//Display team name and player count
		map.entrySet().forEach(eachPlayer -> {
			System.out.println(eachPlayer.getKey() + " " + eachPlayer.getValue().size());
		});
		
		//Display total amount spent by each team
		map.entrySet().forEach(player -> {
			String teamName = player.getKey();
			double sum = player.getValue().stream().mapToDouble(p->p.getPrice()).sum();
			System.out.println(teamName + " Rs. " + NumberFormat.getInstance().format(sum));
		});
		
		//Get total amount spent by all the teams
		//map.values().stream().flatMap(ele -> ele.stream().flatMapToDouble(p -> p.getPrice()).sum());
	}
}
