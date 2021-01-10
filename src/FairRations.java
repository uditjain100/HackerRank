package HackerRanks;

import java.util.ArrayList;

public class FairRations {

	static ArrayList<String> list = new ArrayList<>();

	public static void main(String[] args) {

		System.out.println(fairRations("baab"));

	}

	public static String fairRations(String str) {

		while (!isright(str)) {

			for (int i = 0; i < str.length() - 1;) {
				System.out.println(str);
				if (str.charAt(i) == str.charAt(i + 1)) {
					str = str.substring(0, i) + str.substring(i + 2);
				} else {
					i++;
				}
			}
		}
		if (str.length() == 0) {
			return "Empty String";
		} else {
			return str;
		}
	}

	public static boolean isright(String str) {

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				return false;
			}
		}
		return true;

	}

}
