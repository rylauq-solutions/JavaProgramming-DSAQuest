package array_programming;

import java.util.Arrays;

public class Program13_a {
	public static void main(String[] args) {
		// TODO: Sorting even and odd elements of Array, any Order
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0 };
		sortEvenOdd(a);
		System.out.println(Arrays.toString(a));
	}

	public static void sortEvenOdd(int[] a) {
		int left = 0;
		int right = a.length - 1;

		while (left <= right) {
			if (a[right] % 2 == 1)
				right--;

			if (a[right] % 2 == 0 && a[left] % 2 == 1) {
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				right--;
			}

			left++;
		}
	}
}