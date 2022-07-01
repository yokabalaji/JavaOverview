package Errorss;

public class ExapleNumberFoundException {
	public static void main(String[] args) {
		String a="hi";
		int b=0;
		try {
	 b=Integer.parseInt(a);
		}catch(NumberFormatException np) {
		
		System.out.println("dont use");
		System.out.println(np);
		
		}
		System.out.println(b);
		System.out.println("hello");
	}

}
