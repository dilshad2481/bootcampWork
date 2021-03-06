package com.lwl.cj.day18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

class Student{
	long id;
	String name;
	int score;
	public Student(long id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
	}
	@Override
	public int hashCode() {
		System.out.println("HashCode method is invoked");
		return Objects.hash(id, name, score);
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Equals method is invoked" + obj);
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name) && score == other.score;
	}
	
	
	
}

public class SetManager {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(1001);
		set.add(1002);
		set.add(1003);
		set.add(1004);
		set.add(1005);
		set.add(1006);
		set.add(null);
		set.add(null);
		System.out.println(set);
		
//		for(Integer i:set) {
//			System.out.println(i.hashCode());
//		}
		set.forEach(System.out::println);
		
		
		//Student set
		//Even though the values are same, set still
		//added them. So we check hasCode for each]
		
		Set<Student> set1 = new HashSet<Student>();
		set1.add(new Student(1001, "Krish",9));
		set1.add(new Student(1002, "Manoj",9));
		set1.add(new Student(1001, "Krish",9));
		set1.add(new Student(1002, "Manoj",9));
		set1.add(new Student(1003, "Sai",7));
		System.out.println(set1.size());
		
		//Each hashcode is different 
		//so how do we fix it? We want student be considered
		// duplicate if id, score and name are same
		//For that we must OVERRIDE hascode method for student class
		//We also have to override equal method
//		for(Student s:set1) {
//			System.out.println(s.hashCode());
//		}
		
		List<String> cs = Arrays.asList("PKM", "CSV", "ALN", "GLN");
		List<String> is = Arrays.asList("PVN", "CSV", "ALN", "GLN","ABC","XYZ");
		List<String> ec = Arrays.asList("KVR", "CSV", "GVR", "GLN","ALN","DON","BON","KON");

		//Get people who are working all three departments
		List<String> shortList = cs.size() <  is.size()  && cs.size() < ec.size() ? cs : is.size() < ec.size() ? is : ec;
				
		System.out.println(shortList);
		
		Set<String>uset = new HashSet<String>();
		for(String name: shortList) {
			if(is.contains(name) && cs.contains(name)) {
				uset.add(name);
			}
		}
		System.out.println(uset);
				
		//Add all elements from all 3 dept to set
		//Set will store unique elements
		//Check which elements are in all 3 dept
		Set<String> unames = new HashSet<String>();
		unames.addAll(is);
		unames.addAll(ec);
		unames.addAll(cs);
		uset = new HashSet<String>();
		for(String name:unames) {
			if(is.contains(name) && cs.contains(name) && ec.contains(name)) {
				uset.add(name);
			}
		}
				
		//LinkedHashSet: ordered version of HashSet
		//Maintains double linked list among all elements
		//Order you inserted will be maintained
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		set2.add(1001);
		set2.add(1002);
		set2.add(1003);
		set2.add(1004);
		set2.add(1005);
		set2.add(1006);
		set2.add(null);
		set2.add(null);
		System.out.println(set2);		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}
	
}
