package HackerRanks;

import java.util.ArrayList;

public class PicklingNumbers {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		System.out.println(getss("aaabbbbcccddd"));
		int[] arr = { 5, 9, 7, 8, 12, 5 };
		String[] str = pickingNumbers("aaabbbbcccddd", arr);
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

	public static String[] pickingNumbers(String str, int[] arr) {

		ArrayList<String> a = getss(str);
		// System.out.println(a);
		int[] list = new int[a.size()];
		String[] ans = new String[arr.length];

		for (int i = 0; i < a.size(); i++) {
			String ss = a.get(i);
			int sum = getw(ss);
			list[i] = sum;
		}

		for (int i = 0; i < arr.length; i++) {
			int var = 0;
			for (int j = 0; j < list.length; j++) {
				if (arr[i] == list[j]) {
					var = 1;
					break;
				}
			}
			if (var == 1) {
				ans[i] = "Yes";
			} else {
				ans[i] = "No";
			}
		}
		return ans;

	}

	public static ArrayList<String> getss(String str) {

		ArrayList<String> res = new ArrayList<>();

		for (int i = 0; i < str.length();) {
			int count = 0;
			res.add(str.substring(i, i + 1));
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					res.add(str.substring(i, j + 1));
					count++;
				} else {
					break;
				}
			}
			i += count + 1;
		}
		return res;

	}

	/*
	 * public static int weight(char cc) {
	 * 
	 * String str = "abcdefghijklmnopqrstuvwxyz";
	 * 
	 * for (int i = 0; i < str.length(); i++) { if (cc == str.charAt(i)) { return i
	 * + 1; } } return 0;
	 * 
	 * }
	 */

	public static int weight(char cc) {

		if (cc == 'a') {
			return 1;
		} else if (cc == 'b') {
			return 2;
		} else if (cc == 'c') {
			return 3;
		} else if (cc == 'd') {
			return 4;
		} else if (cc == 'e') {
			return 5;
		} else if (cc == 'f') {
			return 6;
		} else if (cc == 'g') {
			return 7;
		} else if (cc == 'h') {
			return 8;
		} else if (cc == 'i') {
			return 9;
		} else if (cc == 'j') {
			return 10;
		} else if (cc == 'k') {
			return 11;
		} else if (cc == 'l') {
			return 12;
		} else if (cc == 'm') {
			return 13;
		} else if (cc == 'n') {
			return 14;
		} else if (cc == 'o') {
			return 15;
		} else if (cc == 'p') {
			return 16;
		} else if (cc == 'q') {
			return 17;
		} else if (cc == 'r') {
			return 18;
		} else if (cc == 's') {
			return 19;
		} else if (cc == 't') {
			return 20;
		} else if (cc == 'u') {
			return 21;
		} else if (cc == 'v') {
			return 22;
		} else if (cc == 'w') {
			return 23;
		} else if (cc == 'x') {
			return 24;
		} else if (cc == 'y') {
			return 25;
		} else if (cc == 'z') {
			return 26;
		}
		return 0;

	}

	public static int getw(String str) {

		int sum = 0;
		for (int j = 0; j < str.length(); j++) {
			char cc = str.charAt(j);
			sum += weight(cc);
		}
		return sum;
	}

}
