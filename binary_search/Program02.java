package binary_search;

import java.util.Scanner;

public class Program02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter element to search: ");
		int target = sc.nextInt();

		int[] a = { 5, 5, 5, 5, 6, 6, 8, 9, 9, 9 };
		int ans = firstOccurence(a, target);
		if (ans != -1)
			System.out.println("\nThe first occurence index of " + target + " is: " + ans);
		else
			System.out.println(target + " is NOT present in the array!");

		sc.close();
	}

	public static int firstOccurence(int[] a, int target) {
		int low = 0;
		int high = a.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (a[mid] == target) {
				ans = mid;
				high = mid - 1;
			} else if (a[mid] < target)
				low = mid + 1;
			else
				high = mid + 1;
		}
		return ans;
	}
}