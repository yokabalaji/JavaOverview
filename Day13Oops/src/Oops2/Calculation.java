package Oops2;

public class Calculation {
	public int add(int a, int b) {
		return a + b;
	}

	public String add(String a, String b) {
		return a + b;
	}

	public String add(String a, int b) {
		return a + b;
	}

	public void add(int a, int b, int c) {
		System.out.println("add three " + (a + b + c));
	}

}
