package number_programming;

import java.util.Scanner;

class Program18 {
	// TODO: Fascinating Numbers in a Range
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range: ");
		int n = sc.nextInt();
		int count = 0;
		System.out.println("Fascinating Numbers from 1 to " + n + " are: ");
		for (int i = 0; i < n; i++) {
			if (isFascinating(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Count of Fascinating Numbers from 1 to " + n + " is: " + count);
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