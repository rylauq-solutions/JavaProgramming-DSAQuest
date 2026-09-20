package binary_search;

import java.util.Arrays;

public class Program05 {
	public static void main(String[] args) {
		int[] a = { 10, 11, 12, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(a));
		System.out.println("\nMinimum element is at index: " + getMinimumElementIndex(a));
	}

	public static int getMinimumElementIndex(int[] a) {
		int low = 0;
		int high = a.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (a[mid] > a[a.length - 1]) {
				low = mid + 1;
			} else if (a[mid] <= a[a.length - 1]) {
				ans = mid;
				high = mid - 1;
			}
		}
		return ans;
	}
}
