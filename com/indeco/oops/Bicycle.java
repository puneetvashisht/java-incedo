package com.indeco.oops;

public abstract class Bicycle implements IBycycle {
	
	int speed;
	
	public Bicycle(int speed) {
		super();
		this.speed = speed;
	}
	
	public void peddle() {
		System.out.println("Peddling bicycle..");
	}
	
	


}
