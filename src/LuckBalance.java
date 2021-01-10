package HackerRanks;

import java.util.ArrayList;
import java.util.Collections;

public class LuckBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 5, 1 }, { 2, 1 }, { 1, 1 }, { 8, 1 }, { 10, 0 }, { 5, 0 } };
		luck(0, arr);
	}

	public static void luck(int k, int[][] arr) {

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][1] == 1) {
				list.add(arr[i][0]);
			}
		}

		Collections.sort(list);
		int sum = 0;
		int count = 1;
		if (k != 0) {
			for (int i = list.size() - 1; i >= 0; i--) {
				sum += list.get(i);
				if (count == k) {
					break;
				}
				count++;
			}
		}
		for (int i = list.size() - k - 1; i >= 0; i--) {
			sum -= list.get(i);
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i][1] == 0) {
				sum += arr[i][0];
			}

		}

		System.out.println(sum);

	}

}
