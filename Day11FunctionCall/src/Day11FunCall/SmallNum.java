package Day11FunCall;

public class SmallNum {
	public String small(int a,int b,int c) {
		if(b>a&&c>a) {
			return a+" is small";
		}else if(a>b&&c>b) {
			return b+" is small";
		}else {
			return c+" is small";
		}
	}

}
