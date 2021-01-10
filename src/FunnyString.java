package HackerRanks;

public class FunnyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fs("bcxz"));

	}

	public static String fs(String str) {

		int[] arr = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			arr[i] = (int) ch;
		}

		int i = 0;
		int j = arr.length - 1;
		while (i <= arr.length - 2 && j > 0) {

			int diff1 = arr[i + 1] - arr[i];
			int diff2 = arr[j] - arr[j - 1];
			int diff3 = (-1) * diff2;
			if (diff1 != diff2 && diff1 != diff3) {
				return "Not Funny";
			}
			i++;
			j--;
		}
		return "Funny";

	}

}
