package Errorss;

public class ExampleNullPointException {
	public static void main(String[] args) {
		String a=null;
		int b=0;
		try {
			b=a.length();
		}catch(NullPointerException np){
			System.out.println("please dont ask null");
			System.out.println(np);
		}
		System.out.println(b);
		System.out.println("hello");
	}

}
