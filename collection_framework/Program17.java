package collection_framework;

import java.util.*;
import java.util.Scanner;

public class Program17 {
	public static void main(String[] args) {
		Map<Character, Integer> m1 = new LinkedHashMap<Character, Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s1 = sc.nextLine();

		for (char x : s1.toCharArray()) {
			if (!m1.containsKey(x)) {
				m1.put(x, 1);
			} else {
				m1.put(x, m1.get(x) + 1);
			}
		}

		System.out.println("Unique Characters are as follows:");
		for (Map.Entry<Character, Integer> ent : m1.entrySet()) {
			if (ent.getValue() == 1) {
				System.out.print(ent.getKey() + " ");
			}
		}
		sc.close();
	}
}
