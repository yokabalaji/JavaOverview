package Oops2;

public class UseCalculator  {
	public static void main(String[] args) {
		Calculator c1=new Calculator();
		System.out.println(c1.add(10,8));
		System.out.println(c1.sub(1011,1326));
		System.out.println(c1.mul(12,12));
		System.out.println(c1.div(12,12));
		Abacus ab=new Calculator();
		System.out.println(ab.add(10,12));
		System.out.println(ab.sub(12,20));
		System.out.println(ab.mul(10,10));
		// System.out.println(ab.div(10,10));
	}

}
