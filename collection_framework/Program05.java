package collection_framework;

import java.util.*;
import java.util.Collection;

public class Program05 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add(10);
		c1.add(20);
		c1.add("20");
		c1.add("abc");
		c1.add("xyz");
		c1.add(10);
		c1.add("100");
		c1.add(100);
		c1.add("Hello World");
		for (Object x : c1) {
			if (x instanceof String) {
				System.out.println("The length of String " + x + " is: " + ((String) x).length());
			}
		}
	}
}