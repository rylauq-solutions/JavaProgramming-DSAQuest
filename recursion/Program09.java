package recursion;

import java.util.Scanner;

public class Program09 {
	// TODO: Reverse a positive number using recursion.
	static int rev = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		int rev = getReverseOfNumber(n);
		System.out.println("Reverse of number " + n + " is: " + rev);
		sc.close();
	}

	public static int getReverseOfNumber(int n) {
		if (n <= 0)
			return rev;
		rev = (rev * 10) + (n % 10);
		return getReverseOfNumber(n / 10);
	}
}