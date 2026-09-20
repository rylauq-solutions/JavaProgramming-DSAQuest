package number_programming;

import java.util.Scanner;

public class Program27 {
	// TODO: Converting Decimal Number to Hexadecimal Number
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		String hex = convertDecimalToHexadecimal(n);
		System.out.print("Hexadecimal form of " + n + " is: " + hex);
		sc.close();
	}

	public static String convertDecimalToHexadecimal(int n) {
		String hex = "";
		while (n > 0) {
			int rem = n % 16;
			if (rem < 10) {
				hex = rem + hex;
			} else {
				hex = (char) ('A' + (rem - 10)) + hex; // For digits A-F
			}
			n = n / 16;
		}
		return hex.isEmpty() ? "0" : hex;
	}
}
