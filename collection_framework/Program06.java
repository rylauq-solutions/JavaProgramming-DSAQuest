package collection_framework;

import java.util.*;

public class Program06 {
	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<String>();
		c1.add("20");
		c1.add("abc");
		c1.add("pqrxyz");
		c1.add("100");
		c1.add("Hello World");
		c1.add("Magician");
		c1.add("Harry Houdini");
		int maxLength = Integer.MIN_VALUE;
		int minLength = Integer.MAX_VALUE;
		for (String x : c1) {
			if (x.length() > maxLength)
				maxLength = x.length();
			if (x.length() < minLength)
				minLength = x.length();
		}
		System.out.println("Minimum length String is: " + minLength);
		System.out.println("Maximum length String is: " + maxLength);
	}
}
