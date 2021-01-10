package HackerRanks;

import java.util.ArrayList;

public class BonAppetit {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(3);
		list.add(10);
		list.add(2);
		list.add(9);
		BonAppetit(list, 1, 12);

	}

	public static void BonAppetit(ArrayList<Integer> list, int idx, int k) {

		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum = sum + list.get(i);
		}

		int temp = sum;
		int sum2 = temp / 2;
		int sum1 = (sum - list.get(idx)) / 2;

		if (k > sum1) {
			System.out.println(sum2 - sum1);
		} else {
			System.out.println("Bon Appetit");
		}

	}
}
