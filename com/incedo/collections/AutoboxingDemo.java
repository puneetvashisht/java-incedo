package com.incedo.collections;

import java.util.ArrayList;
import static java.lang.Math.random;

public class AutoboxingDemo {
	
	public static Integer m1(Boolean b) {
		return 34;
	}
	
	public static void main(String[] args) {
		
		random();
		
		int i = 34;
		
		Object j = i;
		
		ArrayList list = new ArrayList();
		list.add(j);
		
		m1(true);
	}

}
