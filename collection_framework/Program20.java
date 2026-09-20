package collection_framework;

import java.util.*;

public class Program20 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		Set<Integer> setFreq = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		l1.add(1);
		l1.add(3);
		l1.add(4);
		l1.add(6);
		l1.add(7);
		l1.add(8);
		l1.add(9);
		l1.add(11);
		l1.add(12);
		l1.add(15);

		System.out.print("Enter the range: ");
		int n = sc.nextInt();

		for (int c : l1) {
			if (!setFreq.contains(c))
				setFreq.add(c);
		}

		System.out.println("Missing Numbers in the Range of 1 to " + n + " are: ");
		for (int i = 0; i < n; i++) {
			if (!setFreq.contains(i))
				System.out.println(i + " ");
		}
		sc.close();
	}
}
