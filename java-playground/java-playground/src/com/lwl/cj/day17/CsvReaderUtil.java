package com.lwl.cj.day17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public final class CsvReaderUtil {

	private CsvReaderUtil() {

	}

	public static List<Employee> loadEmpDataFromCsv() {
		List<Employee> empList = new ArrayList<Employee>();
		
		try {
			List<String> stringList = Files.readAllLines(Paths.get(
					"C:\\Users\\dilshad\\Documents\\java-code\\teacher work\\java-fullstack-feb\\core-java\\data\\emp_data.csv"));
			for (int i = 1;i < stringList.size();i++) {
				//System.out.println(stringList.get(i));
				String[] s = stringList.get(i).split(",");
				long empno = Long.parseLong(s[0]);
				String name = s[1];
				double salary = Double.parseDouble(s[2]);
				String dept = s[3].toString();
				
				Employee e = new Employee();
				e.setEmpno(empno);
				e.setName(name);
				e.setSalary(salary);
				e.setDept(dept);
				
				//System.out.println(e.getEmpno() + " " + e.getName() + " " + e.getSalary() + " " + e.getDept());
				
				empList.add(e);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return empList;
	}

	/*
	 * public static void main(String[] args) { loadEmpDataFromCsv() .stream()
	 * .forEach(x -> System.out.println(x.getName() + x.getDept())); }
	 */

}
