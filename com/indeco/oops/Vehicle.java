package com.indeco.oops;

public class Vehicle extends Object{
	
	int speed;
	int maxSpeed;
	String color;
	double price;
	
	public Vehicle() {
		
	}
	
	public Vehicle(int speed, int maxSpeed, String color, double price) {
		super();
		this.speed = speed;
		this.maxSpeed = maxSpeed;
		this.color = color;
		this.price = price;
	}



	protected void speedUp() {
		this.speed++;
	}



	@Override
	public String toString() {
		return "Vehicle [speed=" + speed + ", maxSpeed=" + maxSpeed + ", color=" + color + ", price=" + price + "]";
	}
	
	

}
