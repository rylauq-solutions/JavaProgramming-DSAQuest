package number_programming;

import java.util.Scanner;

class Program09 {
	// TODO: Palindrome Numbers which are also Prime Numbers in a range
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range: ");
		int n = sc.nextInt();
		int cnt = 0;
		System.out.println("Palindrome Numbers which are also Prime Numbers from 1 to " + n + " are:");
		for (int i = 1; i <= n; i++) {
			if (isPalindrome(i)) {
				if (isPrime(i)) {
					cnt++;
					System.out.println(i);
				}
			}
		}
		System.out.println("Count of Palindrome Numbers which are also Prime Numbers from 1 to " + n + " is: " + cnt);
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

	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}