package HackerRanks;

import java.util.Scanner;

public class Kangaroo {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		String a = AaO(0, 2, 5, 3);
		System.out.println(a);
	}

	public static String AaO(int x1, int v1, int x2, int v2) {

		int var = 0;
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			int a1 = x1 + i * v1;
			int a2 = x2 + i * v2;
			if (a1 == a2) {
				var = 1;
				break;
			}
		}
		if (var == 0) {
			return "NO";
		} else {
			return "YES";
		}

	}
}
