package com.incedo.collections;

import java.util.ArrayList;

import com.incedo.basics.Employee;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("dsgd");
		list.add("some value");
//		list.add(new Employee());
		
//		for(Object o : list) {
//			System.out.println(o);
//			String s = (String)o;
//			System.out.println(s.length());
//		}
		
		for(String s : list) {
			System.out.println(s.length());
		}
		
		System.out.println(list);
	}

}
