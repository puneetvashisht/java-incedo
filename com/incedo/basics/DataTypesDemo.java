package com.incedo.basics;

public class DataTypesDemo {

	int x;
	
	public void someMethod() {
		int y = 34;
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		
		DataTypesDemo demo = new DataTypesDemo();
		System.out.println(demo.x);
		
		demo.someMethod();
		
		
		int b = 34;
		short age = (short)b;
		System.out.println(age);
		
		float d = (float)23.23;
		
		
	}
}
