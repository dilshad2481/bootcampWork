package com.careerit.iplstat.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Player {
	private int pid;
	private String name;
	private PlayerRole role;
	private double price;
	private String country;
	private String team;
	
}
