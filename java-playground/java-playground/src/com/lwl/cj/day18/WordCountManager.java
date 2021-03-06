package com.lwl.cj.day18;

import java.util.HashMap;
import java.util.Map;

public class WordCountManager {
	public static void main(String[] args) {
		String data = "Java,Python,Java,Python,Java,.Net,MongoDB,MYSQL,Java,Java,.Net,Python";
		//Count the occurrence of each word
		String[] arr = data.split(",");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String eachWord:arr) {
			
//			if(map.get(eachWord) == null) {
//				map.put(eachWord, 1);
//			}else {
//				int val = map.get(eachWord);
//				val++;
//				map.put(eachWord, val);
//			}
			//Shortcut:
			map.putIfAbsent(eachWord, 0);
			map.put(eachWord, map.get(eachWord) + 1);
		}
		//System.out.println(map.toString());
		map.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " " + entry.getValue());
		});
	}

}
