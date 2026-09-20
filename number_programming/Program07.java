package number_programming;

import java.util.Scanner;

class Program07 {
	// TODO: Number is Palindrome or Not: The number is palindrome if the digits
	// from left to right are same as digits from right to left.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		if (isPalindrome(n))
			System.out.println(n + " is a Palindrome Number!");
		else
			System.out.println(n + " is NOT a Palindrome Number!");
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