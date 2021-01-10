package HackerRanks;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumberss {

	ArrayList<Long> list = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 7, 2, 5, 3, 5, 3 };
		int[] brr = { 7, 2, 5, 4, 6, 3, 5, 3 };

		int[] ans = missingNumbers(arr, brr);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}

		// 2437 2438 2442 2444 2447 2451 2457 2458 2466 2473 2479 2483 2488 2489 2510
		// 2515 2517 2518

	}

	static int[] missingNumbers(int[] arr, int[] brr) {

		Arrays.sort(arr);
		Arrays.sort(brr);

		int i = 0;
		int j = 0;

		ArrayList<Integer> list = new ArrayList<>();

		while (i < arr.length && j < brr.length) {
			if (arr[i] == brr[j]) {
				i++;
				j++;
			} else {
				if (list.size() == 0) {
					list.add(brr[j]);
				} else if (brr[j] != list.get(list.size() - 1)) {
					list.add(brr[j]);
				}
				j++;
			}

		}
		int[] ans = new int[list.size()];
		for (int k = 0; k < list.size(); k++) {
			ans[k] = list.get(k);
		}
		return ans;
	}

}
