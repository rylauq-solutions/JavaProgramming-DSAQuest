package sorting;

import java.util.Arrays;

public class SelectionSort {
	// TODO: Sorting Array in Ascending/Non-Decreasing Order
	public static void main(String[] args) {
		int[] arr = { 23, 12, 45, 23, 35, 46, 45, 6, 7, 65 };
		System.out.println("Original Array is: " + Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("\n<===After Sorting in Non-Decreasing Order===>\n");
		System.out.println("Sorted Array is: " + Arrays.toString(arr));
	}

	public static void selectionSort(int[] a) {
		int n = a.length;

		for (int i = 0; i < n; i++) {
			int min_idx = i; // Initializing min-index with current element
			for (int j = i + 1; j < n; j++) { // Iterating over rest of Array
				if (a[min_idx] > a[j]) // If element in rest array is smaller then update min-index
					min_idx = j;
			}
			int temp = a[i]; // Finally swap current element with index of min-element (i.e. min-index)
			a[i] = a[min_idx];
			a[min_idx] = temp;
		}
	}
}
