package number_programming;

import java.util.Scanner;

class Program12 {
	/*
	 * TODO: Dissarium Number or Not? When the sum of digits raised to the power of
	 * their respective positions is equal to the number itself. Ex-89, 135
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		if (isDissarium(n))
			System.out.println(n + " is a Dissarium Number!");
		else
			System.out.println(n + " is NOT a Dissarium Number!");
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