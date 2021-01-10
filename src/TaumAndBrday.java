package HackerRanks;

public class TaumAndBrday {

	public static void main(String[] args) {

		System.out.println(qwe(42899452, 58539299, 832193, 584380, 655132));

	}
	// 41107102209
	// 41107102139

	public static long qwe(long b, long w, long bc, long wc, long z) {

		long p = 0;
		if (bc > wc + z) {

			p = (b + w) * wc;
			p += b * z;

		} else if (wc > bc + z) {

			p = (b + w) * bc;
			p += w * z;

		} else if (bc <= wc + z || wc <= bc + z) {

			p += b * bc;
			p += w * wc;

		}

		return p;

	}

}
