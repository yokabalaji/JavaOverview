package Errorss;

public class ExampleThrow {
	public static void main(String[] args) {
		int age=17;
		if(age>=18) {
			System.out.println("eligible");
		}else {
			throw new ArithmeticException("age");
		}
	}

}
