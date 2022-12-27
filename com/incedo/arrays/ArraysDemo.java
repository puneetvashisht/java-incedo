package com.incedo.arrays;

public class ArraysDemo {
	
	public static void main(String[] args) {
		String scores[] = new String[5];
		scores[0] = "99";
		
		
//		System.out.println(scores.length);
		
//		for(int i=0; i <= scores.length; i++) {
//			System.out.println(scores[i]);
//		}
		
		for(String score: scores) {
			System.out.println(score);
		}
		
		
	}

}
