package collection_framework;

import java.util.*;

public class Program19_a {
	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<>();
		Collection<Integer> c2 = new ArrayList<>();
		Collection<Integer> commonElements = new ArrayList<>();
		c1.add(220);
		c1.add(200);
		c1.add(200);
		c1.add(560);
		c1.add(400);
		c1.add(500);
		c1.add(500);

		c2.add(202);
		c2.add(200);
		c2.add(200);
		c2.add(506);
		c2.add(400);
		c2.add(500);
		c2.add(530);

		commonElements = getCommonElements(c1, c2);
		System.out.println(commonElements);
	}

	public static Collection<Integer> getCommonElements(Collection<Integer> c1, Collection<Integer> c2) {
		Collection<Integer> ans = new ArrayList<>();

		Iterator<Integer> itr = c1.iterator();
		while (itr.hasNext()) {
			int ele = itr.next();
			if (c2.contains(ele) && (!ans.contains(ele)))
				ans.add(ele);
		}

		return ans;
	}
}