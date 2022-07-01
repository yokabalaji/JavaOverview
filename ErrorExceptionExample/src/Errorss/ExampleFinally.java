package Errorss;

public class ExampleFinally {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c=0;
		try {
		c=a/b;
		}finally {
		System.out.println("hello");
	}
		System.out.println(c);

}

	}
