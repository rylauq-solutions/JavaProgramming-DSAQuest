package binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class Program07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter element to search: ");
		int target = sc.nextInt();

		int[] a = { 3, 3, 3, 3, 3, 1, 3, 3, 3, 3 };
		System.out.println(Arrays.toString(a));
		if (getElementIndex(a, target))
			System.out.println("\nElement " + target + " is present in the array!");
		else
			System.out.println("\nElement " + target + " is NOT present in the array!");

		sc.close();
	}

	public static boolean getElementIndex(int[] a, int target) {
		int low = 0;
		int high = a.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (a[mid] == target)
				return true;
			else if (a[low] == a[mid] && a[mid] == a[high]) {
				low++;
				high--;
			} else if (a[mid] <= a[high]) {
				if (a[mid] < target && target <= a[high])
					low = mid + 1;
				else
					high = mid - 1;
			} else {
				if (a[mid] > target && target >= a[low])
					high = mid - 1;
				else
					low = mid + 1;
			}
		}
		return false;
	}
}
