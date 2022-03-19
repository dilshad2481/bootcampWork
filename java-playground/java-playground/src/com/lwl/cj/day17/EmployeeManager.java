package com.lwl.cj.day17;

public class EmployeeManager {
	public static void main(String[] args) {
		EmployeeServiceImpl es = new EmployeeServiceImpl();
	
		System.out.println(es.getEmployee("Qa").get(0).getName());
		System.out.println(es.getEmployee("Qa").get(1).getName());
		
		System.out.println(es.getMaxPaidEmpOfEachDept().size());
		System.out.println(es.getMaxPaidEmpOfEachDept().get(0).getName());
		
		/*
		 * List<Integer> list = new ArrayList<Integer>(); List<Integer> list2 = new
		 * ArrayList<Integer>(); for(int i = 0;i < 50;i++) { list.add(i);
		 * list2.addAll(list);
		 * 
		 * }
		 * 
		 * 
		 * System.out.println(list2);
		 */
	}
}
