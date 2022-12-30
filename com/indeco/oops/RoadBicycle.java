package com.indeco.oops;

public class RoadBicycle extends Bicycle implements Battery {
	
	

	public RoadBicycle(int speed) {
		super(speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speedUp() {
		this.speed+=2;

	}

	@Override
	public void brakeDown() {
		this.speed-=2;

	}

	@Override
	public String toString() {
		return "RoadBicycle [speed=" + speed + "]";
	}

	@Override
	public void chargeBattery() {
		System.out.println("Chargin...");
		
	}

	@Override
	public void runOnBattery() {
		System.out.println("running on battery");
		
	}
	
	

}
