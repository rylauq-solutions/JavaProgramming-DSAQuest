package array_programming;
import java.util.Scanner;

public class Program08 {
	// TODO: To print the largest string and smallest string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of elements: ");
        int size = sc.nextInt();
        sc.nextLine(); // ! It accepts backslash or null value while inputting String, so to avoid this
        String[] s = new String[size];
        for (int i = 0; i < s.length; i++) {
			System.out.print("Enter the String " + (i + 1) + ": ");
            s[i] = sc.nextLine();
        }
        getLargestSmallestString(s);
        sc.close();
    }

    public static void getLargestSmallestString(String[] arr) {
        String largest = arr[0];
        String smallest = arr[0];
        for (String x : arr) {
            if (x.length() > largest.length())
                largest = x;
            if (x.length() < smallest.length())
                smallest = x;
        }
        System.out.println("\nThe Largest String is: " + largest);
        System.out.println("The Smallest String is: " + smallest);
    }
}