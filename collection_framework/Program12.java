package collection_framework;

import java.util.*;

public class Program12 {
	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<Integer>();
		Collection<Integer> unique = new LinkedHashSet<Integer>();
		
		Scanner sc = new Scanner(System.in);
		char ch;
		do {
			System.out.print("Enter the Element: ");
			c1.add(sc.nextInt());
			System.out.print("Do you want more Elements? ");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
		
//		c1.add(22);
//		c1.add(20);
//		c1.add(20);
//		c1.add(56);
//		c1.add(40);
//		c1.add(50);
//		c1.add(50);
		
		for (int x : c1) {
			if (!(unique.contains(x))) {
				unique.add(x);
			}
		}
		
		System.out.println("All the unique elements in the Collection are: ");
		for (int x: unique) {
			System.out.println(x);
		}
		sc.close();
	}
}