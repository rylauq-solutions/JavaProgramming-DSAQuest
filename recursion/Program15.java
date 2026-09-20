package recursion;

import java.util.Scanner;

public class Program15 {
	// TODO: Printing LCM of 3 numbers.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int n1 = sc.nextInt();

		System.out.print("Enter second number: ");
		int n2 = sc.nextInt();

		System.out.print("Enter third number: ");
		int n3 = sc.nextInt();

		System.out.println("LCM of " + n1 + ", " + n2 + " & " + n3 + " is: " + getLCM(n1, getLCM(n2, n3)));

		sc.close();
	}

	public static int getLCM(int a, int b) {
		return (a * b) / getGCD(a, b);
	}

	public static int getGCD(int a, int b) {
		if (b == 0)
			return a;

		return getGCD(b, a % b);
	}
}