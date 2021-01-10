package HackerRanks;

public class EqualiseTheArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 6, 5 };
		System.out.println(qwe(arr));
	}
	// 41107102209
	// 41107102139

	public static int qwe(int[] arr) {

		int count = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
				}

			}
			count++;
			if (max < count) {
				max = count;
			}
		}

		int ans = arr.length - max;
		return ans;

	}

}
