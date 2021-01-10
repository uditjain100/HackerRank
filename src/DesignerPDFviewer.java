package HackerRanks;

public class DesignerPDFviewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int designerPdfViewer(int[] h, String str) {

		int hei = 0;
		int maxhei = 0;
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			hei = height(h, cc);
			if (maxhei < hei) {
				maxhei = hei;
			}
		}

		int area = maxhei * str.length();
		return area;
	}

}
