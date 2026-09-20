package recursion;

import java.util.Scanner;

public class Program10 {
	// TODO: Check whether number is palindrome or not using recursion.
	static int rev = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		int rev = getReverseOfNumber(n);
		if (n == rev)
			System.out.println(n + " is a Palindrome Number!");
		else
			System.out.println(n + " is NOT a Palindrome Number!");
		sc.close();
	}

	public static int getReverseOfNumber(int n) {
		if (n <= 0)
			return rev;
		rev = (rev * 10) + (n % 10);
		return getReverseOfNumber(n / 10);
	}
}