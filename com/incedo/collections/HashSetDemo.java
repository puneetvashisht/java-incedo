package com.incedo.collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Employee> employees = new HashSet<>();
		
		Employee e1 = new Employee(1, "Ravi", 33333);
		Employee e2 = new Employee(2, "Priya", 44444);
		Employee e3 = new Employee(3, "Priya", 33333);
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		System.out.println(employees);
		
		boolean isEmployeeFound = employees.contains(new Employee(1, "Ravi", 33333));
		System.out.println("Found: " + isEmployeeFound);
	}

}
