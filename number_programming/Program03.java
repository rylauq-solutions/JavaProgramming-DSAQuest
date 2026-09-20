package number_programming;
import java.util.Scanner;

class Program03 {
	//todo: Prime Number or Not?
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		if (isPrime(n))
			System.out.println(n+" is a Prime Number!");
		else
			System.out.println(n+" is NOT a Prime Number!");
		sc.close();
	}

	public static boolean isPrime(int n) {
		if (n<2)	return false;
		for(int i=2; i*i<=n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}