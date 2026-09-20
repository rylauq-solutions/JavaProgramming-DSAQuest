package recursion;

import java.util.Scanner;

public class Program14 {
	// TODO: Printing HCF/GCD of 3 numbers.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int n1 = sc.nextInt();

		System.out.print("Enter second number: ");
		int n2 = sc.nextInt();

		System.out.print("Enter third number: ");
		int n3 = sc.nextInt();

		System.out.println("GCD/HCF of " + n1 + ", " + n2 + " & " + n3 + " is: " + getGCD(n1, getGCD(n2, n3)));

		sc.close();
	}

	public static int getGCD(int a, int b) {
		if (b == 0)
			return a;

		return getGCD(b, a % b);
	}
}
