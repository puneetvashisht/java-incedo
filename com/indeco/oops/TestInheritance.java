package com.indeco.oops;

public class TestInheritance {
	public static void speedUpFast(Vehicle v) {
		v.speed += 10;
	}
	
	public static void main(String[] args) {
//		byte b = 34;
//		int a = b;
		Car car = new Car(80, 300, "red", 800000, "Tata");
		Vehicle plane = new Plane(500, 1000, "white", 80000000, 10000);
//		System.out.println(car.toString());
//		System.out.println(plane);
		
	
		Vehicle vehicles[] = {car, plane};
		
		for(Vehicle v : vehicles) {
			System.out.println(v);
			v.speedUp();
//			speedUpFast(v);
			System.out.println(v);
		}
		
		
	}
}
