package HackerRanks;

import java.util.ArrayList;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		anagram("kkkk");

	}

	public static void anagram(String str) {

		ArrayList<String> list = getss(str);

		System.out.println(list);

	}

	public static ArrayList<String> getpermutations(String str) {
		if (str.length() == 0) {
			ArrayList<String> xyz = new ArrayList<>();
			xyz.add("");
			return xyz;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> recans = getpermutations(ros);
		ArrayList<String> myres = new ArrayList<>();

		for (String val : recans) {

			for (int i = 0; i <= val.length(); i++) {

				String ans = val.substring(0, i) + ch + val.substring(i);
				myres.add(ans);
			}

		}
		return myres;
	}

	public static ArrayList<String> getss(String str) {
		if (str.length() == 0) {
			ArrayList<String> xyz = new ArrayList<>();
			xyz.add("");
			return xyz;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> recans = getss(ros);
		ArrayList<String> myres = new ArrayList<>();

		for (String i : recans) {
			myres.add(i);
			myres.add(ch + i);

		}
		return myres;
	}

}
