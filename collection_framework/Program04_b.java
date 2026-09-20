package collection_framework;

import java.util.*;

public class Program04_b {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(22);
		l1.add(20);
		l1.add(56);
		l1.add(40);
		l1.add(50);
		l1.add(50);
		System.out.println("The Minimum element is: " + Collections.min(l1));
		System.out.println("The Maximum element is: " + Collections.max(l1));
	}
}