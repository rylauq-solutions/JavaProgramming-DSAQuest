package number_programming;
import java.util.Scanner;

class Program05_a {
	// TODO: Alternate Prime numbers at Odd Positions up to a given range.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range: ");
		int n = sc.nextInt();
		int count = 0;
		System.out.println("Alternate Prime numbers at Odd Positions from 1 to "+n+" are: ");
		for (int i=1; i<=n; i++) {
			if (isPrime(i)) {
				count++;
				if (count%2==1)	// For Alternate Prime Numbers at Odd Positions
					System.out.print(i+" ");
			}
		}
		System.out.println("\n\nTotal count of Prime Numbers from 1 to "+n+" is: "+count);
		sc.close();
	}
	
	public static boolean isPrime(int n) {
		if (n<2)	return false;
		for (int i=2; i*i<=n; i++) {
			if (n%i == 0)
				return false;
		}
		return true;
	}
}