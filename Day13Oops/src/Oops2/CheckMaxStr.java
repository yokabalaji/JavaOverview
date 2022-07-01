package Oops2;

public class CheckMaxStr {
	public String findMax(String a, String b) {
		if (a.length() > b.length()) {
			return a + "is greater";
		} else {
			return b + "is greater";
		}
	}

	public String findMax(int a, int b) {
		if (a > b) {
			return a + "is greter";
		} else {
			return b + "is greter";
		}
	}

	public String findMax(int a, int b, int c) {
		if (a > b && a > c) {
			return a + "is greater";

		} else if (b > c && b > a) {
			return b + "is greater";
		} else {
			return c + "is greater";
		}
	}

	public String findMax(String a, String b, String c) {
		if (a.length() > b.length() && a.length() > c.length()) {
			return a + "is longest";
		} else if (b.length() > a.length() && b.length() > c.length()) {
			return b + "is longest";
		} else {
			return c + "is longest";
		}

	}
}
