package number_programming;

import java.util.Scanner;

class Program10 {
	/*
	 * TODO: Perfect Number or NOT? Numbers whose sum of factors except itself is
	 * equal to the number itself.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		if (isPerfect(n))
			System.out.println(n + " is a Perfect Number!");
		else
			System.out.println(n + " is NOT a Perfect Number!");
		sc.close();
	}

	public static boolean isPerfect(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		return n == sum;
	}
}
