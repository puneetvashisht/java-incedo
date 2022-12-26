package com.incedo.basics;

class Number{
	int x;

	public Number(int x) {
		super();
		this.x = x;
	}

	@Override
	public String toString() {
		return "Number [x=" + x + "]";
	}
	
}

public class PassByRefDemo {
	// primitive - pass a copy : passbyvalue
//	static void changeValue(int x){
//		x = 55;
//	}
	// pass reference
	static void changeValue(Number num) {
		num.x = 55;
	}
	
	public static void main(String[] args) {
//		int x = 5;
//		changeValue(x);
		Number n = new Number(5);
		changeValue(n);
		
		System.out.println(n);
		
	}
}
