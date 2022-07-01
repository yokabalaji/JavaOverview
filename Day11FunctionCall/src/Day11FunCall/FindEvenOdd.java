package Day11FunCall;

public class FindEvenOdd {
	public String findOddOrEven(int a) {
		if(a%2==0) {
			return a+" is even";
		}else {
			return a+" is odd";
		}
	}
	public static void main(String[] args) {
		FindEvenOdd s=new FindEvenOdd();
		System.out.println(s.findOddOrEven(25));
	}

}
