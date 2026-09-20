package array_programming;

import java.util.Scanner;

public class Program06 {
	// TODO: To print the Biggest element, Smallest element and their difference in the array
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of elements: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the Number " + (i + 1) + ": ");
			a[i] = sc.nextInt();
		}
		int[] ans = getBiggestSmallestOfElements(a);
		System.out.println("\nBiggest Number in Array is: " + ans[0]);
		System.out.println("Smallest Number in Array is: " + ans[1]);
		System.out.println("Difference between Biggest Number and Smallest Number is: " + ans[2]);
		sc.close();
	}

	public static int[] getBiggestSmallestOfElements(int[] arr) {
		int biggest = arr[0];
		int smallest = arr[0];
		for (int x : arr) {
			if (x > biggest)
				biggest = x;
			if (x < smallest)
				smallest = x;
		}
		int[] res = { biggest, smallest, (biggest - smallest) };
		return res;
	}
}