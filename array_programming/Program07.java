package array_programming;

import java.util.Scanner;

public class Program07 {
	// TODO: To print and count all the Strings which has even number of characters
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of elements: ");
		int size = sc.nextInt();
		sc.nextLine(); // ! It accepts backslash or null value while inputting String, so to avoid this
		String[] s = new String[size];
		for (int i = 0; i < s.length; i++) {
			System.out.print("Enter the String " + (i + 1) + ": ");
			s[i] = sc.nextLine();
		}
		getEvenCharacterString(s);
		sc.close();
	}

	public static void getEvenCharacterString(String[] arr) {
		int count = 0;
		System.out.println("\nStrings with even number of characters: ");
		for (String x : arr) {
			if (x.length() % 2 == 0) {
				count++;
				System.out.println(x + " ");
			}
		}
		System.out.println("Count of Strings with even number of characters: " + count);
	}
}