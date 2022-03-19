package com.lwl.cj.day17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService {
	
	private List<Employee> empList;
	
	{
		empList = CsvReaderUtil.loadEmpDataFromCsv();
		//System.out.println(empList);
	}
	@Override
	public List<Long> getAllEmpIds() {
		/*
		 * List<Long> idList = new ArrayList<Long>(); if(!empList.isEmpty()) {
		 * for(Employee e:empList){ idList.add(e.getEmpno()); } } else {
		 * System.out.println("Employee list is empty"); }
		 */
		//Use map because we want to apply something to all elements
		//use filter when you want to check on elements passed. 
		//Return number would be lower # of elements
		List<Long> idList = empList.stream().map(e->e.getEmpno()).collect(Collectors.toList());
		return idList;
	}

	@Override
	public List<Employee> getEmployee(String dept) {
		// TODO Auto-generated method stub		
		return empList.stream()
				.filter(x -> x.getDept().equals(dept))
				.collect(Collectors.toList());
	}

	@Override
	public List<Employee> getMaxPaidEmpOfEachDept() {
		// TODO Auto-generated method stub
		List<String> departments = this.getUniqueDeptName();
		List<Employee> maxPaidEmployee = new ArrayList<Employee>();
		
		for(String eachDept: departments) {
			double maxSalary = this.maxSalary(eachDept);
			List<Employee> maxOfOneDept = empList.stream()
							.filter(x -> x.getDept().equals(eachDept) && x.getSalary() == maxSalary)
							.collect(Collectors.toList());
			maxPaidEmployee.addAll(maxOfOneDept);
			//USE addAll() here instead of add()
			
		}
		return maxPaidEmployee;
	}

	@Override
	public double maxSalaryDiff(String dept1, String dept2) {
		// TODO Auto-generated method stub
		return Math.abs(this.maxSalary(dept1) - this.maxSalary(dept2));
	}

	@Override
	public List<Employee> getEmpInSortingOrder() {
		//1:49 
		//Sort based on salary
		//if salaries are same then compare based on dept
		empList.sort(Comparator.comparing(Employee::getSalary)
				.thenComparing(Employee::getDept).reversed());
		return empList;
	}
	
	private List<String> getUniqueDeptName(){
		List<String> list = new ArrayList<String>();
		for(Employee emp: empList) {
			String dname = emp.getDept();
			if(!list.contains(dname)) {
				list.add(dname);
			}
		}
		return list;
	}
	
	//Take all employees in list
	//Check employees based on deptartment
	//than get all salaries of that department
	//get maximum of that department
	private double maxSalary(String dept) {
		return empList.stream()
				.filter(e -> e.getDept().equalsIgnoreCase(dept))
				.mapToDouble(e->e.getSalary())
				.max().getAsDouble();
	}
	public static void main(String[] args) {
		EmployeeServiceImpl es = new EmployeeServiceImpl();
		System.out.println(es.maxSalary("Qa"));
		
		System.out.println(es.getUniqueDeptName());
		
		
	
		
	}

}
