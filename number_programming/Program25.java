package number_programming;

import java.util.Scanner;

class Program25 {
	// TODO: Converting Decimal Number to Octal Number
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		String octal = convertDecimalToOctal(n);
		System.out.print("Octal form of " + n + " is: " + octal);
		sc.close();
	}

	public static String convertDecimalToOctal(int n) {
		String oct = "";
		while (n > 0) {
			int rem = n % 8;
			oct = rem + oct;
			n = n / 8;
		}
		return oct;
	}
}
