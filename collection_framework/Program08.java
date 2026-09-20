package collection_framework;

import java.util.*;

public class Program08 {
	public static void main(String[] args) {
		Collection<Object> c1 = new ArrayList<Object>();
		c1.add(10);
		c1.add(20);
		c1.add("20");
		c1.add("abc");
		c1.add("xyz");
		c1.add(30);
		c1.add(40);
		c1.add(70);
		c1.add(700);
		c1.add(750);
		c1.add(560);
		c1.add(990);
		c1.add(840);
		c1.add("100");
		c1.add(100);
		c1.add("Hello World");

		int count = 0;
		System.out.println("Three digit Collection Integer Elements are: ");
		for (Object x : c1) {
			if (x instanceof Integer) {
				int val = (Integer) x;
				if (val > 99 && val < 1000) {
					count++;
					System.out.println(val);
				}
			}
		}
		System.out.println("Total such Integers are: " + count);
	}
}
