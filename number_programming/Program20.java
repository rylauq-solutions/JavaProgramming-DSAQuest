package number_programming;

import java.util.Scanner;

class Program20 {
	// TODO: Strong Number in a Range
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range: ");
		int n = sc.nextInt();
		int count = 0;
		System.out.println("Strong Numbers from 1 to " + n + " are: ");
		for (int i = 1; i <= n; i++) {
			if (isStrong(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Count of Strong Numbers from 1 to " + n + " is: " + count);
		sc.close();
	}

	public static boolean isStrong(int n) {
		int originalNum = n;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + getFactorial(rem);
			n = n / 10;
		}
		return sum == originalNum;
	}

	public static int getFactorial(int n) {
		int fact = 1;
		for (int i = n; i > 0; i--) {
			fact = fact * i;
		}
		return fact;
	}
}