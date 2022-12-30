package com.incedo.collections;

import java.util.Objects;

public class Employee {
	// Member variables
	int id;
	String name;
	double salary;

	// constructor (initialize mandatory fields)
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

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(name, other.name);
	}
	
	

}
