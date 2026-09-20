package number_programming;

import java.util.Scanner;

class Program19 {
	/*
	 * TODO: Strong Number or Not? A number whose Sum of Factorial of digits is
	 * equal to the number itself is known as Strong Number. Ex: 145
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		if (isStrong(n))
			System.out.println(n + " is a Strong Number!");
		else
			System.out.println(n + " is NOT a Strong Number!");
		sc.close();
	}

	public static boolean isStrong(int n) {
		int originalNum = n;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + getFactorial(rem);
			n = n / 10;
		}
		return sum == originalNum;
	}

	public static int getFactorial(int n) {
		int fact = 1;
		for (int i = n; i > 0; i--) {
			fact = fact * i;
		}
		return fact;
	}
}