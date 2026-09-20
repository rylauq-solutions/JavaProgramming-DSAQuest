package number_programming;

import java.util.Scanner;

class Program15 {
	/*
	 * TODO: Automorphic Number or Not? Number whose square ends in the same digits
	 * as the number itself. Examples: 76 = 5776
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		if (isAutomorphic(n))
			System.out.println(n + " is an Automorphic Number!");
		else
			System.out.println(n + " is NOT an Automorphic Number!");
		sc.close();
	}

	public static boolean isAutomorphic(int n) {
		int count = getPowerOfTen(getCountDigit(n));
		int square = n * n;
		return square % count == n;
	}

	public static int getCountDigit(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10;
		}
		return count;
	}

	public static int getPowerOfTen(int b) {
		int pow = 1;
		for (int i = 1; i <= b; i++) {
			pow = pow * 10;
		}
		return pow;
	}
}
