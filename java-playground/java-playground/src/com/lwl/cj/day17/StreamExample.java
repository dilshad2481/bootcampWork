package com.lwl.cj.day17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
class Product {//implements Comparable<Product>
	String name;
	double price;
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	//implementing compareTo isn't the best way
//	@Override
//	public int compareTo(Product o) {
//		// TODO Auto-generated method stub
//		int res = o.name.compareTo(this.name);
//		if(res == 0) {
//			res = Double.valueOf(o.price).compareTo(Double.valueOf(this.price));
//		}
//		return res;
//	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}

class DescPrice implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return Double.valueOf(o2.price).compareTo(Double.valueOf(o1.price));
	}
	
}

class DescName implements Comparator<Product>{
	@Override
	public int compare(Product o1, Product o2) {
		return Double.valueOf(o2.price).compareTo(Double.valueOf(o1.price));
	}
}
public class StreamExample {
	public static void main(String[] args) {
		
		List<Product> plist = new ArrayList<>();
		plist.add(new Product("Leanovo", 35000));
		plist.add(new Product("Leanovo", 45000));
		plist.add(new Product("Sony", 35000));
		plist.add(new Product("Dell", 65000));

		//Collections.sort(plist);
		//Collections.sort(plist,new DescPrice());
		//Since collections is interface we don't need to write so much code
		//Shorter version:
		Collections.sort(plist,(p1,p2)->p1.name.compareTo(p2.name));
		//In java 8 they went one step forward
		//Just tell how you want to sort
		plist.sort(Comparator.comparing(Product::getPrice).reversed());
		System.out.println(plist);
		
		
		//
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(4);
		list.add(6);
		list.add(9);
		list.add(2);
		
		//Get the numbers which are divisible by 2 but not with 4
		List<Integer> flist = new ArrayList<Integer>();
		for(Integer i: list) {
			if(i % 2 == 0 && i % 4 != 0) {
				flist.add(i);
			}
		}
		System.out.println(flist);		
		
		//With Streams = filter = only pass if condition is met
		System.out.println(list.stream()
				.filter(e -> e % 2 == 0)
				.collect(Collectors.toList()));
		
		//Using map = apply change to each element
		List<Integer> dlist = new ArrayList<Integer>();
		for(Integer ele:list) {
			ele *= ele;
			dlist.add(ele);
		}
		dlist = list.stream()
					.map(e -> e*e)
					.collect(Collectors.toList());
		System.out.println(dlist);
		
		List<String> namesList = new ArrayList<String>();
		namesList.add("Charan");
		namesList.add("Dhatri");
		namesList.add("Tanvi");
		namesList.add("Aadhaya");
		namesList.add("Ramesh");
		
		List<Integer> lengthList = namesList.stream()
									.map(x -> x.length())
									.collect(Collectors.toList());
		
		//Get length of names start with A and length should be more than 5 characters
		namesList.stream().filter(e->e.startsWith("A"))//Get names starting with A
							.map(e -> e.length())		//Get length of names starting with A
							.filter(e -> e >=5)			//Get names with length higher than 5
							.collect(Collectors.toList());
		System.out.println(namesList);
		//Sorting using Collections
		//This will change the list
		//Collections.sort(namesList);
		System.out.println(namesList);
		
		//Another way:  use arraylist sort method
		//pass in Comparator
//		namesList.sort(new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o2.compareTo(o1);
//			}			
//		});
//		System.out.println(namesList);
		
		//shorter version of comparator
//		namesList.sort((e1,e2)->e1.compareTo(e2));
//		System.out.println(namesList);
		
		//3rd way to compare
		namesList.sort(Comparator.naturalOrder());
		System.out.println(namesList);
		namesList.sort(Comparator.reverseOrder());
		System.out.println(namesList);
		
		//Use Comparable and Comparator for sorting
	}
}
