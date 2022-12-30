package com.indeco.oops;

class Employee  {
	// Member variables
	int id;
	String name;
	private double salary;
	Address address;
	
	static final String COMPANY_NAME = "Incedo";
	
	static String getCompanyName() {
//		COMPANY_NAME = "xyz";
		return COMPANY_NAME;
	}
	
	
	
	
	//constructor (initialize mandatory fields)
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	
	public Employee(int id, String name, double salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
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



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}


	// string representation of object
	
	
	
	

}
