package recursion;

import java.util.Scanner;

public class Program13 {
	// TODO: Printing n terms of Fibonacci Series
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of terms: ");
		int n = sc.nextInt();

		System.out.println("Fibonacci Series is: ");
		getFiboSeries(n - 1);

		sc.close();
	}

	public static void getFiboSeries(int i) {
		if (i < 0)
			return;

		getFiboSeries(i - 1);
		System.out.print(getFiboTerm(i) + " ");
	}

	public static int getFiboTerm(int n) {
		if (n == 0 || n == 1)
			return n;

		return (getFiboTerm(n - 1) + getFiboTerm(n - 2));
	}
}