package number_programming;

import java.util.Scanner;

class Program01 {
	// todo: Armstrong Number or Not: Number whose sum of digits raised to the power
	// of count of its digits is equal to the number.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		if (isArmstrong(n))
			System.out.println(n + " is an Armstrong Number!");
		else
			System.out.println(n + " is NOT an Armstrong Number!");
		sc.close();
	}

	public static boolean isArmstrong(int n) {
		int originalNum = n;
		int sum = 0;
		int count = getCount(n);
		while (n > 0) {
			int rem = n % 10; // Remainder
			sum = sum + getPower(rem, count);
			n = n / 10;
		}
		return sum == originalNum;
	}

	public static int getCount(int n) {
		int cnt = 0;
		while (n > 0) {
			cnt++;
			n = n / 10;
		}
		return cnt;
	}

	public static int getPower(int a, int b) {
		int pow = 1;
		for (int i = 1; i <= b; i++) {
			pow = pow * a;
		}
		return pow;
	}
}