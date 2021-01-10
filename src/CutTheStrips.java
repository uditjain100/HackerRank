package HackerRanks;

import java.util.ArrayList;
import java.util.Arrays;

public class CutTheStrips {

	public static void main(String[] args) {

		int[] arr = { 4, 5, 10, 8, 11 };
		int[] str = qwe(arr);
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

	}

	public static int[] qwe(int[] arr) {

		Arrays.sort(arr);

		int min = arr[0];
		int count = 0;

		ArrayList<Integer> list = new ArrayList<>();

		while (!tc(arr)) {

			count = 0;

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] >= min) {
					arr[i] = arr[i] - min;
					count++;
				}
			}

			list.add(count);
			min = mn(arr);
		}

		int[] ans = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			ans[i] = list.get(i);
		}

		return ans;

	}

	public static boolean tc(int[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			}
		}
		if (count == arr.length) {
			return true;
		} else {
			return false;
		}
	}

	public static int mn(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				return arr[i];
			}
		}
		return 0;
	}

}
