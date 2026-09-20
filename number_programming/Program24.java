package number_programming;

import java.util.Scanner;

class Program24 {
	// TODO: Converting Binary Number to Decimal Number
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		String decimal = convertBinaryToDecimal(n);
		System.out.println(decimal);
		sc.close();
	}

	public static String convertBinaryToDecimal(int n) {
		int originalNum = n;
		int dec = 0;
		int multiplyByTwo = 1;
		while (n > 0) {
			int rem = n % 10;
			if (rem > 1)
				return ("Invalid Input");
			dec = dec + rem * multiplyByTwo;
			multiplyByTwo *= 2;
			n = n / 10;
		}
		return ("Decimal form of " + originalNum + " is: " + dec);
	}
}
