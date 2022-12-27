package com.indeco.oops;

public class EmployeeTest {
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1 ,"Ravi");
//		e1.salary = -33333;
		e1.setSalary(33333);
		System.out.println(e1.toString());
		
		Employee e2 = new Employee(2, "Priya");
		System.out.println(e2);
		
		e2.incrementSalary(1000);
		
		System.out.println(e2);
	}

}
