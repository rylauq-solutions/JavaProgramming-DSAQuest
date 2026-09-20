package collection_framework;

import java.util.*;

public class Program01 {
	// TODO: To create a collection and iterate over the collection
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add(22);
		c1.add("abc");
		c1.add("30.2");
		c1.add("xyz");
		c1.add(20);
		c1.add(56);
		c1.add(40);
		c1.add(50);
		c1.add(50);
		for (Object x : c1)
			System.out.println(x);
	}
}