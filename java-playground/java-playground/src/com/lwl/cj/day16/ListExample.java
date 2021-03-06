package com.lwl.cj.day16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListExample {
	public static void main(String[] args) throws IOException {
		
		//Raw arraylist and raw list type 
		//We didn't specify any type for it so it can take ANY type of elements
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1;i < 100;i++) {
			list.add(i);
		}
		//System.out.println(list.stream());
		System.out.println(list);
		
		System.out.println(list);
		
		//Add even numbers into evenList
		List<Integer> evenList = new ArrayList<Integer>();
		for(Integer ele:list) {
			if(ele % 2 == 0) {
				evenList.add(ele);
			}
		}
		System.out.println(evenList);
		
		//Add All evenList elements into new List using shortcut addAll()
		List<Integer> evenList2 = new ArrayList<Integer>();
		evenList2.addAll(evenList);
		System.out.println(evenList2);
		
		//Example 1: Integer Stream
		//takes integers 1 to 9 and for each element it prints it out
		//System.out::print => System.out
		IntStream
			.range(1, 10)
			.forEach(System.out::print);
		System.out.println();
		
		/**
		 * Example 2: Integer Stream with skip
		 * Create 1- 9 integers and skip first 5 and finally for each element
		 * pass it to parameter x and print that parameter
		 * **/
		IntStream
			.range(1,10)
			.skip(5)
			.forEach(x -> System.out.println(x));
		System.out.println();
		
		/*
		 * Integer Stream with sum 
		 */
		
		int sum = IntStream
			.range(1, 5)
			.sum();
		System.out.println(sum);
		System.out.println();
		
		/*
		 * 4. Stream.of, sorted and findFirst
		 * 
		 * */
		System.out.println(Stream.of(1,2,3,4,5).count());
		Stream.of("Ava","Aneri","Alberto")
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);
		System.out.println();
		
		/**
		 * 5. Stream from Array, sort, filter and print
		 */
		String[] names = {"Al", "Ankit","Kushal","Brent", "Sarika"};
		Arrays.stream(names)
			.filter(x -> x.startsWith("S"))
			.sorted()
			.forEach(System.out::println);
		/**
		 * 6. Average of squares of an int array
		 */
		Arrays.stream(new int[] {2,4,6,8,10})
			.map(x -> x * x)
			.average()
			.ifPresent(System.out::println);
		
		/**
		 * 7. Stream from List, filter and print
		 */
		List<String> people = Arrays.asList("Al","Ankit","Brent","sarika", "Amanda","Hans");
		people.stream().map(String::toLowerCase).filter(x -> x.startsWith("a")).forEach(System.out::println);;	
		/**
		 * 9. Stream rows from text file and save to List
		 * 
		 */
		List<String> band2 = Files.lines(Paths.get("C:\\Users\\dilshad\\Documents\\java-code\\my work\\java-playground\\java-playground\\src\\com\\lwl\\cj\\day16\\bands.txt"))
			.filter(x -> x.contains("jit"))
			.collect(Collectors.toList());
		band2.forEach(x -> System.out.println(x));
		
		
		//Back to class work
		
		Predicate<Integer> p = (ele)-> ele % 2 != 0;
		//passes list to stream which return sequence of stream
		//call filter method on that sequence of stream over elements
		//filter method accepts predicate
		//You will get Stream of objects -> You filter out based on predicate test -> put into list
		List<Integer> oddList = list.stream().filter(p).collect(Collectors.toList());
		System.out.println(list);
		System.out.println(oddList);
		
		//Different ways to print output
		list.stream().forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
		});
		
		//2nd way
		//Since Consumer is interface we can use lambda function
		list.stream().forEach((x) -> System.out.println(x));
		
		//3rd way
		//Using method reference System.out::print
		//Advantage of iterator: you can remove the elements while iterating
		//over them
		list.stream().forEach(System.out::print);
		System.out.println();
		//Another way to iterate through a list
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			Integer ele = itr.next();
			if(ele > 50) {
				itr.remove();
			}
			System.out.println(ele); 
		}
		
		//To iterate back and forward use list iterator
		ListIterator<Integer> listItr = list.listIterator();
		while(listItr.hasNext()) {
			Integer ele = listItr.next();
			System.out.print(ele);
		}
		System.out.println();
		while(listItr.hasPrevious()) {
			Integer ele = listItr.previous();
			if(ele == 49) {
				listItr.set(109);
			}
			System.out.print(ele);
		}
		System.out.println();
		//----------------------------------------------
		List<Integer> blist = IntStream.range(10, 30).boxed().collect(Collectors.toList());
		List<Integer> glist = IntStream.of(5,15,10,20,30,12,3,4,5,6,7,8,9).boxed().collect(Collectors.toList());
		System.out.println(blist);
		for(Integer ele:glist) {
			if(!blist.contains(ele)) {
				blist.add(ele);
			}
		}
		System.out.println(blist);
		Collections.sort(blist);
		System.out.println(blist);
		
		
	}
}
