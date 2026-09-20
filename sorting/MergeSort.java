package sorting;

import java.util.Arrays;

public class MergeSort {
	// TODO: Sorting Array in Ascending/Non-Decreasing Order
	public static void main(String[] args) {
		int[] arr = { 23, 12, 45, 23, 35, 46, 45, 6, 7, 65 };
		System.out.println("Original Array is: " + Arrays.toString(arr));
		mergeSort(arr, 0, arr.length - 1);
		System.out.println("\n<===After Sorting in Non-Decreasing Order===>\n");
		System.out.println("Sorted Array is: " + Arrays.toString(arr));
	}

	public static void mergeSort(int[] a, int low, int high) {
		if (low >= high)
			return;

		int mid = low + (high - low) / 2;
		mergeSort(a, low, mid);
		mergeSort(a, mid + 1, high);
		merge(a, low, mid, high);
	}

	public static void merge(int[] a, int low, int mid, int high) {
		int n1 = mid - low + 1;
		int n2 = high - mid;

		int[] arr1 = new int[n1];
		for (int i = 0; i < n1; i++)
			arr1[i] = a[low + i];

		int[] arr2 = new int[n2];
		for (int i = 0; i < n2; i++)
			arr2[i] = a[mid + 1 + i];

		int i = 0, j = 0, k = low;
		while (i < n1 && j < n2) {
			if (arr1[i] < arr2[j])
				a[k++] = arr1[i++];
			else
				a[k++] = arr2[j++];
		}

		while (i < n1)
			a[k++] = arr1[i++];

		while (j < n2)
			a[k++] = arr2[j++];
	}
}