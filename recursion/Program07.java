package recursion;

import java.util.Scanner;

public class Program07 {
	// TODO: Find Count of Digits a number using recursion.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		int count = (n == 0) ? 1 : getCount(n);
		System.out.println("Number of digits in " + n + " is: " + count);
		sc.close();
	}

	public static int getCount(int n) {
		if (n <= 0)
			return 0;
		return 1 + getCount(n / 10);
	}
}