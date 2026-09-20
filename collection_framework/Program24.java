package collection_framework;

import java.util.*;

public class Program24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s1 = sc.next();
		if (isValidParenthesis(s1))
			System.out.println("The parenthesis sequence is valid!");
		else
			System.out.println("The parenthesis sequence is NOT valid!");

		sc.close();
	}

	public static boolean isValidParenthesis(String s1) {
		Stack<Character> st = new Stack<Character>();
		String open = "[{(";
		String close = "]})";

		char[] c = s1.toCharArray();
		for (char x : c) {
			if (open.contains(x + "")) { // Checking if 'x' is opening-bracket
				st.push(x);
			}

			else if (close.contains(x + "")) { // Checking if 'x' is Closing-bracket
				if (st.isEmpty()) {
					return false; // Checking if the stack is empty, i.e. no opening-bracket
				}

				// Checking if the open-bracket (top of stack) is pair of close-bracket at 'x'.
				if (open.indexOf(st.pop()) != close.indexOf(x)) {
					return false;
				}
			}
		}

		// If the stack is empty, then all the open-brackets have their close-pair.
		return st.isEmpty();

	}
}