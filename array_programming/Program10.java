package array_programming;

import java.util.Scanner;

public class Program10 {
	// TODO: To print alternate element of the array from end
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of elements: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the Number " + (i + 1) + ": ");
			a[i] = sc.nextInt();
		}

		System.out.println("\nAlternate Elements in reverse are:");
		for (int i = a.length - 1; i >= 0; i -= 2) {
			System.out.print(a[i] + " ");
		}
		sc.close();
	}
}
