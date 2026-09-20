package collection_framework;

import java.util.*;

public class Program07 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add(10);
		c1.add(20);
		c1.add("20");
		c1.add("abc");
		c1.add("xyz");
		c1.add(30);
		c1.add(40);
		c1.add(70);
		c1.add("100");
		c1.add(100);
		c1.add("Hello World");

		Iterator itr = c1.iterator(); // This prevents ConcurrentModificationException - Exception that occurs if
										// while looping, we are trying to modify the collection.
		while (itr.hasNext()) {
			if (!(itr.next() instanceof Integer))
				itr.remove();
		}
		System.out.println("Collection Elements after removing Other Elements: ");
		for (Object x : c1) {
			System.out.print(x + " ");
		}
	}
}
