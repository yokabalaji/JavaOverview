package Oops2;

public class UseCalculation {
	public static void main(String[] args) {
		Calculation cal = new Calculation();
		cal.add(2, 3, 4);
		System.out.println(cal.add(2, 4) + " " + cal.add("yoga", "balaji") + " " + cal.add("bala ", 24));
	}
}
