package collection_framework;

import java.util.*;

public class Program18 {
	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<Integer>();
		Collection<Integer> c2 = new ArrayList<Integer>();
		Collection<Integer> ans = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		char ch;
		do {
			System.out.print("Enter the Element in Collection-1: ");
			c1.add(sc.nextInt());
			System.out.print("Do you want more Elements? ");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

		System.out.println();

		do {
			System.out.print("Enter the Element in Collection-2: ");
			c2.add(sc.nextInt());
			System.out.print("Do you want more Elements? ");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

		System.out.println();

		ans = mergeTwoLists(c1, c2);
		System.out.println("The merged list without duplicates is: ");
		System.out.println(ans);

		sc.close();
	}

	public static Collection<Integer> mergeTwoLists(Collection<Integer> c1, Collection<Integer> c2) {
		Collection<Integer> c = new ArrayList<>();

		for (int x : c1) { // Using for Each Loop
			if (!c.contains(x))
				c.add(x);
		}

		Iterator<Integer> itr = c2.iterator(); // Using for Each Loop
		while (itr.hasNext()) {
			int val = itr.next();
			if (!c.contains(val))
				c.add(val);
		}

		return c;
	}
}