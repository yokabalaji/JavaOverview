package Errorss;

public class ExampleStringOutOfBound {
	public static void main(String[] args) {
		String b="onesoft";
		try {
		System.out.println(b.charAt(8));
		}catch(StringIndexOutOfBoundsException sb) {
			System.out.println(sb);
			System.out.println("dont use out of bounds");
		}
		System.out.println(b.charAt(3));
	}

}
