package Errorss;

public class AgeThrowTryCatch {
	public static void main(String[] args)throws AgeExceptionn {
		int age=17;
		try {
		if(age>=18) {
			System.out.println("eligible");
		}else {
			throw new AgeExceptionn("age less 18");
		}
		}catch(AgeExceptionn ae) {
			System.out.println("age is less 18");
			System.out.println(ae);
			System.out.println(ae.getMessage());
			System.out.println("hi");
		}
	}

}


