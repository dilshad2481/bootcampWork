package com.lwl.cj.day17;

import java.util.List;

public interface EmployeeService {
	public List<Long> getAllEmpIds();
	public List<Employee> getEmployee(String dept);
	public List<Employee> getMaxPaidEmpOfEachDept();
	public double maxSalaryDiff(String dept1, String dep2);
	public List<Employee> getEmpInSortingOrder();
	
}
