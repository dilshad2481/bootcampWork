package com.careerit.iplstat.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Player {
	private String name;
	//we can define player role as enum, we know the possible values
	//replacing private String role with enum PlayerRole
	//private String role;
	private PlayerRole role;
	private double price;
	private String country;
	private String team;
	public Player(PlayerBuilder pb) {
		this.name = pb.name;
		this.role = pb.role;
		this.price = pb.price;
		this.country = pb.country;
		this.team = pb.team;
	}
	public static PlayerBuilder builder() {
		return new PlayerBuilder();
	}
	public static class PlayerBuilder{
		private String name;
		private PlayerRole role;
		private double price;
		private String country;
		private String team;
		public PlayerBuilder name(String name) {
			this.name = name;
			return this;
		}
		public PlayerBuilder role(PlayerRole rol) {
			this.role = role;
			return this;
		}
		public PlayerBuilder price(double price) {
			this.price = price;
			return this;
		}
		public PlayerBuilder country(String country) {
			this.country = country;
			return this;
		}
		public PlayerBuilder team(String team) {
			this.team = team;
			return this;
		}
		public Player build() {
			return new Player(this);
		}
	
	}
	public static void main(String[] args) {
		Player player = Player.builder().name("").role(null).build();
	}
}
