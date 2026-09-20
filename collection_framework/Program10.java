package collection_framework;

import java.util.*;

public class Program10 {
	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<Integer>();
		c1.add(49);
		c1.add(2);
		c1.add(5);
		c1.add(43);
		c1.add(37);
		c1.add(75);
		c1.add(73);
		c1.add(569);
		c1.add(997);
		c1.add(840);
		c1.add(100);
		int count = 0;
		System.out.println("The Prime Numbers in the Collection are:");
		for (Integer x : c1) {
			if (checkPrime(x)) {
				count++;
				System.out.println(x);
			}
		}
		System.out.println("Number of Prime Numbers in the Collection is: " + count);
	}

	public static boolean checkPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}