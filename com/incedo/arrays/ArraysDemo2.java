package com.incedo.arrays;

import com.incedo.basics.Employee;

public class ArraysDemo2 {
	
	public static void main(String[] args) {
//		Employee employees[] = new Employee[2];
		
//		int arr [][] = new int[3][];
				
		Employee e1 = new Employee(1 ,"Ravi");
		Employee e2 = new Employee(2, "Priya", 34343);
		Employee employees[] = {e1, e2};
//		employees[0] = e1;
//		employees[1] = e2;
		byte b = 23;
		int a = b;
	
		for(Employee e : employees) {
			System.out.println(e);
		}
 		
		
	}

}
