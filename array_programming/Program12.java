package array_programming;

import java.util.Arrays;

public class Program12 {
	public static void main(String[] args) {
		// TODO: Sorting array consisting of 0 and 1 only.
		int[] a = { 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0 };
		sortZerosAndOnes(a);
		System.out.println(Arrays.toString(a));
	}

	public static void sortZerosAndOnes(int[] a) {
		int left = 0, right = a.length - 1;

		while (left <= right) {
			if (a[left] == 1 && a[right] == 0) {
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
				right--;
			}

			if (a[left] == 0)
				left++;

			if (a[right] == 1)
				right--;
		}
	}
}