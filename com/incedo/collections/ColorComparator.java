package com.incedo.collections;

import java.util.Comparator;

public class ColorComparator implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.color.compareTo(o2.color);
	}

}
