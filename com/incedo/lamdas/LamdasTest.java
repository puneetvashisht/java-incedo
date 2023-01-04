package com.incedo.lamdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdasTest {
	
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
		
		Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return (int)(o1.salary - o2.salary);
			}
		});
		
		System.out.println("--- After sorting employees on salary-----");
		for(Employee e: employees) {
			if(true) {
				System.out.println(e);
			}
		}
	}

}
