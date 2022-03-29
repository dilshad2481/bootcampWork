package com.careerit.pilstat.service;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.careerit.iplstat.domain.Player;
import com.careerit.iplstat.domain.PlayerRole;
import com.careerit.iplstat.dto.RoleAmountDTO;
import com.careerit.iplstat.util.CsvReaderUtil;
import com.careerit.iplstat.util.CsvReaderUtilEnum;

public class IplStatServiceImpl implements IplStatService{
	
	CsvReaderUtilEnum readerUtil = CsvReaderUtilEnum.obj;
	
	private List<Player> playersList;
	public IplStatServiceImpl() {
		//this.playersList = CsvReaderUtil.getPlayers();
		this.playersList = readerUtil.loadPlayers();
		System.out.println(this.playersList);
	}
	/*
	 * Create predicate of string type to check if
	 * each team from list matches the passed teamName */
	@Override
	public List<Player> getPlayers(String teamName) {	
		Predicate<String> predicate = listTeamName -> listTeamName.equals(teamName);
		return this.playersList.stream()
				.filter(eachPlayer -> predicate.test(eachPlayer.getTeam()))
				.toList();
	}

	//Use BiPredicate to check teamName and role of each player
	// or use getPlayerS(String teamName) and more parameters to filter
	@Override
	public List<Player> getPlayers(String teamName, String role) {
//		BiPredicate<String,String> predicate = (playerTeam, playerRole) -> (playerTeam.equals(teamName))
//				&& (playerRole.equals(role));
//		return playersList.stream()
//					.filter(eachPlayer -> predicate.test(eachPlayer.getTeam(), eachPlayer.getRole()))
//					.toList();
		return getPlayers(teamName).stream()
				.filter(eachPlayer -> (eachPlayer.getRole().equals(role)))
				.toList();
	}

	@Override
	public List<Player> getPlayers(String teamName, String role, String country) {
		return this.getPlayers(teamName, role).stream()
				.filter(eachPlayer -> (eachPlayer.getCountry().equals(country)))
				.toList();
	}
	
	//Get max paid player of a team
	//Find max paid value of a team
	//Use max paid value to filter out the team players
	@Override
	public List<Player> getMaxPaidPlayers(String teamName) {
		double maxPaidForTeam = this.getPlayers(teamName).stream()
									.mapToDouble(eachPlayer -> eachPlayer.getPrice())
									.max().getAsDouble();
		return this.getPlayers(teamName).stream()
				.filter(eachPlayer -> eachPlayer.getPrice() == maxPaidForTeam)
				.collect(Collectors.toList());
	}
	
	
	@Override
	public List<Player> getMaxPaidPlayers(String teamName, String role) {
		double maxPaidForTeam = this.getPlayers(teamName, role).stream()
									.mapToDouble(eachPlayer -> eachPlayer.getPrice())
									.max().getAsDouble();
		return this.getPlayers(teamName).stream()
				.filter(eachPlayer -> eachPlayer.getPrice() == maxPaidForTeam)
				.collect(Collectors.toList());
	}
	//Instead of using same code for all method, could make one method and get answers for these
	@Override
	public List<Player> getMaxPaidPlayers() {
		double maxPaidForTeam = this.playersList.stream()
				.mapToDouble(eachPlayer -> eachPlayer.getPrice())
				.max().getAsDouble();
		return this.playersList.stream()
		.filter(eachPlayer -> eachPlayer.getPrice() == maxPaidForTeam)
		.collect(Collectors.toList());
	}

//	@Override
//	public Map<String, Double> getAmountSpentByEachRole(String teamName) {
//		Map<String, Double> result = new HashMap<>();
//		for(Player player:playersList) {
//			PlayerRole role = player.getRole();
//			double amount = player.getPrice();
//			result.putIfAbsent(role, 0.0);
//			result.put(role, result.get(role) + amount);
//		}
//		return result;
//	}

	@Override
	public List<Player> getPlayerSortByAmount(String teamName) {		
		List<Player> players = this.getPlayers(teamName);
		players.sort(Comparator.comparing(Player::getPrice));
		return players;
	}

	@Override
	public List<Player> getAllPlayersSortByAmount() {
		playersList.sort(Comparator.comparing(Player::getPrice));
		return playersList;
	}

	@Override
	public Map<String, List<RoleAmountDTO>> getTeamRoleAmount() {
		//Map<String, List<RoleAmountDTO>> 
		return null;
	}
	@Override
	public Map<String, Double> getAmountSpentByEachRole(String teamName) {
		// TODO Auto-generated method stub
		return null;
	}

}
