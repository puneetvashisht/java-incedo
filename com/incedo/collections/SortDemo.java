package com.incedo.collections;

import static java.util.Collections.sort;

import java.util.ArrayList;

 class Fruit implements Comparable<Fruit>{
	String name;
	String color;

	public Fruit(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + "]";
	}



	@Override
	public int compareTo(Fruit o) {
		return this.name.compareTo(o.name);
	}
	
}

public class SortDemo {

	public static void main(String[] args) {
		
		ArrayList<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit("apple", "red"));
		fruits.add(new Fruit("pineapple", "yellow"));
		fruits.add(new Fruit("grapes", "green"));
		
		System.out.println(fruits);
		
		sort(fruits, new ColorComparator());
		
		System.out.println(fruits);
		

	}

}
