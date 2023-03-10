package com.incedo.basics;

public class Employee {
	// Member variables
	int id;
	String name;
	double salary;
	
	//constructor (initialize mandatory fields)
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// method/behavior to modify state
	void incrementSalary(double amount) {
//		this.salary = this.salary + amount;
		this.salary += amount;
	}


	// string representation of object
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	

}
