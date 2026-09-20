package collection_framework;

import java.util.*;

public class Program14 {
	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<Integer>();
		Collection<Integer> unique = new ArrayList<Integer>();
		Map<Integer, Integer> freq = new LinkedHashMap<Integer, Integer>();
		/*
		 * Scanner sc = new Scanner(System.in); char ch; do {
		 * System.out.print("Enter the Element: "); c1.add(sc.nextInt());
		 * System.out.print("Do you want more Elements? "); ch = sc.next().charAt(0); }
		 * while (ch == 'y' || ch == 'Y');
		 */
		c1.add(22);
		c1.add(20);
		c1.add(20);
		c1.add(56);
		c1.add(40);
		c1.add(50);
		c1.add(50);

		for (int x : c1) {
			if (!(freq.containsKey(x))) {
				freq.put(x, 1);
			} else {
				freq.put(x, freq.get(x) + 1);
			}
		}

		for (int x : freq.keySet()) {
			unique.add(x);
		}

		System.out.println("All the unique elements in the Collection are: ");
		for (int x : unique) {
			System.out.println(x);
		}
	}
}