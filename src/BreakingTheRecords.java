package HackerRanks;

import java.util.Scanner;

public class BreakingTheRecords {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arr = { 3, 4, 21, 36, 10, 28, 35, 5, 24, 42 };
		int[] ans = AaO(arr);
		for (int i : ans) {
			System.out.println(i);
		}

	}

	public static int[] AaO(int[] arr) {

		int[] ans = new int[2];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < arr.length; i++) {

			if (max < arr[i]) {
				max = arr[i];
				count1++;
			}
			if (min > arr[i]) {
				min = arr[i];
				count2++;
			}

		}
		ans[0] = count1 - 1;
		ans[1] = count2 - 1;
		return ans;
	}
}
