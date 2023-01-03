package com.indeco.oops;

import java.util.ArrayList;

import com.incedo.exceptions.InvalidInputException;

public class RaceTest {

	public static void main(String[] args) {
//		Bicycle b = new Bicycle();
		
		
		System.out.println(IBycycle.company);
		
		IBycycle rb = new RoadBicycle(10);
		
		IBycycle mb = new MountainBicycle(10, 2);
		
//		Bicycle bicycles[] = {rb, mb};
		ArrayList<IBycycle> bicycles = new ArrayList<>();
		bicycles.add(rb);
		bicycles.add(mb);
		
		for(IBycycle b : bicycles) {
			System.out.println(b);
			try {
				b.speedUp();
			} catch (InvalidInputException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			b.peddle();
			System.out.println(b);
		}
		
	}

}
