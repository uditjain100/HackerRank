package HackerRanks;

import java.util.Arrays;

public class AbsoluteDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, -7, 0 };
		System.out.println(minad2(arr));
	}

	public static int minad(int[] arr) {

		int min = 0;
		int var = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int diff = arr[j] - arr[i];
				if (diff < 0) {
					diff = diff * (-1);
				}
				if (var == 0) {
					min = diff;
					var = 1;
				}
				if (min > diff) {
					min = diff;
				}
			}
		}
		return min;
	}

	public static int minad2(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				arr[i] = arr[i] * (-1);
			}
		}

		Arrays.sort(arr);
		int min = 0;
		int var = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int diff = arr[i + 1] - arr[i];
			if (var == 0) {
				min = diff;
				var = 1;
			}
			if (min > diff) {
				min = diff;
			}

		}
		return min;
	}

}
