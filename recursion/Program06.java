package recursion;

import java.util.Scanner;

public class Program06 {
	// TODO: Find Power of a number using recursion.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int a = sc.nextInt();
		System.out.print("Enter the Power: ");
		int b = sc.nextInt();
		int pow = getPower(a, b);
		System.out.println(a + " raised to power of " + b + " is: " + pow);
		sc.close();
	}

	public static int getPower(int a, int b) {
		if (b <= 1)
			return a;
		return getPower(a, b - 1) * a;
	}
}