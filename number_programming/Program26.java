package number_programming;

import java.util.Scanner;

class Program26 {
	// TODO: Converting Octal Number to Decimal Number
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		String decimal = convertOctalToDecimal(n);
		System.out.print(decimal);
		sc.close();
	}

	public static String convertOctalToDecimal(int n) {
		int originalNum = n;
		int dec = 0;
		int multiplyByEight = 1;
		while (n > 0) {
			int rem = n % 10;
			if (rem > 8)
				return ("Invalid Input");
			dec = dec + rem * multiplyByEight;
			multiplyByEight *= 8;
			n = n / 10;
		}
		return ("Decimal form of " + originalNum + " is: " + dec);
	}
}
