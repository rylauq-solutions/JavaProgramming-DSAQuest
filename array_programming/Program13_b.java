package array_programming;

import java.util.Arrays;

public class Program13_b {
	public static void main(String[] args) {
		// TODO: Sorting even and odd elements of Array, maintaining Relative Order
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0 };
		sortEvenOdd(a);
		System.out.println(Arrays.toString(a));
	}

	public static void sortEvenOdd(int[] a) {
		int left = 0, right = 1;

		while (right < a.length) {
			if (a[left] % 2 == 1 && a[right] % 2 == 0) {
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
			}

			if (a[left] % 2 == 0)
				left++;

			right++;
		}
	}
}