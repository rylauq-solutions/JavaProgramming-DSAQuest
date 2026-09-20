package array_programming;

import java.util.Scanner;

public class Program04 {
	// TODO: To print and count all the three digit numbers of the array
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of elements: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the Number " + (i + 1) + ": ");
			a[i] = sc.nextInt();
		}
		System.out.print("\n3 digit numbers are: ");
		int count = getThreeDigitNumbers(a);
		System.out.print("\nNumber of 3 digit numbers are: " + count);
		sc.close();
	}

	public static int getThreeDigitNumbers(int[] arr) {
		int count = 0;
		for (int x : arr) {
			if (x >= 100 && x <= 999) {
				System.out.print(x + " ");
				count++;
			}
		}
		return count;
	}
}