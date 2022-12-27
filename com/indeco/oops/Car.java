package com.indeco.oops;

public class Car extends Vehicle {

//	public Car() {
//		super();
//	}
	String brand;

	public Car(String brand) {
		super();
		this.brand = brand;
	}
	
	

	public Car(int speed, int maxSpeed, String color, double price, String brand) {
		super(speed, maxSpeed, color, price);
		this.brand = brand;
	}



	@Override
	public String toString() {
		return "Car [brand=" + brand + ", speed=" + speed + ", maxSpeed=" + maxSpeed + ", color=" + color + ", price="
				+ price + "]";
	}



	
	

}
