package com.careerit.scart.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity//Use to tell spring that this class is used with database
public class Product {
	//Whenever you creating a table it must have an ID
	@Id //ID collumn
	@GeneratedValue(strategy = GenerationType.AUTO) //Auto generated value
	//We don't create, pid has to be automatically created	
	private Long pid;
	private String name;
	private String description;
	private double price;
	private boolean status;
}
