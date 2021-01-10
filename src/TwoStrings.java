package HackerRanks;

import java.math.BigInteger;
import java.util.ArrayList;

public class TwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(ts("asvkugfiugsalddlasguifgukvsa"));
	}

	public static int ts(String str) {

		ArrayList<ArrayList<String>> list = printSubsets(uc(str));

		String ans = "";
		int len = 0;
		int maxlen = 0;
		for (int i = 0; i < list.size(); i++) {
			ans = cs(str, list.get(i));
			if (isright(ans)) {
				len = ans.length();
				if (maxlen < len) {
					maxlen = len;
					System.out.println(ans);
				}
			}
		}
		if (maxlen == 1 || maxlen == 2) {
			return 0;
		}
		return maxlen;
	}

	public static String cs(String str, ArrayList<String> list) {

		String ans = "";
		for (int i = 0; i < list.size(); i++) {
			ans = "";
			for (int j = 0; j < str.length(); j++) {
				if (!str.substring(j, j + 1).equals(list.get(i))) {
					ans += str.substring(j, j + 1);
				}
			}
			str = ans;
		}
		return ans;
	}

	public static ArrayList<ArrayList<String>> sal(ArrayList<ArrayList<String>> list, String str) {

		ArrayList<ArrayList<String>> ans = new ArrayList<>();

		ArrayList<String> len = uc(str);

		for (int i = 0; i <= len.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j).size() == i) {
					ans.add(list.get(j));
				}
			}

		}
		return ans;

	}

	public static ArrayList<ArrayList<String>> printSubsets(ArrayList<String> list) {

		ArrayList<ArrayList<String>> ans = new ArrayList<>();

		for (int i = 0; i < (1 << list.size()); i++) {

			ArrayList<String> ans1 = new ArrayList<>();

			for (int j = 0; j < list.size(); j++) {
				if ((i & (1 << j)) > 0) {
					ans1.add(list.get(j));
				}
			}

			ans.add(ans1);

		}

		return ans;

	}

	public static ArrayList<String> uc(String str) {

		String tut = "abcdefghijklmnopqrstuvwxyz";

		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < tut.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (tut.charAt(i) == str.charAt(j)) {
					list.add(tut.substring(i, i + 1));
					break;
				}
			}
		}
		return list;
	}

	public static boolean isright(String str) {

		if (str.length() == 0) {
			return false;
		}
		char c1 = 'a';
		char c2 = 'b';

		if (str.length() != 0 && str.length() != 1) {
			c1 = str.charAt(0);
			c2 = str.charAt(1);
			if (c1 == c2) {
				return false;
			}
			for (int i = 0; i < str.length(); i++) {
				if (i % 2 == 0 && str.charAt(i) != c1) {
					return false;
				} else if (i % 2 == 1 && str.charAt(i) != c2) {
					return false;
				}
			}
		}
		return true;
	}

}
