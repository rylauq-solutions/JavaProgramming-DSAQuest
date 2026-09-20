package collection_framework;

import java.util.*;

public class Program15 {
	public static void main(String[] args) {
		Set<Character> st = new HashSet<Character>();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s1 = sc.nextLine();
		for (char x : s1.toCharArray()) {
			if (!st.contains(x)) {
				st.add(x);
			}
		}

		System.out.println("Unique Characters in the String " + s1 + " are:");
		for (char x : st) {
			System.out.print(x + " ");
		}
		sc.close();
	}
}