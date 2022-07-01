package Lms;

public class EvenOrOddadd {
	public static void main(String[] args) {
		int num=20;
		int a=0;
		for(int i=0;i<=num;i++) {
			if(i%2==0) {
				continue;
			}
			else {
				
				a=a+i;
			}
		}
		System.out.println(a);
		
	}
}
