package com.careerit.iplstat.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.careerit.iplstat.domain.Player;
import com.careerit.iplstat.domain.Team;

public class CsvImportDb {
	public static void main(String[] args) {
		List<Team> teams = CsvReaderUtilEnum.obj.loadTeams();
		List<Player> players = CsvReaderUtilEnum.obj.loadPlayers();
		addPlayer(players);
		addTeam(teams);
	}
	private static ConnectionUtil conUtil = ConnectionUtil.obj;
	private static void addTeam(List<Team> teams) {
		String str = "INSERT INTO team(team_code,team_name VALUE(?,?);";
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = conUtil.getConnection();
			for(Team team: teams) {
				pst.getConnection().prepareStatement(str);
				pst.setString(1, team.getTeamCode());
				pst.setString(2, team.getTeamName());
				pst.executeUpdate();
			}
		}catch(Exception e) {
			System.out.println("While connecting with db: " + e);
		}finally {
			conUtil.close(pst, con);
		}
	}
	
private static void addPlayer(List<Player> players) {
		
		String str = "insert into player(name,role,price,country,team) values(?,?,?,?,?);";
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = conUtil.getConnection();
			for(Player player : players) {
				pst = con.prepareStatement(str);
				pst.setString(1, player.getName());
				pst.setString(2, player.getRole().name());
				pst.setFloat(3, (float)player.getPrice());
				pst.setString(4, player.getCountry());
				pst.setString(5, player.getTeam());
				pst.executeUpdate();
			}
		} catch (Exception e) {
			System.out.println("While connecting with db :" + e);
		} finally {
			conUtil.close(pst, con);
		}
	}
}
