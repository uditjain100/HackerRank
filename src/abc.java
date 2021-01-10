package HackerRanks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class abc {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("aa");
		list.add("aaa");
		list.add("aaaa");
		list.add("aaaaa");
		list.add("aaaaaa");
		list.add("aaaaaaa");
		list.add("aaaaaaaa");
		list.add("aaaaaaaaa");
		list.add("aaaaaaaaaa");
		String pswd = "aaaaaaaaaab";
		String ans = is(list, pswd);
		System.out.println(ans);

	}

	public static String is(ArrayList<String> list, String str) {

		String ans = "";
		for (int i = 0; i < str.length();) {
			for (int j = 0; j < list.size();) {

				String abc = list.get(j);
				String xyz = "";
				if (str.length() - i >= abc.length()) {
					xyz = str.substring(i, abc.length() + i);
					System.out.println(">>>" + i + " and " + ans + " and " + j + " " + xyz + "<<<");
				} else {
					j++;
					continue;
				}
				if (abc.equals(xyz)) {
					ans += abc + " ";
					j = 0;
					i += abc.length();
					System.out.println(">>" + i + " and " + ans + " and " + j + " " + xyz + "<<");
				} else {
					j++;
					System.out.println(">" + i + " and " + ans + " and " + j + " " + xyz + "<");
				}

				if (j == list.size()) {
					return "WRONG PASSWORD";
				}
			}
		}
		ans = ans.substring(0, ans.length());

		return ans;
	}

}
