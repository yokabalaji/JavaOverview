package Errorss;

public class AgeException {
	public static void main(String[] args)throws AgeExceptionn {
		int age=17;
		if(age>=18) {
			System.out.println("eligible");
		}else {
			throw new AgeExceptionn("age less 18");
		}
	}

}
