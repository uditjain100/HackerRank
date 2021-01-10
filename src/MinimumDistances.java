package HackerRanks;

public class MinimumDistances {

	public static void main(String[] args) {

		int[] arr = { 7, 1, 3, 4, 1, 7 };
		System.out.println(qwe(arr));
	}
	// 41107102209
	// 41107102139

	public static int qwe(int[] arr) {

		int num = 0;
		int minnum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					num = j - i;
				}
				if (minnum == 0) {
					minnum = num;
				}
				if (minnum > num) {
					minnum = num;
				}
			}
		}
		return minnum;

	}

}
