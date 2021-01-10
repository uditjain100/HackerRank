package HackerRanks;

public class AngryTeacher {

	public static void main(String[] args) {

		int[] arr = { -1, -3, 4, 2 };
		String str = tree(3, arr);
		System.out.println(str);

	}

	public static String teacher(int k, int[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 0) {
				count++;
			}
		}
		if (count >= k) {
			return "NO";
		} else {
			return "YES";
		}

	}
}
