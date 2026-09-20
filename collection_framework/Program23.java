package collection_framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program23 {
	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<Integer>();
		c1.add(49);
		c1.add(49);
		c1.add(2);
		c1.add(5);
		c1.add(43);
		c1.add(37);
		c1.add(75);
		c1.add(73);
		c1.add(73);
		c1.add(569);
		c1.add(997);
		c1.add(840);
		c1.add(100);
		c1.add(100);

		if (isSorted(c1))
			System.out.println("List " + c1 + " is Sorted!");
		else
			System.out.println("List " + c1 + " is NOT Sorted!");
	}

	public static boolean isSorted(Collection<Integer> c) {
		Iterator<Integer> itr = c.iterator();

		if (!itr.hasNext())
			return true; // Empty List

		int ele1 = itr.next();
		while (itr.hasNext()) {
			int ele2 = itr.next();
			if (ele1 > ele2)
				return false;
			ele1 = ele2; // Same Concept as of Fibonacci Series, i.e. Saving next element into previous element
		}
		return true;
	}
}