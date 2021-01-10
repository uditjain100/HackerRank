package HackerRanks;

import java.util.ArrayList;
import java.util.Arrays;

public class MigratoryBirds {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(4);

		int a = birds(list);
		System.out.println(a);
	}

	public static int birds(ArrayList<Integer> list) {

		int[] arr = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}
		Arrays.sort(arr);
		int count = 1;
		int max = 1;
		int ans = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
			} else {
				if (max < count) {
					max = count;
					ans = arr[i];
				}
				count = 1;
			}
		}
		return ans;

	}

}
