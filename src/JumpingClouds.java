package HackerRanks;

public class JumpingClouds {

	public static void main(String[] args) {

		int[] arr = { 0, 0, 0, 0, 0, 0 };
		System.out.println(qwe(arr));
	}
	// 41107102209
	// 41107102139

	public static int qwe(int[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length - 2;) {

			if (arr[i + 1] == 1 && arr[i + 2] == 0) {
				count++;
				i += 2;
			} else if (arr[i + 1] == 0 && arr[i + 2] == 1) {
				count++;
				i++;
			} else if (arr[i + 1] == 0 && arr[i + 2] == 0) {
				count++;
				i += 2;
			}
			if (i == arr.length - 2) {
				count++;
			}
			System.out.println(i + " and " + count);
		}
		if (arr.length == 2) {
			count++;
		}

		return count;

	}

}
