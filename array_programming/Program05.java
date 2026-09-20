package array_programming;

import java.util.Scanner;

public class Program05 {
	// TODO: To print sum and average of all the elements of array
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of elements: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the Number " + (i + 1) + ": ");
			a[i] = sc.nextInt();
		}
		int sum = getSumOfElements(a);
		System.out.println("\nSum of numbers of Array is: " + sum);
		System.out.println("Average of numbers of Array is: " + sum / (double) a.length);
		sc.close();
	}

	public static int getSumOfElements(int[] arr) {
		int sum = 0;
		for (int x : arr)
			sum += x;

		return sum;
	}
}