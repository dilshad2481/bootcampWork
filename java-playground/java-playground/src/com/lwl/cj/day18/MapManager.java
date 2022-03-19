package com.lwl.cj.day18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BinaryOperator;
import java.util.Set;

public class MapManager {
	//To Store key and value
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Krish", 35);
		map.put("Krish", 35);
		map.put("Manoj", 38);
		map.put("Krish", 37);
		map.put("John", 35);
		map.put("Nareen", 38);
		//It won't allow duplicate elements
		//It will update key with latest value so Krish is 37
		//System.out.println(map);
		
		Set<String> keys = map.keySet();//get all keys from map
		System.out.println(keys);
		
		for(String key: keys) {
			System.out.println(key + " " + map.get(key));
		}
		
		Collection<Integer> values = map.values();
		for(Integer val: values) {
			System.out.println(val);
		}
		
		//Create set of the map containg each key and value in seperate box
		Set<Entry<String,Integer>>entrySet = map.entrySet();
		
		for(Entry<String, Integer> entry: entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		map.entrySet().forEach(e -> {
			System.out.println(e.getKey() + " " + e.getValue());
		});
		
		System.out.println(map.get("charan"));
		
		//if charan is not present add charan with age 37
		if(map.get("charan") == null) {
			map.put("charan", 37);
		}
		//shortcut java8
		map.putIfAbsent("charan", 37);
//		map.computeIfPresent("charan", new BinaryOperator<Integer>() {
//
//			@Override
//			public Integer apply(Integer t, Integer u) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			
//		});
		//if charan is present, increment age by 2 years
		if(map.get("charan") != null) {
			int val = map.get("charan");
			val += 2;
			map.put("charan", val);
		}
	}
}
