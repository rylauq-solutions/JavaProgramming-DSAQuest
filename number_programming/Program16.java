package number_programming;

import java.util.Scanner;

class Program16 {
	// TODO: Automorphic Number in Range
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range: ");
		int n = sc.nextInt();
		int count = 0;
		System.out.println("Automorphic Numbers from 1 to " + n + " are: ");
		for (int i = 1; i <= n; i++) {
			if (isAutomorphic(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Count of Automorphic Numbers from 1 to " + n + " is: " + count);
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
