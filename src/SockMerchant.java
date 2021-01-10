package HackerRanks;

import java.util.Arrays;

public class SockMerchant {
	
	public static void main(String[] args) {

		int[] arr = { 10, 20, 20, 10, 10, 30, 50, 10, 50 };
		int a = sock(9, arr);
		System.out.println(a);
	}

	public static int sock(int n, int[] arr) {

		Arrays.sort(arr);

		int count = 0;
		for (int i = 0; i < n - 1;) {

			if (arr[i] == arr[i + 1]) {
				count++;
				i += 2;
			} else {
				i++;
			}

		}
		return count;

	}
}
