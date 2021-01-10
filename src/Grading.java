package HackerRanks;

import java.util.ArrayList;
import java.util.Scanner;

public class Grading {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(22);
		arr.add(86);
		arr.add(30);
		arr.add(0);
		ArrayList<Integer> ans = Grading(arr);
		System.out.println(ans);
	}

	public static ArrayList<Integer> Grading(ArrayList<Integer> arr) {

		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i < arr.size(); i++) {

			int var1 = arr.get(i);
			int a = var1 / 5;
			int b = (a + 1) * 5;
			if (arr.get(i) > 40) {
				if ((b - arr.get(i)) < 3) {
					ans.add(b);
				} else {
					ans.add(arr.get(i));
				}
			} else if (arr.get(i) == 38 || arr.get(i) == 39 || arr.get(i) == 40) {
				ans.add(40);
			} else {
				ans.add(arr.get(i));
			}

		}
		return ans;
	}
}