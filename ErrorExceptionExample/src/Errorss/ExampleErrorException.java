package Errorss;

public class ExampleErrorException {
public static void main(String[] args) {
	System.out.println("good morning");
	int a=10;
	int b=0;
	try {
	int c=a/b;
	System.out.println(c);
	}catch(ArithmeticException ae) {
		System.out.println("dont use divide zero");
		System.out.println(ae);
	}
	System.out.println("hello");
	System.out.println("hi");
}

}
