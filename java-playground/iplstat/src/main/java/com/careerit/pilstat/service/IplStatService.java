package com.careerit.pilstat.service;

import java.util.List;
import java.util.Map;

import com.careerit.iplstat.domain.Player;
import com.careerit.iplstat.dto.RoleAmountDTO;

public interface IplStatService {
	public List<Player> getPlayers(String teamName);
	public List<Player> getPlayers(String teamName, String role);
	public List<Player> getPlayers(String teamName, String role,String country);
	
	public List<Player> getMaxPaidPlayers(String teamName);
	public List<Player> getMaxPaidPlayers(String teamName, String role);
	
	//Get max paid player(s) of all teams
	public List<Player> getMaxPaidPlayers();
	
	//How much they have spent on batsman, boller,....
	public Map<String, Double> getAmountSpentByEachRole(String teamName);
	
	//Get amount spent by each role of all teams	
	public List<Player> getPlayerSortByAmount(String name);
	
	public List<Player> getAllPlayersSortByAmount();
	public Map<String, List<RoleAmountDTO>> getTeamRoleAmount();
}
