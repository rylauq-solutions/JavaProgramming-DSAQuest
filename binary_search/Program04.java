package binary_search;

import java.util.Scanner;

public class Program04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to find its nearest root: ");
		int n = sc.nextInt();
		System.out.println(getSquareRoot(n));
		
		sc.close();
	}

	public static int getSquareRoot(int n) {
		int low = 1;
		int high = n;
		int ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int square = mid * mid;
			if (square == n) {
				return mid;
			} else if (square > n)
				high = mid - 1;
			else {
				low = mid + 1;
				ans = mid;
			}
		}
		return ans;
	}
}
