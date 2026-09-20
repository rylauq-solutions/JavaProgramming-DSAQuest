package sorting;

import java.util.Arrays;

public class SelectionSort_Desc {
	// TODO: Sorting Array in Descending/Decreasing Order
	public static void main(String[] args) {
		int[] arr = { 23, 12, 45, 23, 35, 46, 45, 6, 7, 65 };
		System.out.println("Original Array is: " + Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("\n<===After Sorting in Decreasing Order===>\n");
		System.out.println("Sorted Array is: " + Arrays.toString(arr));
	}

	public static void selectionSort(int[] a) {
		int n = a.length;

		for (int i = 0; i < n; i++) {
			int max_idx = i; // Initializing max-index with current element
			for (int j = i + 1; j < n; j++) { // Iterating over rest of Array
				if (a[max_idx] < a[j]) // If element in rest array is greater, then update max-index
					max_idx = j;
			}
			int temp = a[i]; // Finally swap current element with index of max-element (i.e. max-index)
			a[i] = a[max_idx];
			a[max_idx] = temp;
		}
	}
}
