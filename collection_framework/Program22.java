package collection_framework;

import java.util.*;

public class Program22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		System.out.println("List of Binary Values of " + n + " is: " + getBinary(n));
		sc.close();
	}

	public static List<Integer> getBinary(int n) {
		List<Integer> l1 = new ArrayList<Integer>();
		while (n != 0) {
			l1.add(0, n % 2);
			n = n / 2;
		}
		return l1;
	}
}