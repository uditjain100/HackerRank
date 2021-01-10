package HackerRanks;

public class HurdleRace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int hurdleRace(int k, int[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (k < arr[i]) {
				count += arr[i] - k;
				k = arr[i];
			}

		}
		return count;
	}

}
