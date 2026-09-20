package number_programming;

import java.util.Scanner;

class Program04 {
	// todo: Prime Numbers in a Range
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range: ");
		int n = sc.nextInt();
		int cnt = 0;
		System.out.println("Prime Numbers from 1 to " + n + " are: ");
		for (int i = 0; i < n; i++) {
			if (isPrime(i)) {
				cnt++;
				System.out.println(i);
			}
		}
		System.out.println("Count of Prime Numbers from 1 to " + n + " are: " + cnt);
		sc.close();
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