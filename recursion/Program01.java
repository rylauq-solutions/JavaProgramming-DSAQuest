package recursion;
import java.util.Scanner;

public class Program01 {
	static int counter = 1;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Range: ");
		int n = sc.nextInt();
		getNum(n);
		sc.close();
	}

	public static void getNum(int n) {
		if (counter > n)
			return;
		System.out.println("The number is: " + counter);
		counter++;
		getNum(n);
	}
}