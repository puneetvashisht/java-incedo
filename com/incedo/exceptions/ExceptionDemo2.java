package com.incedo.exceptions;



public class ExceptionDemo2 {
	
	public static void teamPuneetMethod(int i) throws InvalidInputException{
		if(i<0) {
			throw new InvalidInputException("Input not expecting negative");
		}
	}
	
	public static void m2() {
		
		
		try {
			
			try {
				teamPuneetMethod(-34);
			}
			
			catch (InvalidInputException e) {
				System.out.println("In runtime exception... ");
				e.getMessage();
				e.printStackTrace();
			}
			catch (RuntimeException e) {
				System.out.println("In runtime exception... ");
				e.printStackTrace();
			}
			catch (Exception e) {
				System.out.println("In exception... ");
				e.printStackTrace();
			}
			
			finally {
				System.out.println("Always runs!");
			}
			
			
//			int result = 1/0;
			String str = "dd";
			if(str == null) {
				throw new RuntimeException("dont pass string as null");
				
			}
			else {
				str.charAt(1);
			}
			
		}
		catch(RuntimeException ae) {
//			result = 1/1
			ae.printStackTrace();
		}
		
	}
	
	public static void m1() {
		m2();
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		m1();
		
//		Object obj = new Object();
//		obj.wait();
//		
		System.out.println("Allz well that ends well!");
		
	}

}
