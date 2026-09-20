package array_programming;

import java.util.Arrays;
import java.util.Scanner;

public class Program11 {
	// TODO: To swap two index values of the array
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of elements: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the Number " + (i + 1) + ": ");
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));

		System.out.print("\nEnter first index to swap: ");
		int firstIdx = sc.nextInt();
		System.out.print("Enter second index to swap: ");
		int secondIdx = sc.nextInt();

		if (firstIdx < 0 || secondIdx >= a.length) {
			System.out.println("Index out of Range!");
			System.out.println(Arrays.toString(a));
		} else
			System.out.println(Arrays.toString(swapIndices(a, firstIdx, secondIdx)));
		
		sc.close();
	}

	public static int[] swapIndices(int[] a, int firstIdx, int secondIdx) {
		int temp = a[firstIdx];
		a[firstIdx] = a[secondIdx];
		a[secondIdx] = temp;

		return a;
	}
}