package me;

public class EvenAdd {
public static void main(String[] args) {
	int num=12;
	int n=0;
	for(int i=0;i<=num;i=i+2) {
		if(i%2==0) {
			n+=i;
		}
	}
	System.out.println(n);
}
}
