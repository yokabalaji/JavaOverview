package Oops2;

public class UseCheckStr {
	public static void main(String[] args) {
		CheckMaxStr max = new CheckMaxStr();
		System.out.println(max.findMax(1, 2, 3) + " " + max.findMax("balaji", "yoga", "bharath") + " "
				+ max.findMax("yoga", "bharath") + " " + max.findMax(1, 2));
	}

}
