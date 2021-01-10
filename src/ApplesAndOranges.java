package HackerRanks;

import java.util.Scanner;

public class ApplesAndOranges {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[] apples = { 2, 3, -4 };
		int[] oranges = { 3, -2, -4 };
		AaO(7, 10, 4, 12, apples, oranges);
	}

	public static void AaO(int s, int t, int a, int b, int[] apples, int[] oranges) {

		int count1 = 0;
		for (int i = 0; i < apples.length; i++) {
			int sum = apples[i] + a;
			System.out.print(sum + " ");
			if (sum >= s && sum <= t) {
				count1++;
			}
		}
		System.out.println(count1);

		int count2 = 0;
		for (int i = 0; i < oranges.length; i++) {
			int sum = oranges[i] + b;
			System.out.print(sum + " ");
			if (sum <= t && sum >= s) {
				count2++;
			}
		}
		System.out.println(count2);
	}
}
