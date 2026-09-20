package number_programming;

import java.util.Scanner;

class Program08 {
	// TODO: Palindrome Number in a range
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range: ");
		int n = sc.nextInt();
		int cnt = 0;
		System.out.println("Palindrome Numbers from 1 to " + n + " are:");
		for (int i = 1; i <= n; i++) {
			if (isPalindrome(i)) {
				cnt++;
				System.out.println(i);
			}
		}
		System.out.println("Count of Palindrome Numbers from 1 to " + n + " is: " + cnt);
		sc.close();
	}

	public static boolean isPalindrome(int n) {
		int originalNum = n;
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		return rev == originalNum;
	}
}