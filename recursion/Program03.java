package recursion;

import java.util.Scanner;

public class Program03 {
	// TODO: Print sum of numbers from 1 to n
	static int counter = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range: ");
		int n = sc.nextInt();
		int sum = getSum(n);
		System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
		sc.close();
	}

	public static int getSum(int n) {
		counter++;
		if (counter >= n)
			return n;
		return counter + getSum(n);
	}
}