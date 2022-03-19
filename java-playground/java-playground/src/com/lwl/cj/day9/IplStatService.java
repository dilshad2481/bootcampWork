package com.lwl.cj.day9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IplStatService {
	private Player[] players;
	
	IplStatService(){
		this.players = loadPlayers();		
		
		
	}
	
	public void showPlayers(String teamName) {
		for(Player p:players) {

			if(p.getTeam().equals(teamName)) {

				p.showInfo();
			}
		}
	}
	
	public void showStats(String teamName) {
		//Max
		//Min
		//Count of players based on teamName
		
		double max = players[0].getPrice();
		double min = players[0].getPrice();
		int count = 0;
		for(Player p:players) {			
			if(p.getTeam().equals(teamName)) {
				
				count++;
				if(max < p.getPrice()) {
					max = p.getPrice();
				}
				if(min > p.getPrice()) {
					min = p.getPrice();
				}
			}
			
		}
		System.out.println("Max: " + max + " Min: " + min + " Player count : " + count + " of  team: " + teamName);
	}
	
	private boolean search(String[] arr, String key) {
		for(String a: arr) {
			if(a == key) {
				return true;
			}
		}
		return false;
	}
	
	private Set<String> teamNames() {
//		String[] arr = new String[players.length];
//		int c = 0;
//		for(Player p: players) {
//			String teamName = p.getTeam();	
//			if(!search(arr,teamName)) {
//				arr[c++] = teamName;
//			}
//		}	
		Set<String> set = new HashSet<>();
		for(Player p: players) {
			String teamName = p.getTeam();
			set.add(teamName);
		}
		
		
//		String[] temp = new String[c];
//		System.arraycopy(arr, 0, temp, 0, c);
		return set;
		
	}
	
	public void teamStat() {
		//Each team total amount, count, average
		//CSK -899999 - 22 - 400000
		
		
		double total = 0.0;
		int count = 0;
		double average = 0.0;
		
		ArrayList<String> teamNames = this.getTeamNames();
		//go through each team type and get total, count and averaage
		for(int i = 0;i < teamNames.size();i++) {//going through ["","",...]
			//get players array for each passed team name
			//for(int j = 0;j < this.getTeamCount(teamNames.get(i));j++) {//picking one team and getting players for that
			
			Player[] playersOfTeam = this.getPlayersOfTeam(teamNames.get(i));

				for(Player p: playersOfTeam) {
					total += p.getPrice();
					count++;					
				}
				average = total/count;
				System.out.println(String.format("%s-%s-%s-%s", teamNames.get(i),total,count,average));
				total = 0.0;
				count = 0;
				average = 0.0;
		}
		
	}
	//Given: array of all players
	//return: array of player of particular team
	public Player[] getPlayersOfTeam(String teamName) {
		Player[] playerOfParticularTeam = null;
		int numberOfPlayersInTeam = 0;
		//Loop to get how big the array should be for each team;
		String currentTeamName = "";
		int allPlayersLength = players.length;
		for(int i = 0;i < players.length;i++) {
			//System.out.println(players[i].getTeam());
			currentTeamName = players[i].getTeam();
			if(currentTeamName.equals(teamName)) {
				numberOfPlayersInTeam++;
			}
		}
		playerOfParticularTeam = new Player[numberOfPlayersInTeam];
		//Add those team members to this array and return
		for(int i = 0,j=0;i < allPlayersLength;i++) {
			currentTeamName = players[i].getTeam();
			if(currentTeamName.equals(teamName)) {
				playerOfParticularTeam[j] = players[i];
				j++;
			}
		}
		
		return playerOfParticularTeam;
	}
	
	public int getTeamCount(String teamName) {
		int numberOfPlayersInTeam = 0;
		//Loop to get how big the array should be for each team;
		for(int i = 0;i < players.length;i++) {
			if(players[i].getTeam().equals(teamName)) {
				numberOfPlayersInTeam++;
				
			}
		}
		return numberOfPlayersInTeam;
	}
	
	//Get names of all teams
	private ArrayList<String> getTeamNames() {
		ArrayList<String> teamNames = new ArrayList<>();
		for(Player p: players) {
			if(teamNames.indexOf(p.getTeam()) == -1) {
				teamNames.add(p.getTeam());
			}
		}		
		return teamNames;
	}
	
	public void showAllPlayers() {
		for(Player p:players) {
			p.showInfo();
		}	}
	
	private Player[] loadPlayers() {
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
		IplStatService obj = new IplStatService();
		
		//obj.teamStat();
		System.out.println(obj.teamNames());

		
	}
}
