package sorting;

import java.util.Arrays;

public class BubbleSort {
	// TODO: Sorting Array in Ascending/Non-Decreasing Order
	public static void main(String[] args) {
		int[] arr = { 23, 12, 45, 23, 35, 46, 45, 6, 7, 65 };
		System.out.println("Original Array is: " + Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("\n<===After Sorting in Non-Decreasing Order===>\n");
		System.out.println("Sorted Array is: " + Arrays.toString(arr));
	}

	public static void bubbleSort(int[] a) {
		int n = a.length;

		for (int i = 0; i < n-1; i++) { // Number of Passes
			boolean flag = false; // Optimization

			for (int j = 0; j < n - i - 1; j++) { // Comparisons
				if (a[j] > a[j + 1]) { // Swapping
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = true;
				}
			}
			if (flag == false)
				return;
		}
	}
}