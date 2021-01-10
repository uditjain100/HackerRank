package HackerRanks;

import java.util.ArrayList;

public class BirthdayChocolate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(4);

		System.out.println(chocolate(arr, 4, 1));

	}

	public static int chocolate(ArrayList<Integer> arr, int d, int m) {

		int min = Math.min(m, arr.size());
		int count = 0;

		for (int i = 0; i < arr.size() - min + 1; i++) {
			int sum = 0;
			for (int j = i; j < i + min; j++) {
				sum += arr.get(j);
			}
			if (sum == d) {
				count++;
			}

		}
		return count;
	}
}
