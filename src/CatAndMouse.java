package HackerRanks;

public class CatAndMouse {

	public static void main(String[] args) {

		String str = cam(4, 5, 3);
		System.out.println(str);

	}

	public static String cam(int x, int y, int z) {

		int a = z - x;
		int b = z - y;

		System.out.println("a" + "->" + a);
		System.out.println("b" + "->" + b);

		if (a < 0) {
			a = a * (-1);
		}
		if (b < 0) {
			b = b * (-1);
		}
		System.out.println("a" + " " + a);
		System.out.println("b" + " " + b);

		if (a > b) {
			return "Cat B";
		} else if (b > a) {
			return "Cat A";
		} else if (b == a) {
			return "Mouse C";
		}
		return null;
	}

}
