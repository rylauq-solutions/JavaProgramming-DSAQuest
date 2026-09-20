package recursion;

import java.util.Scanner;

public class Program12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the term number: ");
		int n = sc.nextInt();

		System.out.println("Term " + n + " of Fibonacci Series is: " + getFiboTerm(n));
		sc.close();
	}

	public static int getFiboTerm(int n) {
		if (n == 0 || n == 1)
			return n;

		return (getFiboTerm(n - 1) + getFiboTerm(n - 2));
	}
}