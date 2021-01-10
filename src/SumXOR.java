package HackerRanks;

public class SumXOR {
	public static void main(String[] args) {

		long a = sumXor(10);
		System.out.println(a);

	}

	public static long sumXor(long n) {

		long count = 0;
		for (int x = 0; x <= n; x++) {
			long a = sum(n, x);
			long b = binarysum(n, x);
			if (a == b) {
				count++;
			}
		}
		return count;

	}

	public static long binarysum(long a, long b) {

		long c = DecimalToBinary(a);
		long d = DecimalToBinary(b);
		int count = 0;
		long num = 0;
		while (c != 0 || d != 0) {

			long rem1 = c % 10;
			long rem2 = d % 10;
			if (rem1 == rem2) {
				num += 0 * (long) Math.pow(10, count);
			} else {
				num += 1 * (long) Math.pow(10, count);
			}
			count++;
			d /= 10;
			c /= 10;
		}
		long ans = BinaryToDecimal(num);
		return ans;

	}

	public static long DecimalToBinary(long n) {

		long power = 1;
		long binary = 0;

		while (n != 0) {
			long rem = n % 2;

			binary = binary + rem * power;
			power = power * 10;
			n = n / 2;
		}
		return binary;
	}

	public static long BinaryToDecimal(long num) {
		long power = 1;
		long decimal = 0;

		while (num != 0) {
			long rem = num % 10;

			decimal = decimal + rem * power;
			power = power * 2;
			num = num / 10;
		}
		return decimal;

	}

	public static long sum(long a, long b) {

		long sum = a + b;
		return sum;
	}

}
