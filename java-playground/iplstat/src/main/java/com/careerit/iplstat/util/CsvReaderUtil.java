package com.careerit.iplstat.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


import com.careerit.iplstat.domain.Player;

public class CsvReaderUtil {
	private CsvReaderUtil() {
		
	}
	
	//Get Abs path of a file
//	String filename="ipl_2022_data.csv";
//    Path pathToFile = Paths.get(filename);
//    System.out.println(pathToFile.toAbsolutePath());
	public static List<Player> getPlayers(){
		List<Player> list = new ArrayList<Player>();
		try {
			List<String> input = Files.readAllLines(Paths.get("src\\main\\resources\\ipl_2022_data.csv"));
			for(int i = 1;i < input.size();i++) {
				String[] data = input.get(i).split(",");
				String name = data[0];
				String role = data[1];
				double price = Double.parseDouble(data[2]);
				String country = data[3];
				String team = data[4];
				//Player p = new Player(name, role,price,country,team);
				//list.add(p);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}		
		return list;
	}
}
