package number_programming;

import java.util.Scanner;

class Program06 {
	// TODO: Prime Numbers in a range where sum of digits is also Prime Number.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range: ");
		int n = sc.nextInt();
		int cnt = 0;
		System.out.println("Prime Numbers from 1 to " + n + " where sum of digits is also Prime Number are:");
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				int sum = getSumDigits(i);
				if (isPrime(sum)) {
					cnt++;
					System.out.println(i);
				}
			}
		}
		System.out.println(
				"Count of Prime Numbers from 1 to " + n + " where sum of digits is also Prime Number is: " + cnt);
		sc.close();
	}

	public static int getSumDigits(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		return sum;
	}

	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}