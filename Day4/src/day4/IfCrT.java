package day4;

public class IfCrT {
	public static void main(String[] args) {
		int a=50;
		if(a<10000 && a!=50 && a!=100 && a>0) {
			System.out.println("run");
		}
		else if (a==50) {
			System.out.println("half century");
			}
		else if(a==100) {
			System.out.println("century");
		}
		else  {
			System.out.println("invalid");
		}
	}
}
