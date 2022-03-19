package com.lwl.cj.day6;

class Student{
	String name;
	int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public void showInfo() {
		System.out.println("Name : " + name);
		System.out.println("Score : " + score);
	}
}


public class ArrayWithReferenceDataType {
	public static void main(String[] args) {
		Student[] arr = getStudentScores();
		//Student s6 = new Student("john", 9);
		
		
		/*
		 * for(int i = 0;i < arr.length;i++) { Student s = arr[i]; s.showInfo(); }
		 */
		int sum = 0;
		for(Student s:arr) {
			sum += s.score;
		}
		double r = sum/arr.length;
		System.out.println(r);
		System.out.println(sum/(double)arr.length);
		
//		float avg = sum / (float)arr.length;
//		System.out.println("The sum: " + sum);
//		System.out.println("Count :" + coun );
//		System.out.println("Avg score is: " + avg);
		/*
		 * int[] numArr = new int[] {1,2,3,4,5,6,7,8,9,10}; for(int ele:numArr) {
		 * System.out.println(ele); }
		 */	
	}
		private static Student[] getStudentScores() {
			Student s1 = new Student("John", 9);
			Student s2 = new Student("Mani", 8);
			Student s3 = new Student("Krish", 7);
			Student s4 = new Student("Charan", 6);
			Student s5 = new Student("Kiran", 8);
			return new Student[] {s1,s2,s3,s4,s5};
			
		}
}
