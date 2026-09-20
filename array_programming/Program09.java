package array_programming;

import java.util.Scanner;

public class Program09 {
	// TODO: To print each element of the array in reverse order
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of elements: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the Number " + (i + 1) + ": ");
			a[i] = sc.nextInt();
		}

		System.out.println("\nElements in reverse order are:");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
		sc.close();
	}
}
