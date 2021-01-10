package HackerRanks;

import java.util.ArrayList;

public class ACMFinals {

	public static void main(String[] args) {

		String[] arr = { "10101", "11100", "11010", "00101" };
		int[] ans = qwe(arr);
		System.out.println(ans[0]);
		System.out.println(ans[1]);

	}
	// 41107102209
	// 41107102139

	public static int[] qwe(String[] arr) {

		ArrayList<Integer> list = new ArrayList<>();

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			String stri = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				count = 0;
				String strj = arr[j];
				for (int k = 0; k < stri.length(); k++) {
					char ci = stri.charAt(k);
					char cj = strj.charAt(k);
					if (ci == '1' && cj == '1') {
						count++;
					} else if (ci == '0' && cj == '1') {
						count++;
					} else if (ci == '1' && cj == '0') {
						count++;
					}
				}
				list.add(count);
			}

		}

		int num = 0;
		int max = 0;

		for (int i = 0; i < list.size(); i++) {
			num = list.get(i);
			if (max < num) {
				max = num;
			}
		}
		int count2 = 0;
		for (int i = 0; i < list.size(); i++) {

			if (max == list.get(i)) {
				count2++;
			}
		}
		int[] ans = new int[2];
		ans[0] = max;
		ans[1] = count2;
		return ans;

	}

}
