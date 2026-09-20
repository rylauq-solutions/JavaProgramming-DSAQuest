package array_programming;
import java.util.Scanner;

public class Program03 {
	// TODO: To count all the even numbers of the array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of elements: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the Number " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        System.out.println("\nEven Elements are:");
        int count = getEvenElements(a);
        System.out.print("\nNumber of Even Elements are: " + count);
        sc.close();
    }

    public static int getEvenElements(int[] arr) {
        int count = 0;
        for (int x : arr) {
            if (x % 2 == 0) {
                System.out.print(x+" ");
                count++;
            }
        }
        return count;
    }
}