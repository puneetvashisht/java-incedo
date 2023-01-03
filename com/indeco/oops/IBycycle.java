package com.indeco.oops;

import com.incedo.exceptions.InvalidInputException;

public interface IBycycle {
	
	String company = "Hero";
	void speedUp() throws InvalidInputException;
	void brakeDown();
	
}
