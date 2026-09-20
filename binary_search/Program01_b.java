package binary_search;

import java.util.Scanner;

public class Program01_b {
	// TODO: Binary Search using Recursive Approach
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter element to search: ");
		int target = sc.nextInt();

		int[] a = { 10, 25, 40, 45, 68, 72, 88, 90, 105 };
		if (checkElementBS(a, 0, a.length - 1, target))
			System.out.println(target + " is present in the array!");
		else
			System.out.println(target + " is NOT present in the array!");

		sc.close();
	}

	public static boolean checkElementBS(int[] a, int low, int high, int target) {
		int mid = low + (high - low) / 2;
		if (low > high)
			return false;
		if (a[mid] == target)
			return true;
		else if (a[mid] > target)
			return checkElementBS(a, low, mid - 1, target);
		else
			return checkElementBS(a, mid + 1, high, target);
	}
}