package com.lwl.cj.basics.day25feb;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class readDataTest {
	
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> list = new ArrayList<String>();
		String name,role, country,team;
		double  price;
		Scanner sc = null;
		
			sc = new Scanner(new File("C:\\Users\\dilshad\\Documents\\java-code\\my work\\java-playground\\java-playground\\src\\ipl_2022_data.csv"));
			
			sc.nextLine();
			while(sc.hasNext()) {
				list.add(sc.nextLine().trim());
			}
		
			for(String read:list) {
				
				String[] eachElement = read.split(",");
				
				name = eachElement[0];
				role = eachElement[1];
				price = Double.parseDouble(eachElement[2].trim());
				System.out.println((eachElement[2]));
				
				
				country = eachElement[3];
				team = eachElement[4];
				System.out.println(name + " " + role + " " + price + " ");
			}
	}

}
