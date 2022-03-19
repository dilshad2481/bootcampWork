package com.lwl.cj.day10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class StockManager {
	public static void main(String[] args) {
		StockManager result = new StockManager();
		System.out.println(result.getSumOfActReturn());
		
	}
	public int getSumOfActReturn() {
		int sum = 0;
		Stock[] loadData = this.loadStocks();
		for(Stock s: loadData) {
			sum+= s.getActReturn();
		}		
		return sum;
	}
	
	private Stock[] loadStocks() {
		Stock[] arr = null;
		LocalDate localDate = null;
		DateTimeFormatter formatter = null;
		String text = "";
		try {
			List<String> list = Files.readAllLines(Paths.get("C:\\Users\\dilshad\\Documents\\java-code\\my work\\java-playground\\java-playground\\src\\data.csv"));
			arr = new Stock[list.size() - 1];
			int c = 0;
			for (int i = 1; i < list.size(); i++) {
				String[] data = list.get(i).split(",");
				String date = data[0];
				
				formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
				localDate = LocalDate.parse(date,formatter);
				text = localDate.format(formatter);
				String code = data[1];
				
				double price = Double.parseDouble(data[2]);
				double actReturn = Double.parseDouble(data[3]);
				arr[c++] = new Stock(localDate, code, price, actReturn);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return arr;		
	}
}
