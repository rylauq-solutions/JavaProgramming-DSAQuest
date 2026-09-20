package number_programming;

import java.util.Scanner;

class Program11 {
	// TODO: Perfect Numbers in a Range
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range: ");
		int n = sc.nextInt();
		int count = 0;
		System.out.println("Perfect Numbers from 1 to " + n + " are: ");
		for (int i = 1; i <= n; i++) {
			if (isPerfect(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Count of Perfect Numbers from 1 to " + n + " is: " + count);
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