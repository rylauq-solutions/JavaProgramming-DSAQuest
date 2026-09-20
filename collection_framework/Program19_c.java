package collection_framework;

import java.util.*;

public class Program19_c {
	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<>();
		Collection<Integer> c2 = new ArrayList<>();
		Collection<Integer> elementsInSecondNotFirst = new ArrayList<>();

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

		elementsInSecondNotFirst = getElementsInSecondNotFirst(c1, c2);
		System.out.println("The List of elements which are in Collection-2, but not in Collection-1 is: ");
		System.out.println(elementsInSecondNotFirst);

		sc.close();
	}

	public static Collection<Integer> getElementsInSecondNotFirst(Collection<Integer> c1, Collection<Integer> c2) {
		Collection<Integer> ans = new ArrayList<>();

		Iterator<Integer> itr = c2.iterator();
		while (itr.hasNext()) {
			int ele = itr.next();
			if (!c1.contains(ele))
				ans.add(ele);
		}

		return ans;
	}
}