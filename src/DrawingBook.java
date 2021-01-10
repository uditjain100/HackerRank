package HackerRanks;

public class DrawingBook {
	public static void main(String[] args) {

		int a = drawingbook(7, 2);
		System.out.println(a);
	}

	public static int drawingbook(int n, int p) {

		// from begining

		int a = p / 2;

		// from last

		int b = 0;

		b = ((n - p) / 2);

		int min = Math.min(a, b);

		return min;

	}
}
