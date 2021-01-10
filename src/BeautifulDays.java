package HackerRanks;

public class BeautifulDays {

	public static void main(String[] args) {

		int str = qwe(20, 23, 6);
		System.out.println(str);

	}

	public static int qwe(int si, int ei, int div) {

		int count = 0;
		for (int i = si; i <= ei; i++) {
			int rev = reverse(i);
			int diff = rev - i;
			if (diff < 0) {
				diff *= -1;
			}
			if (diff % div == 0) {
				count++;
			}
		}
		return count;
	}

	public static int reverse(int n) {

		int temp = n;
		int count = 0;
		while (temp != 0) {
			int rem = temp % 10;
			count++;
			temp /= 10;
		}

		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			sum = sum + rem * (int) Math.pow(10, count - 1);
			count--;
			n /= 10;
		}

		return sum;
	}
}
