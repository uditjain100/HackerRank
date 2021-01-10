package HackerRanks;

import java.util.Arrays;

public class MaximumPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1000000000, 1000000000, 1000000000 };
		int[] ans = peri(arr);
		System.out.println(ans[0]);
		System.out.println(ans[1]);
		System.out.println(ans[2]);

	}

	public static int[] peri(int[] arr) {

		Arrays.sort(arr);

		int[] ans = new int[3];
		int[] ans2 = new int[1];
		ans2[0] = -1;

		long peri = 0;
		long maxp = 0;
		int var = 0;
		for (int i = arr.length - 1; i >= 2; i--) {
			int a = arr[i];
			int b = arr[i - 1];
			int c = arr[i - 2];

			if (a + b > c && b + c > a && a + c > b) {
				peri = (long)a + (long)b + (long)c;
				var = 1;
			}
			System.out.println(peri);
			if (maxp < peri) {
				ans[2] = a;
				ans[1] = b;
				ans[0] = c;
				maxp = peri;
			}

		}
		if (var == 0) {
			return ans2;
		}

		return ans;

	}

}
