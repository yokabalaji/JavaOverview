package Errorss;

public class ExampleOfFinally {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c=0;
		try {
		c=a/b;
		}catch(ArithmeticException ae){
System.out.println(ae);		
		System.out.println("dont use");
	}finally {
		System.out.println("hello");
	}
		System.out.println(c);

}
}
