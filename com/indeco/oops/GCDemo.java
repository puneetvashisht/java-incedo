package com.indeco.oops;

public class GCDemo {

	public static void main(String[] args) throws InterruptedException {
		
		StringBuilder str = new StringBuilder();
//		String str = "";
//		StringBuffer str = new StringBuffer();
		
		for(int i=0; i<10; i++) {
//			str += i;
			str.append(i);
			Thread.sleep(200);
		}
		
		System.out.println(str);

	}
	
//	 	= ""
//     	= "0"
//     	= "01"
//    	= "012"
//		str = "0123"
			
}
