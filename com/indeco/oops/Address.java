package com.indeco.oops;

public class Address {
	short houseNumber;
	String street;
	String city;
	String state;
	long pincode;
	
	public Address() {
		
	}
	
	public Address(short houseNumber, String street, String city, String state) {
		super();
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + "]";
	}
	
	
	public void changeHouseNumber(short newHouseNumber) {
		this.houseNumber = newHouseNumber;
	}
	
	
	public static void main(String[] args) {
		short houseNumber = 12;
		Address add1 = new Address(houseNumber, "Jangpura", "New Delhi", "Delhi");
		add1.setPincode(110014);
		System.out.println(add1);
		
		add1.changeHouseNumber((short)21);
		System.out.println(add1);
	}
	
	

}
