package collection_framework;

import java.util.*;

public class Program04 {
	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<>();
		c1.add(22);
		c1.add(20);
		c1.add(56);
		c1.add(40);
		c1.add(50);
		c1.add(50);
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int x : c1) {
			if (x > max) {
				max = x;
			}
			if (x < min) {
				min = x;
			}
		}
		System.out.println("The Minimum element is: " + min);
		System.out.println("The Maximum element is: " + max);
	}
}