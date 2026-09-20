package recursion;

import java.util.Scanner;

public class Program11 {
	// TODO: Finding biggest of four elements using recursion.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[4];

		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			a[i] = sc.nextInt();
		}

		int mx = getMax(a, 0, Integer.MIN_VALUE);
		System.out.println("Largest element among 4 elements is: " + mx);
		sc.close();
	}

	public static int getMax(int[] a, int idx, int max) {
		if (idx == a.length)
			return max;

		if (a[idx] > max)
			max = a[idx];

		return getMax(a, idx + 1, max);
	}
}
