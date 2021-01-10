package HackerRanks;

public class DivisibleSumPairs {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,3,2,6,1,2} ;
		System.out.println(chocolate(arr, 6, 3));

	}

	public static int chocolate(int[] arr, int n, int k) {

		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((arr[i] + arr[j]) % k == 0) {
					count++;
				}
			}
		}
		return count;
	}
}
