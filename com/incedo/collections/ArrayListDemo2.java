package com.incedo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("apple");
		fruits.add("grape");
		fruits.add("mango");
		
		System.out.println("apple".equals(new String("apple")));
		
		System.out.println(fruits);
		
		boolean isFound = fruits.contains(new String("apple"));
		System.out.println("Found: " + isFound);
		
		List<Employee> employees = new LinkedList<>();
		Employee e1 = new Employee(1, "Ravi", 33333);
		Employee e2 = new Employee(2, "Priya", 44444);
		Employee e3 = new Employee(3, "Rahul", 33333);
		
//		Collections.sort(employees);
//		Arrays.
		
		
		Employee e4 = e3;
		System.out.println(e3 == e3);
		
		employees.add(e1);
		employees.add(e2);
//		employees.add(e3);
		
		employees.add(1, e3);
		
		
		System.out.println(employees);
		
		System.out.println(new Employee(3, "Rahul", 33333).equals(new Employee(3, "Rahul", 33333)));
		
		boolean isEmployeeFound = employees.contains(new Employee(3, "Amit", 55555));
		System.out.println("Found: " + isEmployeeFound);
		
		
	}

}
