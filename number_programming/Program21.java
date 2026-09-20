package number_programming;

import java.util.Scanner;

class Program21 {
	public static void main(String[] args) {
		// TODO: Swapping the numbers using a 3rd Variable
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Value of a: ");
		int a = sc.nextInt();
		System.out.print("Enter the Value of b: ");
		int b = sc.nextInt();
		int temp = a;
		a = b;
		b = temp;
		System.out.println("\n<=====After Swapping using 3rd Variable=====>\n");
		System.out.println("The Value of a: " + a);
		System.out.println("The Value of b: " + b);
		sc.close();
	}
}