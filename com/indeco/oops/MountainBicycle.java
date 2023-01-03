package com.indeco.oops;

import com.incedo.exceptions.InvalidInputException;

public class MountainBicycle extends Bicycle {
	
	int gears;
	

	public MountainBicycle(int speed, int gears) {
		super(speed);
		this.gears = gears;
	}
	
	public void changeGear(int gear) {
		this.gears = gear;
	}

	@Override
	public void speedUp() throws InvalidInputException {
		this.speed+=1;

	}

	@Override
	public void brakeDown() {
		this.speed-=1;

	}

	@Override
	public String toString() {
		return "MountainBicycle [gears=" + gears + ", speed=" + speed + "]";
	}

	
	
}
