package number_programming;

import java.util.Scanner;

class Program13 {
	// TODO: Dissarium Number in a Range
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range: ");
		int n = sc.nextInt();
		int count = 0;
		System.out.println("Dissarium Numbers from 1 to " + n + " are:");
		for (int i = 1; i <= n; i++) {
			if (isDissarium(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Count of Dissarium Numbers from 1 to " + n + " is: " + count);
		sc.close();
	}

	public static boolean isDissarium(int n) {
		int originalNum = n;
		int sum = 0;
		int count = getCount(n);
		while (n > 0) {
			int rem = n % 10;
			sum = sum + getPower(rem, count);
			n = n / 10;
			count--;
		}
		return sum == originalNum;
	}

	public static int getPower(int a, int b) {
		int pow = 1;
		for (int i = 1; i <= b; i++) {
			pow = pow * a;
		}
		return pow;
	}

	public static int getCount(int n) {
		int cnt = 0;
		while (n > 0) {
			cnt++;
			n = n / 10;
		}
		return cnt;
	}
}