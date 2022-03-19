package com.lwl.cj.day11;

//class A extends Object{
//	
//}
//class B extends A{
//	
//}
//class C extends B{
//	
//}
class One{
	void showShape() {
		System.out.println("Some shape");
	}
}

class Two extends One{
	void showShape() {
		System.out.println("Circle");
	}
}
public class Employee extends Object{
	private int empno;
	private String name;
	private double salary;
	public Employee(int empno, String name, double salary) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("[Employee - Empno %s, Name %s and Salary %s]",empno,name,salary);
	}
	public static void main(String[] args) {
//		Employee employee1 = new Employee(1001, "Krish",99999);
//		Employee employee2 = new Employee(1001, "Krish",99999);
//
//		System.out.println(employee1);
//		System.out.println(employee2.toString());
		Two obj = new Two();
		obj.showShape();
		
	}
}
