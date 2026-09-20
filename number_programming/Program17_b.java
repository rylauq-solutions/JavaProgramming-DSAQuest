package number_programming;

import java.util.Scanner;

class Program17_b {
	/*
	 * TODO: Fascinating Number or Not? Number whose concatenation with (2*number)
	 * and (3*number) contains all the digits from 1 to 9 exactly once.
	 * In this program, we use Optimal Approach of Frequency Array.
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
		int[] freq = new int[10];

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			freq[c - 48]++;
		}

		for (int i = 1; i < freq.length; i++) {
			if (freq[i] != 1)
				return false;
		}
		return true;
	}
}