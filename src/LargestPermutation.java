package HackerRanks;

public class LargestPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 0, 0, 1, 1 };
		lp(arr, 3);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

	public static void lp(int[] arr, int k) {

		for (int i = 1; i <= k; i++) {

			int[] m = max(arr, i - 1);
			for (int j = 0; j < arr.length; j++) {
				if (j < m[0] && arr[j] != m[1]) {
					int temp = arr[j];
					arr[j] = m[1];
					arr[m[0]] = temp;
					break;
				} else {
					continue;
				}
			}
		}
	}

	public static int[] max(int[] arr, int si) {

		int[] ans = new int[2];
		int var = 0;
		int max = 0;
		int idx = 0;
		for (int i = si; i < arr.length; i++) {

			var = arr[i];
			if (max <= arr[i]) {
				max = arr[i];
				idx = i;
			}

		}
		ans[0] = idx;
		ans[1] = max;
		return ans;

	}
}
