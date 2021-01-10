package HackerRanks;

import java.util.Arrays;

public class BeautifulTriplets {

	public static void main(String[] args) {

		int[] arr = { 1, 6, 7, 7, 8, 10, 12, 13, 14, 19 };
		System.out.println(qwe(arr, 3));

	}
	// 41107102209
	// 41107102139

	public static int qwe(int[] arr, int d) {

		Arrays.sort(arr);

		int count = 0;
		int var = 0;
		for (int i = 0; i < arr.length; i++) {
			var = 0;
			if (i != 0 && arr[i] == arr[i - 1]) {
				continue;
			}
			int i2 = arr[i] + d;
			int i3 = arr[i] + 2 * d;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == i2 || arr[j] == i3) {

					var++;

				}
			}
			if (var == 2) {
				count++;
			}
		}
		return count;

	}

}
