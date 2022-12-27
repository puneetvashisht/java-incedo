package com.indeco.oops;

class Employee {
	// Member variables
	int id;
	String name;
	private double salary;
	
	//constructor (initialize mandatory fields)
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Employee() {
		super();
	}

	

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary > 0) {
			this.salary = salary;
		}
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
