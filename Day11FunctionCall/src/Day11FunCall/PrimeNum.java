package Day11FunCall;

public class PrimeNum {
	public String prime(int a) {
		int b=0;
		for(int i=2;i<a;i++) {
			if(a%2==0) {
				b=1;
			}
		}if(b==0) {
			return a+"is prime";
		}else {
			return a+"is not prime";
		}
	}

}
