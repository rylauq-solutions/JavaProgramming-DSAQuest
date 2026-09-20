package collection_framework;

import java.util.*;

public class Program09 {
	public static void main(String[] args) {
		Collection<Object> c1 = new ArrayList<Object>();
		c1.add(1);
		c1.add(2);
		c1.add("20");
		c1.add("abc");
		c1.add("xyz");
		c1.add(30);
		c1.add(40);
		c1.add(70);
		c1.add(705);
		c1.add(730);
		c1.add(569);
		c1.add(997);
		c1.add(840);
		c1.add("100");
		c1.add(100);
		c1.add("Hello World");

		int count = 0;
		System.out.println("Collection of Even Integer Elements are: ");
		for (Object x : c1) {
			if (x instanceof Integer) {
				int val = (Integer) x;
				if (val % 2 == 0) {		// Even Numbers
					count++;
					System.out.println(val);
				}
			}
		}
		System.out.println("Total Even Integers are: " + count);
	}
}
