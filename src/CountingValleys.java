package HackerRanks;

public class CountingValleys {
	public static void main(String[] args) {

		int a = valleys(12, "DDUUDDUDUUUD");
		System.out.println(a);
	}

	public static int valleys(int n, String str) {

		int var = 0;
		int maxvar = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {

			String cc = str.substring(i, i + 1);

			if (cc.equals("U")) {
				var++;
			} else {
				var--;
			}

			if (var < 0) {
				if (maxvar < 0) {
					maxvar = var;
				} else {
					maxvar = var;
					count++;
				}
			} else {
				maxvar = var;
			}

		}
		return count;

	}
}
