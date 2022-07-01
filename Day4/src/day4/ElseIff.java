package day4;

public class ElseIff {
	public static void main(String[] args) {
		int a=60;
		if(a>80) {
			System.out.println("1st class");
		}
		else if(a<=80 && a>60) {
			System.out.println("2nd class");
		}
		else if(a<=60 && a>=40) {
			System.out.println("3rd class");
		}
		else {
			System.out.println("fail");
		}
	}

}
