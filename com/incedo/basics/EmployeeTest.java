package com.incedo.basics;

public class EmployeeTest {
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1 ,"Ravi");
		System.out.println(e1.toString());
		
		Employee e2 = new Employee(2, "Priya", 34343);
		System.out.println(e2);
		
		e2.incrementSalary(1000);
		
		System.out.println(e2);
	}

}
