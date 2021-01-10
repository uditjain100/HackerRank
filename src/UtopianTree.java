package HackerRanks;

public class UtopianTree {
	public static void main(String[] args) {

		int str = tree(7);
		System.out.println(str);

	}

	public static int tree(int n) {

		int[] arr = new int[n + 1];
		arr[0] = 1;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				arr[i] = 2 * arr[i - 1];
			} else {
				arr[i] = arr[i - 1] + 1;
			}
		}

		return arr[n];
	}
}
