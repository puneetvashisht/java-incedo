package com.incedo.lamdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;



public class EmployeeLamdasTest2 {
	
	public static void printEmployees(List<Employee> employees, Predicate<Employee> predicate, Consumer<Employee> consumer) {
		for(Employee e: employees) {
			if(predicate.test(e)) {
				consumer.accept(e);
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
		

		System.out.println("--- With first name as R-----");
		printEmployees(employees, (e) ->  e.firstName.startsWith("R"), (e)-> System.out.println(e));
		

		// Print all employees
		System.out.println("--- All employees-----");
		printEmployees(employees, (e) -> true, (e)-> System.out.println(e));

		
		// Print all employees with last name as 'Barnes'
		System.out.println("--- With last names as 'Barnes'-----");
		printEmployees(employees, (e) -> e.lastName.equalsIgnoreCase("Barnes"), (e)-> System.out.println(e));


		Collections.sort(employees, (o1, o2) -> (int)(o1.salary- o2.salary));
		
		
		System.out.println("--- After sorting employees on salary-----");
		printEmployees(employees, (e) -> true, (e)-> System.out.println(e));
		
		
		String str = "Good morning";
		
		
		Function<String, Integer> fn = (s) -> s.length();
		System.out.println(fn.apply(str));
		
		System.out.println(fn.apply("dslk jlgskjkgdj lkd"));
	

	}

}
