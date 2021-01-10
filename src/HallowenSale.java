package HackerRanks;

public class HallowenSale {



	public static void main(String[] args) {

		System.out.println(qwe(100,1,1,99));
	}
	// 41107102209
	// 41107102139

	public static int qwe(int p, int d, int m, int s) {

		int sum = 0;
		int count = 0;
		sum += p;
		if (sum <= s) {
			count = 1;
		}

		while (sum <= s) {
			if (p > m) {
				p = p - d;
			}
			if (p < m) {
				p = m;
			}
			sum += p;
			System.out.println(count + " and " + p + " and " + sum);
			count++;
		}
		return count - 1;

	}


}
