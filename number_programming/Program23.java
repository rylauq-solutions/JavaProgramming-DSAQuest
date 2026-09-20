package number_programming;

import java.util.Scanner;

class Program23 {
	// TODO: Converting Decimal Number to Binary Number
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		String binary = convertDecimalToBinary(n);
		System.out.println("Binary form of " + n + " is: " + binary);
		sc.close();
	}

	public static String convertDecimalToBinary(int n) {
		String bin = "";
		while (n > 0) {
			int rem = n % 2;
			bin = rem + bin; // Remainder when divided by 2
			n = n / 2;
		}
		return bin;
	}
}