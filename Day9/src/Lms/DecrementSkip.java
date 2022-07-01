package Lms;

public class DecrementSkip {
public static void main(String[] args) {
	int a=7;
	int b=4;
	for(int i=a;i>=b;i--) {
		if(i==b) {
			break;
		}
		System.out.println(i);
	}
}
}
