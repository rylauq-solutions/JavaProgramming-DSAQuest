package binary_search;

import java.util.Scanner;

public class Program01_a {
	// TODO: Binary Search using Iterative Approach
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter element to search: ");
		int target = sc.nextInt();

		int[] a = { 10, 25, 40, 45, 68, 72, 88, 90, 105 };
		System.out.println("The index of " + target + " in array is: " + getIndexBS(a, target));
		sc.close();
	}

	public static int getIndexBS(int[] a, int target) {
		int low = 0;
		int high = a.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (a[mid] == target)
				return mid;
			else if (a[mid] > target)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}
}