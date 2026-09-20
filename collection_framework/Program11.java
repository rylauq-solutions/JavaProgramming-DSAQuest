package collection_framework;

import java.util.*;

public class Program11 {
	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		char ch;
		do {
			System.out.print("Enter the Element: ");
			c1.add(sc.nextInt());
			System.out.print("Do you want more Elements? ");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
		System.out.println("<=========================>");
		int cnt = 0;
		for (int x : c1) {
			if (checkPalindrome(x)) {
				System.out.println(x + " is a Palindrome Number");
				cnt++;
			}
		}
		if (cnt == 0) {
			System.out.println("There is no Palindrome Number!");
		}
		sc.close();
	}

	public static boolean checkPalindrome(int n) {
		int originalNum = n;
		int rev = 0;
		while (n != 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		return rev == originalNum;
	}
}