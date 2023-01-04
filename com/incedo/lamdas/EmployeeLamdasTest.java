package com.incedo.lamdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface Condition{
	boolean test(Employee e);
}

public class EmployeeLamdasTest {
	
	public static void printEmployees(List<Employee> employees, Condition condition) {
		for(Employee e: employees) {
			if(condition.test(e)) {
				System.out.println(e);
			}
		}
	}


	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Ravi", "Barnes", 343334.44);
		Employee e2 = new Employee(2, "Priya", "Negi", 443334.44);
		Employee e3 = new Employee(5, "Kate", "Barnes", 243334.44);
		Employee e4 = new Employee(3, "Rahul", "Kumar", 543334.44);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(e4);
		employees.add(e3);
		employees.add(e2);
		employees.add(e1);
		
//		System.out.println(employees);
		
		// Print all employee starting with 'R' as first letter of firstName
		System.out.println("--- With first name as R-----");
//		printEmployees(employees, new Condition() {
//			@Override
//			public boolean test(Employee e) {
//				return e.firstName.startsWith("R");
//			}
//		});
		
//		boolean test(Employee e);
//		Condition condition1 = (e) ->  e.firstName.startsWith("R");
		printEmployees(employees, (e) ->  e.firstName.startsWith("R"));
		
//		for(Employee e: employees) {
//			if(e.firstName.startsWith("R")) {
//				System.out.println(e);
//			}
//		}
		
		// Print all employees
		System.out.println("--- All employees-----");
		printEmployees(employees, (e) -> true);
//		printEmployees(employees, new Condition() {
//			@Override
//			public boolean test(Employee e) {
//				return true;
//			}
//		});
//		for(Employee e: employees) {
//			if(true) {
//				System.out.println(e);
//			}
//		}
		
		// Print all employees with last name as 'Barnes'
		System.out.println("--- With last names as 'Barnes'-----");
		printEmployees(employees, (e) -> e.lastName.equalsIgnoreCase("Barnes"));
//		printEmployees(employees, new Condition() {
//			@Override
//			public boolean test(Employee e) {
//				return e.lastName.equalsIgnoreCase("Barnes");
//			}
//		});
//		for(Employee e: employees) {
//			if(e.lastName.equalsIgnoreCase("Barnes")) {
//				System.out.println(e);
//			}
//		}
		
		// Print all employees with sorted salaries
		Collections.sort(employees, (o1, o2) -> (int)(o1.salary- o2.salary));
		
//		Collections.sort(employees, new Comparator<Employee>() {
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return (int)(o1.salary - o2.salary);
//			}
//		});
		
		System.out.println("--- After sorting employees on salary-----");
		printEmployees(employees, (e) -> true);
//		for(Employee e: employees) {
//			if(true) {
//				System.out.println(e);
//			}
//		}
		
		
		

	}

}
