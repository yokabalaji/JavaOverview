package me;

public class am {
	public static void main(String[] args) {
		int a=24;
		String b="";
		for(int i=0;i<a;i++) {
			if(i>=0  || i<=12) {
			b="am";
			}
			else {
				b="pm";
				
			}
		}
		System.out.println(b);
	}

}
