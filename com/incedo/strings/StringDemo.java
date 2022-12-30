package com.incedo.strings;

public class StringDemo {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		
		String str3 = new String("abc");
		
		
		String result = str1.concat(str2);
		System.out.println(str1);
		System.out.println(result);
		
		if(str1 == str2) {
			System.out.println("equal references..");
		}
		
		if(str1.equals(str2)) {
			System.out.println("contents are the same..");
		}
	}
}
