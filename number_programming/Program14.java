package number_programming;

import java.util.Scanner;

class Program14 {
	/*
	 * TODO: Happy Number or Not? If the sum of squares of each digit of the number
	 * in a loop till a single digit is 1 or 7, then it is known as Happy Number.
	 * Ex: 19 => (1^2)+(9^2) = 68 => (6^2)+(8^2) = 100 => (1^2)+(0^2)+(0^2) = 1]
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		if (isHappy(n)) {
			System.out.println(n + " is Happy Number!");
		} else {
			System.out.println(n + " is NOT Happy Number!");
		}
		sc.close();
	}

	public static boolean isHappy(int n) {
		while (n > 9) {
			int sum = 0;
			while (n > 0) {
				int rem = n % 10;
				sum = sum + rem * rem;
				n = n / 10;
			}
			n = sum;
		}
		return n == 1 || n == 7;
	}
}