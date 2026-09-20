package number_programming;

import java.util.Scanner;

public class Program28 {
	// TODO: Converting Hexadecimal Number to Decimal Number
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		String n = sc.nextLine();
		String decimal = convertHexadecimalToDecimal(n);
		System.out.print(decimal);
		sc.close();
	}

	public static String convertHexadecimalToDecimal(String hex) {
		int dec = 0;
		int multiplyBySixteen = 1;

		// Process the hex string from right to left
		for (int i = hex.length() - 1; i >= 0; i--) {
			char ch = hex.charAt(i);
			int value;

			// Convert '0'-'9' -> 0-9 and 'A'-'F' -> 10-15
			if (ch >= '0' && ch <= '9') {
				value = ch - '0';
			} else if (ch >= 'A' && ch <= 'F') {
				value = ch - 'A' + 10;
			} else if (ch >= 'a' && ch <= 'f') {
				value = ch - 'a' + 10;
			} else {
				return "Invalid Input: " + hex + " is not a valid hexadecimal number.";
			}

			dec += value * multiplyBySixteen;
			multiplyBySixteen *= 16;
		}

		return ("Decimal form of " + hex + " is: " + dec);
	}

}
