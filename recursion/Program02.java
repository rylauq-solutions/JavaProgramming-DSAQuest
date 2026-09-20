package recursion;

import java.util.Scanner;

public class Program02 {
	// TODO: Printing table
	static int counter = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		getTable(n);
		sc.close();
	}

	public static void getTable(int n) {
		if (counter > 10)
			return;
		System.out.println(n + " * " + counter + " = " + n * counter);
		counter++;
		getTable(n);
	}
}