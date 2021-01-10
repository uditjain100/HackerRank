package HackerRanks;

public class KaprekarNumber {

	public static void main(String[] args) {

		qwe(77778, 77778);

	}
	// 41107102209
	// 41107102139

	public static void qwe(int p, int q) {

		int count = 0;
		if (p == q) {
			if (rkn(p)) {
				System.out.println(p);
			} else {
				System.out.println("INVALID RANGE");
			}
		} else {
			for (int i = p; i <= q; i++) {
				if (i == 0) {
					count++;
				} else if (i == 1) {
					System.out.println(i);
				} else if (rkn(i)) {
					System.out.println(i);
				} else {
					count++;
				}
			}
		}
		if (count == q - p + 1) {
			System.out.println("INVALID RANGE");
		}

	}

	public static boolean rkn(long n) {

		long sq = n * n;
		System.out.println(sq);
		long temp = sq;
		int count = 0;
		while (temp != 0) {
			count++;
			temp /= 10;
		}
		int splitn = 0;
		if (count % 2 == 0) {
			splitn = count / 2;
		} else {
			splitn = (count / 2) + 1;
		}
		System.out.println(count + "  " + splitn);
		long rem = sq % (long) Math.pow(10, splitn);
		long quo = sq / (long) Math.pow(10, splitn);

		long sum = rem + quo;

		if (sum == n) {
			return true;
		}
		return false;

	}

}
