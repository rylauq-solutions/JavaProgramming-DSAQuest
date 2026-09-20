package recursion;

import java.util.Scanner;

public class Program04 {
	// TODO: Print sum of squares of numbers from 1 to n using recursion
	static int counter = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range: ");
		int n = sc.nextInt();
		int sum = getSum(n);
		System.out.println("Sum of squares of numbers from 1 to " + n + " is: " + sum);
		sc.close();
	}

	public static int getSum(int n) {
		counter++;
		if (counter >= n)
			return n*n;
		return (counter * counter) + getSum(n);
	}
}