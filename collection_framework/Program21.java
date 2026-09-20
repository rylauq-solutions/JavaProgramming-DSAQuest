package collection_framework;

import java.util.*;

public class Program21 {
	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> ans;

		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);
		c1.add(15);
		c1.add(50);
		c1.add(5);
		c1.add(35);
		c1.add(25);

		ans = getPartition(c1);
		System.out.println("Sub-List of Odd Integers: " + ans.get(1));
		System.out.println("Sub-List of Even Integers: " + ans.get(0));
	}

	public static ArrayList<ArrayList<Integer>> getPartition(Collection<Integer> c) {
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
		ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
		for (int x : c) {
			if (x % 2 == 0)
				evenNumbers.add(x);
			else
				oddNumbers.add(x);
		}

		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		result.add(evenNumbers);
		result.add(oddNumbers);

		return result;
	}
}