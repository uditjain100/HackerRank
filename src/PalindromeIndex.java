package HackerRanks;

public class PalindromeIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reca("aaaaaaa"));
	}

	public static int reca(String str) {

		if (ispalindrome(str)) {
			return -1;
		}
		int ans = 0;

		if (ispalindromeright(str)) {
			ans = ispalindromerightans(str);
		} else if (ispalindromeleft(str)) {
			ans = ispalindromeleftans(str);
		}

		return ans;

	}

	public static boolean ispalindromeright(String str) {

		int i = 0;
		int j = str.length() - 1;
		int var1 = 0;

		while (i <= j) {
			if (str.charAt(i) != str.charAt(j)) {
				if (var1 == 0) {
					j--;
					var1 = 1;
				} else if (var1 == 1 || var1 == 2) {
					return false;
				}
			}
			if (var1 == 0) {
				i++;
				j--;
			} else if (var1 == 1) {
				var1 = 2;
			} else if (var1 == 2) {
				i++;
				j--;
			}
		}
		return true;
	}

	public static int ispalindromerightans(String str) {

		int i = 0;
		int j = str.length() - 1;
		int var1 = 0;
		int idx = 0;

		while (i <= j) {
			if (str.charAt(i) != str.charAt(j)) {
				if (var1 == 0) {
					idx = j;
					j--;
					var1 = 1;
				} else if (var1 == 1 || var1 == 2) {
					break;
				}
			}
			if (var1 == 0) {
				i++;
				j--;
			} else if (var1 == 1) {
				var1 = 2;
			} else if (var1 == 2) {
				i++;
				j--;
			}
		}
		return idx;
	}

	public static boolean ispalindromeleft(String str) {

		int i = 0;
		int j = str.length() - 1;
		int var1 = 0;

		while (i <= j) {
			if (str.charAt(i) != str.charAt(j)) {
				if (var1 == 0) {
					i++;
					var1 = 1;
				} else if (var1 == 1 || var1 == 2) {
					return false;
				}
			}
			if (var1 == 0) {
				i++;
				j--;
			} else if (var1 == 1) {
				var1 = 2;
			} else if (var1 == 2) {
				i++;
				j--;
			}
		}
		return true;
	}

	public static int ispalindromeleftans(String str) {

		int i = 0;
		int j = str.length() - 1;
		int var1 = 0;
		int idx = 0;

		while (i <= j) {
			if (str.charAt(i) != str.charAt(j)) {
				if (var1 == 0) {
					idx = i;
					i++;
					var1 = 1;
				} else if (var1 == 1 || var1 == 2) {
					break;
				}
			}
			if (var1 == 0) {
				i++;
				j--;
			} else if (var1 == 1) {
				var1 = 2;
			} else if (var1 == 2) {
				i++;
				j--;
			}
		}
		return idx;
	}

	public static boolean ispalindrome(String str) {

		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}
}
