package number_programming;

import java.util.Scanner;

class Program17_a {
	/*
	 * TODO: Fascinating Number or Not? Number whose concatenation with (2*number)
	 * and (3*number) contains all the digits from 1 to 9 exactly once.
	 * In this program, we use Brute Force Approach.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		if (isFascinating(n))
			System.out.println(n + " is Fascinating Number!");
		else
			System.out.println(n + " is NOT Fascinating Number!");
		sc.close();
	}

	public static boolean isFascinating(int n) {
		String str = n + "" + 2 * n + "" + 3 * n;
		for (char i = '1'; i <= '9'; i++) {
			int j;
			for (j = 0; j < str.length(); j++) {
				if (str.charAt(j) == i)
					break;
			}
			if (j == str.length())
				return false;
		}
		return true;
	}
}