package Lms;

public class UpperCaseOnly {
	public static void main(String[] args) {
		String a[]=args[0].split(",");
		String b[]={a[0],a[1],a[2],a[3]};
		for(int i=0;i<b.length;i++) {
			if(a[i].equals(b[i].toUpperCase())) {
			System.out.println(b[i]);
		}
	}

}}
