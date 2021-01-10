package HackerRanks;

import java.util.ArrayList;
import java.util.Collections;

public class BetweenTwoSets {
	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();
		a.add(2);
		a.add(6);
		ArrayList<Integer> b = new ArrayList<>();
		b.add(24);
		b.add(36);
		int c = AaO(a, b);
		System.out.println(c);

	}

	public static int AaO(ArrayList<Integer> a, ArrayList<Integer> b) {

		int min = Collections.max(a);
		int max = Collections.max(b);
		int count = 0;
		
		for (int i = min; i <= max; i++) {
			int count1 = 0;
			int count2 = 0;
			for (int j = 0; j < a.size(); j++) {
				if (i % a.get(j) == 0) {
					count1++;
				}
			}
			for (int j = 0; j < b.size(); j++) {
				if (b.get(j) % i == 0) {
					count2++;
				}
			}
			if (count1 == a.size() && count2 == b.size()) {
				count++;
			}
		}
		return count;

	}
}
