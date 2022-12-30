package com.indeco.oops;

public class TestInheritance {
	public static void speedUpFast(Vehicle v) {
		v.speed += 10;
	}
	
	public static void main(String[] args) {
		
		int i1 = 1_234; 
		System.out.println(i1);
//		byte b = 34;
//		int a = b;
		Car car = new Car(80, 300, "red", 800000, "Tata");
		Vehicle plane = new Plane(500, 1000, "white", 80000000, 10000);
//		System.out.println(car.toString());
//		System.out.println(plane);
		
		// Upcasting
//		Vehicle v1 = car;
//		System.out.println(v1);
//		
//		// Downcasting is explicity
//		if(v1 instanceof Car) {
//			Car c1 = (Car) v1;
//			System.out.println(c1);
//		}
////		
		
		
	
		Vehicle vehicles[] = {car, plane};
		
		for(Vehicle v : vehicles) {
//			System.out.println(v);
			if(v instanceof Plane) {
				Plane p = (Plane) v;
				p.fly();
			}
			
			
			v.speedUp();
//			speedUpFast(v);
			System.out.println(v);
		}
		
		
	}
}
