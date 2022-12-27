package com.indeco.oops;

public class Plane extends Vehicle{
	
	int maxAltitude;
	
	
	
	public Plane(int speed, int maxSpeed, String color, double price, int maxAltitude) {
		super(speed, maxSpeed, color, price);
		this.maxAltitude = maxAltitude;
	}

	@Override
	public void speedUp() {
		this.speed+=50;
	}


	public void fly() {
		System.out.println("flying...");
	}



	@Override
	public String toString() {
		return "Plane [maxAltitude=" + maxAltitude + ", speed=" + speed + ", maxSpeed=" + maxSpeed + ", color=" + color
				+ ", price=" + price + "]";
	}
	
	

}
