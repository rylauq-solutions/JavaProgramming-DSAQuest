package sorting;

import java.util.Arrays;

public class InsertionSort_Desc {
	// TODO: Sorting Array in Descending/Decreasing Order
	public static void main(String[] args) {
		int[] arr = { 23, 12, 45, 23, 35, 46, 45, 6, 7, 65 };
		System.out.println("Original Array is: " + Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("\n<===After Sorting in Decreasing Order===>\n");
		System.out.println("Sorted Array is: " + Arrays.toString(arr));
	}

	public static void insertionSort(int[] a) {
		int n = a.length;

		for (int i = 1; i < n; i++) {
			int j = i;

			while (j > 0 && a[j] > a[j - 1]) {
				int temp = a[j];
				a[j] = a[j - 1];
				a[j - 1] = temp;
				j--;
			}
		}
	}
}
