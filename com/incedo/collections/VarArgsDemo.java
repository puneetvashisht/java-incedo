package com.incedo.collections;

import com.incedo.exceptions.InvalidInputException;

public class VarArgsDemo {
	
	public static void m1( String... names) throws Exception, InvalidInputException, RuntimeException{
		for(String name :names) {
			System.out.println(name);
		}
	}
	
	public static void main(String... args) throws Exception,InvalidInputException, RuntimeException {
		
		for(String arg: args) {
			System.out.println(arg);
		}
		
		m1("Ravi", "Riya", "Arjun");
		
	}

}
