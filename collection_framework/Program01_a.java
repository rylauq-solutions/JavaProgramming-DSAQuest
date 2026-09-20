package collection_framework;

import java.util.*;

public class Program01_a {
	// TODO: To create a collection and iterate over the collection using Iterator Cursor
	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		char ch;
		do {
			System.out.print("Enter the Element: ");
			c1.add(sc.nextInt());
			System.out.print("Do you want more Elements? ");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
		Iterator<Integer> itr = c1.iterator();
		System.out.println("=============================");
		System.out.println("The Collection has:");
		while (itr.hasNext()) {
			System.out.println("Element: " + itr.next());
		}
		sc.close();
	}
}