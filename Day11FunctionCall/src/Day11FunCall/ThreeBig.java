package Day11FunCall;

public class ThreeBig {
	public String bigs(int a,int b,int c) {
		if(b<a&&c<a) {
			return a+" is big";
		}else if(a<b&&c<b) {
			return b+" is big";
		}else {
			return c+" is big";
		}
	}

}
