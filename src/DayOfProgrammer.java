package HackerRanks;

public class DayOfProgrammer {
	public static void main(String[] args) {

		System.out.println(DayOfTheProgrammer(1800));

	}

	public static String DayOfTheProgrammer(int year) {

		if (year == 1918) {
			String ans = makestring(year);
			return "26.09." + ans;

		} else if (year >= 1919 && year <= 2700) {
			if (year % 400 == 0) {
				String ans = makestring(year);
				return "12.09." + ans;
			} else if (year % 4 == 0 && year % 100 != 0) {
				String ans = makestring(year);
				return "12.09." + ans;
			} else {
				String ans = makestring(year);
				return "13.09." + ans;
			}
		} else if (year >= 1700 && year <= 1917) {
			if (year % 4 == 0) {
				String ans = makestring(year);
				return "12.09." + ans;
			} else {
				String ans = makestring(year);
				return "13.09." + ans;
			}
		}
		return null;

	}

	public static String makestring(int n) {

		String ans = "";
		while (n != 0) {
			int rem = n % 10;
			String c = charat(rem);
			ans = c + ans;
			n /= 10;
		}

		return ans;
	}

	public static String charat(int n) {

		if (n == 1) {
			return "1";
		} else if (n == 2) {
			return "2";
		} else if (n == 3) {
			return "3";
		} else if (n == 4) {
			return "4";
		} else if (n == 5) {
			return "5";
		} else if (n == 6) {
			return "6";
		} else if (n == 7) {
			return "7";
		} else if (n == 8) {
			return "8";
		} else if (n == 9) {
			return "9";
		} else if (n == 0) {
			return "0";
		}
		return null;

	}

}
