package com.careerit.sl.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Builder;
import lombok.Data;

@Entity //Used to tell that class is entity and is mapped to database
@Data
@Builder
public class Player {
	@Id //Indicate unique column, primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pid;
	private String name;
	private String role;
	private String country;
	private double price;
	//@Column(name = "team") if name is different in database
	private String teamCode;
	@ManyToOne
	@JoinColumn(name="team_id")
	private TeamDetails teamDetails;
	
}
