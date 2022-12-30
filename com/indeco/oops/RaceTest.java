package com.indeco.oops;

import java.util.ArrayList;

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
			b.speedUp();
//			b.peddle();
			System.out.println(b);
		}
		
	}

}
