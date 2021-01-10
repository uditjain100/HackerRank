package HackerRanks;

public class ElectornicShop {
	public static void main(String[] args) {

		int[] arr1 = { 4 };
		int[] arr2 = { 5 };
		int a = elshop(arr1, arr2, 5);
		System.out.println(a);

	}

	public static int elshop(int[] key, int[] usb, int b) {

		int sum = 0;
		int maxsum = 0;
		for (int i = 0; i < key.length; i++) {
			for (int j = 0; j < usb.length; j++) {
				if (key[i] + usb[j] <= b) {
					sum = key[i] + usb[j];
				}
				if (maxsum < sum) {
					maxsum = sum;
				}
			}
		}
		if (maxsum != 0) {
			return maxsum;
		} else {
			return -1;
		}

	}
}
