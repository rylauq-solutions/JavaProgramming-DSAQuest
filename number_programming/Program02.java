package number_programming;

class Program02 {
	// todo: Armstrong Number in range 1 to 1000
	public static void main(String[] args) {
		int cnt = 0;
		System.out.println("Armstrong Numbers from 1 to 1000 are: ");
		for (int i = 1; i <= 1000; i++) {
			if (isArmstrong(i)) {
				cnt++;
				System.out.println(i);
			}
		}
		System.out.println("Count of Armstrong Numbers from 1 to 100 are: " + cnt);
	}

	public static boolean isArmstrong(int n) {
		int originalNum = n;
		int sum = 0;
		int count = getCount(n);
		while (n > 0) {
			int rem = n % 10; // Remainder
			sum = sum + getPower(rem, count);
			n = n / 10;
		}
		return sum == originalNum;
	}

	public static int getCount(int n) {
		int cnt = 0;
		while (n > 0) {
			cnt++;
			n = n / 10;
		}
		return cnt;
	}

	public static int getPower(int a, int b) {
		int pow = 1;
		for (int i = 1; i <= b; i++) {
			pow = pow * a;
		}
		return pow;
	}
}