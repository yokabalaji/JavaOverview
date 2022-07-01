package me;

public class even42 {
	public static void main(String[] args) {
		int num=42;
		for(int i=num;i>=0;i=i-7) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
