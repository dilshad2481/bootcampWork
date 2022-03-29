package com.lwl.cj.day20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
class Player{
	private String name;
	private String role;
	private double price;
	private String country;
	private String team;
	//
	
}


public class ExceptionDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
			try {
				list = readDataFromCsv();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		System.out.println(list.size());
		List<Player> playerList = convertToPlayer(list);
		System.out.println("Total player count: " + playerList.size());
	}
	
	private static List<String> readDataFromCsv() throws IOException {
		return Files.readAllLines(Paths.get("C:\\Users\\dilshad\\Documents\\java-code\\my work\\java-playground\\java-playground\\src\\ipl_2022_data.csv"))
				.stream()
				.skip(1)//skip headers
				.collect(Collectors.toList());
	}
	
	
	private static List<Player> convertToPlayer(List<String> list){
		List<Player> playerList = new ArrayList<Player>();
		list.stream().forEach(data ->{
			//System.out.println(data);
			String[] splitData = data.split(",");
			
			String name = splitData[0];
			String role = splitData[1];
			//System.out.println(splitData[2]);
			Double price = Double.parseDouble((splitData[2] != null && !splitData[2].isEmpty() ? splitData[2] : "0"));
			String country = splitData[3];
			String team = splitData[4];
			Player p = new Player(name, role, price, country, team);
			playerList.add(p);
		});
		return playerList;
	}
	
}

//throw
//throws
//try
//catch
//finally
