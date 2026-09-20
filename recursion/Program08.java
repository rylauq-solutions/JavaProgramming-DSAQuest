package recursion;

import java.util.Scanner;

public class Program08 {
	// TODO: Calculate Sum of Digits a number using recursion.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		int sum = getSumOfDigits(n);
		System.out.println("Sum of digits in " + n + " is: " + sum);
		sc.close();
	}

	public static int getSumOfDigits(int n) {
		if (n <= 0)
			return 0;
		return (n % 10) + getSumOfDigits(n / 10);
	}
}