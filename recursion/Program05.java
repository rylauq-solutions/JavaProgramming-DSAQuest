package recursion;

import java.util.Scanner;

public class Program05 {
	// TODO: Find Factorial of a number using recursion.
	static int counter = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		int fact = getFactorial(n);
		System.out.println("Factorial of " + n + " is: " + fact);
		sc.close();
	}

	public static int getFactorial(int n) {
		counter++;
		if (counter >= n)
			return n;
		return counter * getFactorial(n);
	}
}
