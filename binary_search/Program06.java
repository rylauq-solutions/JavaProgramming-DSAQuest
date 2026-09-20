package binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class Program06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter element to search: ");
		int target = sc.nextInt();

		int[] a = { 10, 11, 12, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(a));
		if (getElementIndex(a, target) != -1)
			System.out.println("\nElement " + target + " is at index: " + getElementIndex(a, target));
		else
			System.out.println("\nElement " + target + " is NOT present in the array!");

		sc.close();
	}

	public static int getElementIndex(int[] a, int target) {
		int low = 0;
		int high = a.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (a[mid] == target)
				return mid;
			if (a[mid] < a[high]) {
				if (a[mid] < target && target <= a[high])
					low = mid + 1;
				else
					high = mid - 1;
			} else {
				if (a[mid] > target && target > a[low])
					high = mid - 1;
				else
					low = mid + 1;
			}
		}
		return -1;
	}
}
