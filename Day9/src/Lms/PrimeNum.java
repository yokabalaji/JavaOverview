package Lms;

public class PrimeNum {
	public static void main(String[] args) {
		int num=7;
		boolean a=true;
		for(int i=2;i<num;i++) {
			if(num%2==0) {
				a=false;
			}
			}
			if(a) {
				System.out.println("prime number");
			}else {
				System.out.println("not prime number");
			}
	
		
	}

}
