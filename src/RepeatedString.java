package HackerRanks;

public class RepeatedString {



	public static void main(String[] args) {

		System.out.println(qwe("ceebbcb", 817723));
	}
	// 41107102209
	// 41107102139

	public static long qwe(String str, long k) {

		long rem = k % str.length();
		long count1 = 0;
		for (int i = 0; i < rem; i++) {
			char cc = str.charAt(i);
			if (cc == 'a') {
				count1++;
			}
		}
		long count = 0;
		for (int i = 0; i < str.length(); i++) {

			char cc = str.charAt(i);
			if (cc == 'a') {
				count++;
			}
		}

		long ans = (k / str.length()) * count + count1;
		return ans;

	}


}
